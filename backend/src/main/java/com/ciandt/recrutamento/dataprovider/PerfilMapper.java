package com.ciandt.recrutamento.dataprovider;

import com.ciandt.recrutamento.core.perfil.Perfil;
import com.ciandt.recrutamento.dataprovider.restful.github.Profile;

public class PerfilMapper {

    public static Perfil from(Profile profile) {
        Perfil model = new Perfil();
        model.setAvatarUrl(profile.getAvatarUrl());
        model.setBio(profile.getBio());
        model.setHtmlUrl(profile.getHtmlUrl());
        model.setLogin(profile.getLogin());
        model.setName(profile.getName());
        return model;
    }

}
