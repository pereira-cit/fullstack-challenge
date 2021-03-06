package com.ciandt.recrutamento.configuracao;

import com.ciandt.recrutamento.core.perfil.PerfilBoundary;
import com.ciandt.recrutamento.core.repo.RepositorioBoundary;
import com.ciandt.recrutamento.dataprovider.PerfilGateway;
import com.ciandt.recrutamento.dataprovider.RepositorioGateway;
import com.ciandt.recrutamento.dataprovider.restful.github.GitHub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataproviderConfiguracao {

    @Bean
    PerfilBoundary perfilUsuarioBoundary(GitHub client) {
        return new PerfilGateway(client);
    }

    @Bean
    RepositorioBoundary repositorioUsuarioBoundary(GitHub client) {
        return new RepositorioGateway(client);
    }
}
