package com.ciandt.recrutamento.dataprovider;

import com.ciandt.recrutamento.core.repo.Repositorio;
import com.ciandt.recrutamento.core.repo.RepositorioBoundary;
import com.ciandt.recrutamento.dataprovider.restful.github.GitHub;
import com.ciandt.recrutamento.dataprovider.restful.github.Repo;

import java.util.ArrayList;

public class RepositorioGateway implements RepositorioBoundary {
    private GitHub cliente;

    public RepositorioGateway(GitHub cliente) {
        this.cliente = cliente;
    }

    @Override
    public ArrayList<Repositorio> obterPor(String usuario) {
        Repo[] repos = cliente.obterReposPor(usuario);
        ArrayList<Repositorio> repositorios = new ArrayList<>();

        for(Repo repo: repos) {
            repositorios.add(RepositorioMapper.from(repo));
        }

        return repositorios;
    }
}
