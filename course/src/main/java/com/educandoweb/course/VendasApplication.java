package com.educandoweb.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.educandoweb.course.entities.Cliente;
import com.educandoweb.course.repository.Clientes;

@SpringBootApplication
public class VendasApplication {
	
	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args ->{
			clientes.salvar(new Cliente (null,"hellen"));
			clientes.salvar(new Cliente (null,"pedro"));
			
			List<Cliente> todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);
			
			System.out.println("Atualizando clientes");
			todosClientes.forEach( c ->{
				c.setNome(c.getNome() + " atualizado !");
				clientes.atualizar(c);
			});
			clientes.buscarPorNome("hell").forEach(System.out::println);
			
//			todosClientes.forEach( c ->{
//				clientes.deletar(c.getId());
//			});
//			todosClientes = clientes.obterTodos();
//			todosClientes.forEach(System.out::println);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
