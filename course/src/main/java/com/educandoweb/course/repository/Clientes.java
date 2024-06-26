package com.educandoweb.course.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Cliente;

@Repository
public class Clientes {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT = "insert into cliente (nome) values (?)";
	private static String UPDATE ="update cliente set nome = ? where id = ?";
	private static String SELECT_ALL = "select * from cliente";
	private static String DELETE = "delete from cliente where id =?";
	
	
	public Cliente salvar(Cliente cliente) {
		jdbcTemplate.update(INSERT, new Object[] {cliente.getNome()});
		return cliente;
	}
	
	public Cliente atualizar(Cliente cliente) {
		jdbcTemplate.update(UPDATE, new Object[] {cliente.getNome(), cliente.getId()});
		return cliente;
	}
	
	public void deletar(Integer id) {
		jdbcTemplate.update(DELETE, new Object[] {id});
		System.out.println("Cliente com id: "+ id + " foi deletado!");
	}
	
    public List<Cliente> obterTodos(){
        return jdbcTemplate.query(SELECT_ALL, obterClienteMapper());
    }
    
    public List<Cliente> buscarPorNome(String nome){
        return jdbcTemplate.query(
                SELECT_ALL.concat(" where nome like ? "),
                new Object[]{"%" + nome + "%"},
                obterClienteMapper());
    }

    private RowMapper<Cliente> obterClienteMapper() {
        return new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                return new Cliente(id, nome);
            }
        };
	}

}
