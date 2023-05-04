package org.controller.persona;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.modelo.persona.Persona;
import org.dao.persona.DaoPersona;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerPersona implements Serializable{
	private List<Persona> listPersonas;
	private Persona persona;
	
	public ControllerPersona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Persona> getListPersonas() {
		DaoPersona dao= new DaoPersona();
		listPersonas=dao.ListPersona();
		return listPersonas;
	}
	public void setListPersonas(List<Persona> listPersonas) {
		this.listPersonas = listPersonas;
	}


	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	
	public void limpiarPersona() {
		persona=new Persona();
	}
	
	public String agregarPersona() {
		DaoPersona dao= new DaoPersona();
		dao.addPersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String modificarPersona() {
		DaoPersona dao = new DaoPersona();
		dao.updatePersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}

	public String eliminarPersona() {
		DaoPersona dao = new DaoPersona();
		dao.deletePersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}

		
}
