package com.ciandt.recrutamento.core.repo;

import com.ciandt.recrutamento.entrypoint.repo.RepositorioModel;

import java.util.ArrayList;

public interface RepositorioBoundary {

    ArrayList<Repositorio> obterPor(String usuario);
}