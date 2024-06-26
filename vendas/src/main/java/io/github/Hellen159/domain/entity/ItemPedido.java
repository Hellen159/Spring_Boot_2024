package io.github.Hellen159.domain.entity;

public class ItemPedido {
	private Integer id;
	private Integer quantidade;
	private Pedido pedido;
	private Produto produto;
	
	public ItemPedido(Integer id, Integer quantidade, Pedido pedido, Produto produto) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produto = produto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
