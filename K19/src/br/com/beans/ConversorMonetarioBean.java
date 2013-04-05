package br.com.beans;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorMonetarioBean {

	private String de;
	private String para;
	private String valor;
	private Double resultado;
	private Map<String, Double> taxas = new LinkedHashMap<String, Double>();
	
	public ConversorMonetarioBean(){
		this.taxas.put ("Real", 1.0) ;
		this.taxas.put ("Euro", 3.33) ;
		this.taxas.put ("Peso argentino", 0.42) ;
		this.taxas.put ("Dolar americano", 2.04) ;
	}
	
	public String getDe() {
		return de;
	}
	
	public void setDe(String de) {
		this.de = de;
	}
	
	public String getPara() {
		return para;
	}
	
	public void setPara(String para) {
		this.para = para;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public Double getResultado() {
		return resultado;
	}
	
	public void converte() {
		BigDecimal valor;
		try {
			valor = new BigDecimal(this.valor.replace(",", "."));
		} catch (Exception e) {
			valor = BigDecimal.ZERO;
		}
		
		this.resultado = valor.doubleValue() * this.taxas.get(this.de)/this.taxas.get(this.para);
	}
	
	public Map<String, Double> getTaxas() {
		return taxas;
	}
	
	public void setTaxas(Map<String, Double> taxas) {
		this.taxas = taxas;
	}
	
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
}
