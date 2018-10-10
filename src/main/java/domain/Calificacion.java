package domain;

import java.util.Date;

import org.uqbar.commons.model.annotations.Observable;

import Notas.Nota;

@Observable
public class Calificacion {
	
	private int id;
	private Nota value;
	private Date created_at;
	private Date updated_at;
	
	public Calificacion(){
	}
	
	public Calificacion(Nota unaNota) {
		this.value = unaNota;
	}
	
	public String getValue() {
		return value.toString();
	}

	public int getId() {
		return id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}
	
	
	
}
