package io.github.Hellen159.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.Hellen159.model.Cliente;
import io.github.Hellen159.repository.ClientesRepository;

@Service
public class ClientesService {
	
	private ClientesRepository repository;
	
	@Autowired
	public ClientesService (ClientesRepository repository) {
		this.repository = repository;
	}
	
	public void salvarCliente(Cliente cliente){
		//chama validacoes e chama a camada de repository
		validarCliente(cliente);
		this.repository.persistir(cliente);
		
	}
	
	public void validarCliente(Cliente cliente) {
		//aplica validacoes
	}

}
