package domain;

import org.uqbar.commons.model.annotations.Observable;

@Observable

public class Alumno {
	
	String nombre;
	String apellido;
	String usuarioGitHub;
	int legajo; //seguramente cambie
	
	public Alumno(String unNombre, String unApellido, int unLegajo, String unUsuario) {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.legajo = unLegajo;
		this.usuarioGitHub = unUsuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuarioGitHub() {
		return usuarioGitHub;
	}
	public void setUsuarioGitHub(String usuarioGitHub) {
		this.usuarioGitHub = usuarioGitHub;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

}
