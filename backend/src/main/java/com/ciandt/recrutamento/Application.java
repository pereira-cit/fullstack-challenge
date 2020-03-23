package com.ciandt.recrutamento;

import com.ciandt.recrutamento.configuracao.ConfiguracaoScanBasePackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackageClasses = ConfiguracaoScanBasePackage.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
