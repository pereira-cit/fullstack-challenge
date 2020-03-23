import { Repository } from './repoistory.model';

export interface Profile {
  avatar: string;
  nome: string;
  bio: string;
  url: string;
  repositories: Repository[];
}
