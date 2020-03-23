package com.ciandt.recrutamento.entrypoint.perfil;

import com.ciandt.recrutamento.core.perfil.ObterPerfilUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
public class PerfilEntrypoint {

    private ObterPerfilUseCase usecase;

    public PerfilEntrypoint(ObterPerfilUseCase usecase) {
        this.usecase = usecase;
    }


    @GetMapping("/{usuario}")
    public PerfilModelOut obterPor(@PathVariable("usuario") String usuario) {
        return PerfilMapper.from(usecase.execute(usuario));
    }

}
