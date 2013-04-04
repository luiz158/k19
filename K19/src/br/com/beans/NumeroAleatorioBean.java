package br.com.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NumeroAleatorioBean {

	private int maximo;
	private int numeroAleatorio;
	private String nome;
	
	public String geraNumeroAleatorio () {
		this.numeroAleatorio = ( int ) ( Math . random () * this.maximo );
	 return "resposta";
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
