package com.ciandt.recrutamento.dataprovider;

import com.ciandt.recrutamento.core.repo.Repositorio;
import com.ciandt.recrutamento.dataprovider.restful.github.Repo;

public class RepositorioMapper {

    public static Repositorio from(Repo repo) {
        Repositorio model = new Repositorio();
        model.setId(repo.getId());
        model.setName(repo.getName());
        model.setDescription(repo.getDescription());
        model.setHtmlUrl(repo.getHtmlUrl());
        model.setStargazersCount(repo.getStargazersCount());
        model.setisPrivate(repo.isisPrivate());
        return model;
    }

}
