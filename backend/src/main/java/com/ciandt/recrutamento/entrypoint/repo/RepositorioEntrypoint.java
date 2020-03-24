package com.ciandt.recrutamento.entrypoint.repo;

import com.ciandt.recrutamento.core.repo.ObterReposUseCase;
import com.ciandt.recrutamento.core.repo.Repositorio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/repo")
public class RepositorioEntrypoint {

    private ObterReposUseCase usecase;

    public RepositorioEntrypoint(ObterReposUseCase usecase) {
        this.usecase = usecase;
    }

    @GetMapping("/{usuario}")
    public ArrayList<RepositorioModel> obterPor(@PathVariable("usuario") String usuario) {
        ArrayList<Repositorio> repositorios  = usecase.execute(usuario);
        ArrayList<RepositorioModel> repoModels = new ArrayList<>();

        for (Repositorio repositorio : repositorios) {
            repoModels.add(RepositorioMapper.from(repositorio));
        }

        return repoModels;
    }
}
