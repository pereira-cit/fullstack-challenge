import { Component, ViewEncapsulation, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Repository } from 'src/app/models/repoistory.model';
import { Profile } from 'src/app/models/profile.model';
import { ProfileService } from 'src/app/services/profile.service';
import { RepoService } from 'src/app/services/repo.service';

@Component({
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  encapsulation: ViewEncapsulation.None
})

export class HomeComponent implements OnInit{

  @Input()
  search: string;

  profiles: Profile[] = new Array();

  constructor(
    private profileService: ProfileService,
    private repoService: RepoService) { }

  ngOnInit(): void {
    console.log('HomeComponent - init');

    // this.profiles.push({
    //   avatar: 'https://avatars3.githubusercontent.com/u/139426?v=4',
    //   nome: 'Angular',
    //   bio: '',
    //   url: 'https://github.com/angular',
    //   repositories: [
    //     {
    //       name: 'angular/angular',
    //       description: 'One framework. Mobile & desktop.',
    //       isPrivate: false,
    //       url: 'https://github.com/angular/angular'
    //     } as Repository,
    //     {
    //       name: 'angular/angular-carousel',
    //       description: 'ng-carousel directive',
    //       isPrivate: false,
    //       url: 'https://github.com/angular/angular-carousel'
    //     } as Repository
    //   ]
    // } as Profile);

  }

  updateProfiles(profile: Profile) {
    this.profiles.push(profile as Profile)
  }

  getRepos(search: string): Repository[] {
    var repos: Repository[] = new Array();
    var newRepo: Repository;
    this.repoService.getRepos(search)
      .subscribe(
        data => {
          data.forEach(repo => {
            newRepo = new Repository();
            newRepo.name = repo.name;
            newRepo.description = repo.description;
            newRepo.isPrivate = repo._private;
            newRepo.url = repo.htmlUrl;
            repos.push(newRepo)
          });
          console.log(data);
        }, error => console.log(error));

    return repos;
  }

  getUser(search: string) {
    var profile: Profile = new Profile();
    this.profileService.getUser(search)
      .subscribe(
        data => {
          profile.avatar = data.avatarUrl;
          profile.nome = data.name;
          profile.bio = data.bio;
          profile.url = data.htmlUrl;
          profile.repositories = this.getRepos(search);
          this.updateProfiles(profile);
        }, error => console.log(error));
  }

  onSubmit(data: NgForm) {
    console.log('Informações do NgForm: ', data);
    if(this.search != null)
      this.getUser(this.search);
  }
}

