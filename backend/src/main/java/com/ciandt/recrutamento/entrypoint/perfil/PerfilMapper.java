package com.ciandt.recrutamento.entrypoint.perfil;

import com.ciandt.recrutamento.core.perfil.Perfil;

public class PerfilMapper {

    public static PerfilModelOut from(Perfil perfil) {
        PerfilModelOut model = new PerfilModelOut();
        model.setAvatarUrl(perfil.getAvatarUrl());
        model.setBio(perfil.getBio());
        model.setHtmlUrl(perfil.getHtmlUrl());
        model.setLogin(perfil.getLogin());
        model.setName(perfil.getName());
        return model;
    }
}
