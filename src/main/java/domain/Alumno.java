package domain;

import org.uqbar.commons.model.annotations.Observable;

@Observable

public class Alumno {

	String first_name;
	String last_name;
	String github_user;
	int code; // seguramente cambie

	public Alumno(String unNombre, String unApellido, int unLegajo, String unUsuario) {
//		if (((Integer)unLegajo).toString().length() != 7)
//			throw new LegajoInvalidoException();
//el if de arriba era una validacion para el tamaño del legajo que se ingresa
		this.first_name = unNombre;
		this.last_name = unApellido;
		this.code = unLegajo;
		this.github_user = unUsuario;
	}
	public Alumno() {
		
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGithub_user() {
		return github_user;
	}
	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	
	

}
