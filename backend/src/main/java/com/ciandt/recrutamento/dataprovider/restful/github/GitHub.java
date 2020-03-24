package com.ciandt.recrutamento.dataprovider.restful.github;

import com.ciandt.recrutamento.configuracao.FeignClientConfiguracao;
import com.ciandt.recrutamento.core.repo.Repositorio;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.ArrayList;

@FeignClient(value = "github",
        url = "https://api.github.com/",
        configuration = FeignClientConfiguracao.class)
public interface GitHub {

    @RequestLine("GET /users/{usuario}")
    Profile obterPor(@Param("usuario") String usuario);

    @RequestLine("GET /users/{username}/repos")
    Repo[] obterReposPor(@Param("username") String username);

}
