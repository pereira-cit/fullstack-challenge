package com.ciandt.recrutamento.core.perfil;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

public class ObterPerfilUseCase {

    private final PerfilBoundary boundary;

    public ObterPerfilUseCase(PerfilBoundary boundary) {
        this.boundary = boundary;
    }

    public Perfil execute(@Valid @NotEmpty String usuario) {
        return boundary.obterPor(usuario);
    }
}
