import { Component, ViewEncapsulation, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Repository } from 'src/app/models/repoistory.model';
import { Profile } from 'src/app/models/profile.model';

@Component({
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  encapsulation: ViewEncapsulation.None
})

export class HomeComponent implements OnInit{

  @Input()
  search: string;

  profiles: Profile[] = new Array();

  ngOnInit(): void {
    console.log('HomeComponent - init');

    this.profiles.push({
      avatar: 'https://avatars3.githubusercontent.com/u/139426?v=4',
      nome: 'Angular',
      bio: '',
      url: 'https://github.com/angular',
      repositories: [
        {
          name: 'angular/angular',
          description: 'One framework. Mobile & desktop.',
          isPrivate: false,
          url: 'https://github.com/angular/angular'
        } as Repository,
        {
          name: 'angular/angular-carousel',
          description: 'ng-carousel directive',
          isPrivate: false,
          url: 'https://github.com/angular/angular-carousel'
        } as Repository
      ]
    } as Profile);

  }

  onSubmit(data: NgForm) {
    console.log('Informações do NgForm: ', data);
  }
}
