import { Component, ViewEncapsulation, Input } from '@angular/core';
import { Profile } from 'src/app/models/profile.model';

@Component({
  selector: 'app-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.scss'],
  encapsulation: ViewEncapsulation.None
})
export class UserProfileComponent {

  @Input()
  profile: Profile;

}
