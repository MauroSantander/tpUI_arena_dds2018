package domain;

import java.util.Date;

import org.uqbar.commons.model.annotations.Observable;

//import Notas.String;

@Observable
public class Calificacion {
	
	private int id;
	private String value;
	private Date created_at;
	private Date updated_at;
	
	public Calificacion(){
	}
	
	public Calificacion(String unaNota) {
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
	
	public void setId(int id) {
		this.id = id;
	}

	public void setValue(String string) {
		this.value = string;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
}
