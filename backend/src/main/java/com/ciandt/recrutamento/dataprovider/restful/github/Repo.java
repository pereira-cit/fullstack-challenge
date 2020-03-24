package com.ciandt.recrutamento.dataprovider.restful.github;

public class Repo {
    private int id;
    private String name;
    private String description;
    private String htmlUrl;
    private int stargazersCount;
    private boolean isPrivate;
    private Profile owner;

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

    public Profile getOwner() {
        return owner;
    }

    public void setOwner(Profile owner) {
        this.owner = owner;
    }
}
