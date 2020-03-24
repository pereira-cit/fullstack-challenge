package com.ciandt.recrutamento.core.repo;

import com.ciandt.recrutamento.entrypoint.repo.RepositorioModel;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

public class ObterReposUseCase {

    private final RepositorioBoundary boundary;

    public ObterReposUseCase(RepositorioBoundary boundary) {
        this.boundary = boundary;
    }

    public ArrayList<Repositorio> execute(@Valid @NotEmpty String usuario) {
        return boundary.obterPor(usuario);
    }
}
