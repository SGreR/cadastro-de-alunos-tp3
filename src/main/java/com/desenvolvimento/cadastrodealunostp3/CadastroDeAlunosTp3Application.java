package com.desenvolvimento.cadastrodealunostp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CadastroDeAlunosTp3Application {

    public static void main(String[] args) {
        SpringApplication.run(CadastroDeAlunosTp3Application.class, args);
    }

}
