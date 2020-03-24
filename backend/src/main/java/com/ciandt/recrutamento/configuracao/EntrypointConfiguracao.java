package com.ciandt.recrutamento.configuracao;

import com.ciandt.recrutamento.core.perfil.ObterPerfilUseCase;
import com.ciandt.recrutamento.core.repo.ObterReposUseCase;
import com.ciandt.recrutamento.entrypoint.perfil.PerfilEntrypoint;
import com.ciandt.recrutamento.entrypoint.repo.RepositorioEntrypoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntrypointConfiguracao {

    @Bean
    PerfilEntrypoint perfilEntrypoint(ObterPerfilUseCase useCase) {
        return new PerfilEntrypoint(useCase);
    }

    @Bean
    RepositorioEntrypoint repositorioEntrypoint(ObterReposUseCase useCase) { return new RepositorioEntrypoint(useCase); }

}
