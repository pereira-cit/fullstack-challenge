package com.ciandt.recrutamento.configuracao;

import com.ciandt.recrutamento.core.perfil.ObterPerfilUseCase;
import com.ciandt.recrutamento.core.perfil.PerfilBoundary;
import com.ciandt.recrutamento.core.repo.ObterReposUseCase;
import com.ciandt.recrutamento.core.repo.RepositorioBoundary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguracao {

    @Bean
    ObterPerfilUseCase obterPerfilUsuarioUseCase(PerfilBoundary boundary) {
        return new ObterPerfilUseCase(boundary);
    }

    @Bean
    ObterReposUseCase obterReposUsuarioUseCase(RepositorioBoundary boundary) { return new ObterReposUseCase(boundary); }
}
