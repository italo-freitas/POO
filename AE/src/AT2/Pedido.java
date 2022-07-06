package AT2;

import java.nio.file.attribute.FileTime;

public class Pedido {
	int numeroPedido = 30;
	FileTime dataHoraPedido;
	int precoTotal = 100;
	int statusPedido = 1;
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public FileTime getDataHoraPedido() {
		return dataHoraPedido;
	}
	public void setDataHoraPedido(FileTime dataHoraPedido) {
		this.dataHoraPedido = dataHoraPedido;
	}
	public int getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(int precoTotal) {
		this.precoTotal = precoTotal;
	}
	public int getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(int statusPedido) {
		this.statusPedido = statusPedido;
	}
	void inserirPedido() {
		System.out.println("Se deseja inserir pedido digite 1");
		
	}
	
	void excluirPedido() {
		System.out.println("Se deseja inserir pedido digite 2");

		
	}
	
	void consultarPedido() {
		System.out.println("Se deseja inserir pedido digite 3");

	}
	
	void inserirItensPedido() {
		System.out.println("Se deseja inserir pedido digite 4");

	}
		
	void verificarEstoque() {
		System.out.println("Se deseja inserir pedido digite 5");

	}

}
