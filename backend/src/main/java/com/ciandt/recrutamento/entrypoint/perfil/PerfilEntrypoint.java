package com.ciandt.recrutamento.entrypoint.perfil;

import com.ciandt.recrutamento.core.perfil.ObterPerfilUseCase;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
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
