package com.ciandt.recrutamento.dataprovider.restful.github;

import com.ciandt.recrutamento.configuracao.FeignClientConfiguracao;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "github",
        url = "https://api.github.com/",
        configuration = FeignClientConfiguracao.class)
public interface GitHub {

    @RequestLine("GET /users/{usuario}")
    Profile obterPor(@Param("usuario") String usuario);

}
