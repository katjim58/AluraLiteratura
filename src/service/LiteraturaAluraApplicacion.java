package com.hmskathia.challenger.alura.literatura.dto;

import com.hmskathia.challenger.alura.literatura.dto.principal.MenuPrincipal;
import com.hmskathia.challenger.alura.literatura.dto.repositorio.AutorRepository;
import com.hmskathia.challenger.alura.literatura.dto.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        MenuPrincipal menuPrincipal = new MenuPrincipal(libroRepository, autorRepository);
        menuPrincipal.muestraElMenu();
    }

}