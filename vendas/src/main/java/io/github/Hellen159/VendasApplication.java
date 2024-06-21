package io.github.Hellen159;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.Hellen159.domain.entity.Cliente;
import io.github.Hellen159.domain.repository.Clientes;

@SpringBootApplication
public class VendasApplication {
	
	@Bean
	public CommandLineRunner testandoH2(@Autowired Clientes clientes) {
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Hellen");
			clientes.salvar(cliente);
		};
	}
	
	
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
