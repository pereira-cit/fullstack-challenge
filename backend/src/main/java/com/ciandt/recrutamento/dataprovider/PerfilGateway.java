package com.ciandt.recrutamento.dataprovider;

import com.ciandt.recrutamento.core.perfil.Perfil;
import com.ciandt.recrutamento.core.perfil.PerfilBoundary;
import com.ciandt.recrutamento.dataprovider.restful.github.GitHub;

public class PerfilGateway implements PerfilBoundary {

    private GitHub cliente;

    public PerfilGateway(GitHub cliente) {
        this.cliente = cliente;
    }

    @Override
    public Perfil obterPor(String usuario) {
        return PerfilMapper.from(cliente.obterPor(usuario));
    }
}
