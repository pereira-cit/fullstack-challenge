package com.ciandt.recrutamento.entrypoint.repo;

import com.ciandt.recrutamento.core.perfil.Perfil;
import com.ciandt.recrutamento.dataprovider.restful.github.Profile;
import com.ciandt.recrutamento.entrypoint.perfil.PerfilModelOut;

public class RepositorioModel {
    private int id;
    private String name;
    private String description;
    private String htmlUrl;
    private int stargazersCount;
    private boolean isPrivate;
    private PerfilModelOut owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public boolean isisPrivate() {
        return isPrivate;
    }

    public void setisPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public PerfilModelOut getOwner() {
        return owner;
    }

    public void setOwner(PerfilModelOut owner) {
        this.owner = owner;
    }
}
