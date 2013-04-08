package br.com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.modelo.Curso;

@ManagedBean
@SessionScoped
public class CursosBean {
	private List<Curso> cursos = new ArrayList<Curso>();
	private Curso curso = new Curso();

	public void adicionaCurso(){
		if(this.curso.getNome().isEmpty() || this.curso.getSigla().isEmpty()){
			FacesMessage mensagem = new FacesMessage("Preencha os dados corretamente");
			FacesContext.getCurrentInstance().addMessage(null , mensagem );
			return;
		}
		this.cursos.add(this.curso);
		
		FacesMessage mensagem = new FacesMessage("O curso "+this.curso.getNome()+" foi adicionado com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null , mensagem );
		
		this.curso = new Curso();
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
