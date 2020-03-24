package com.ciandt.recrutamento.entrypoint.repo;

import com.ciandt.recrutamento.core.repo.Repositorio;

public class RepositorioMapper {
    public static RepositorioModel from (Repositorio repositorio) {
        RepositorioModel repositorioModel = new RepositorioModel();
        repositorioModel.setId(repositorio.getId());
        repositorioModel.setName(repositorio.getName());
        repositorioModel.setDescription(repositorio.getDescription());
        repositorioModel.setHtmlUrl(repositorio.getHtmlUrl());
        repositorioModel.setStargazersCount(repositorio.getStargazersCount());
        repositorioModel.setisPrivate(repositorio.isisPrivate());
        return repositorioModel;
    }

}
