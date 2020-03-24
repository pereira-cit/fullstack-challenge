import { Repository } from './repoistory.model';

export class Profile {
  avatar: string;
  nome: string;
  bio: string;
  url: string;
  repositories: Repository[];
}
