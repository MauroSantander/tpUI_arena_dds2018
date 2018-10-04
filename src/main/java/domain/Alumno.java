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

	public void setFirst_name(String nombre) {
		this.first_name = nombre;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String apellido) {
		this.last_name = apellido;
	}

	public String getGithub_user() {
		return github_user;
	}

	public void setGithub_user(String usuarioGitHub) {
		this.github_user = usuarioGitHub;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int legajo) {
		this.code = legajo;
	}

}
