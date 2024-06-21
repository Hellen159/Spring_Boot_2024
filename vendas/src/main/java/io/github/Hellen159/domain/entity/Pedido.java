package io.github.Hellen159.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
	private Integer id;
	private Integer cliente_id;
	private LocalDate data_pedido;
	private BigDecimal total;
	
	public Pedido(Integer id, Integer cliente_id, LocalDate data_pedido, BigDecimal total) {
		super();
		this.id = id;
		this.cliente_id = cliente_id;
		this.data_pedido = data_pedido;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public LocalDate getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(LocalDate data_pedido) {
		this.data_pedido = data_pedido;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
