package io.github.Hellen159.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import io.github.Hellen159.domain.entity.Cliente;

@Repository
public class Clientes {
	
	private static String INSERT = "insert into cliente (nome) values (?)";
	
	private static String SELECT_ALL = "select * from cliente";

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Cliente salvar (Cliente cliente) {
		jdbcTemplate .update(INSERT, new Object[] {cliente.getNome()});
		return cliente;
	}
	



	
}
