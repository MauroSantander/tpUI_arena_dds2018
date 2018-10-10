package domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.research.ws.wadl.Response;

import Notas.Nota;

public class AlumnoService {
    private static final String API_NOTITAS = "http://notitas.herokuapp.com";
    private Client client;
	private String bearerToken;
	
	
	public AlumnoService(String bearerToken){
		this.bearerToken = bearerToken;
		this.client = Client.create();
	}
	
	public Alumno getAlumno(){
		ClientResponse clientResponse= this.client
        .resource(API_NOTITAS)
        .path("student")
        .header("Authorization", "Bearer " + this.bearerToken)
        .accept(MediaType.APPLICATION_JSON)
        .get(ClientResponse.class);
		
		if(clientResponse.getStatus()==200){
			clientResponse.bufferEntity();
			String jsonString = clientResponse.getEntity(String.class);
			Alumno alumno = new Gson().fromJson(jsonString, Alumno.class);
			return alumno;
		}
		return new Alumno();
	}
	
	public void saveAlumno(Alumno unAlumno) {
		
		String alumnoString = new Gson().toJson(unAlumno);
		System.out.println(alumnoString);
		
		ClientResponse response = this.client
		        .resource(API_NOTITAS)
		        .path("student")
		        .header("Authorization", "Bearer " + this.bearerToken)
		        .accept(MediaType.APPLICATION_JSON)
		        .put(ClientResponse.class, new Gson().toJson(unAlumno));
		
		
		System.out.println("El codigo es: ");
		System.out.println(response.getStatus());
	}
	
	public Tarea[] getNotas() {
		ClientResponse clientResponse= this.client
		        .resource(API_NOTITAS)
		        .path("assignments")
		        .header("Authorization", "Bearer " + this.bearerToken)
		        .accept(MediaType.APPLICATION_JSON)
		        .get(ClientResponse.class);
				
				if(clientResponse.getStatus()==200){
					clientResponse.bufferEntity();
					String jsonString = clientResponse.getEntity(String.class);
					
					Tarea[] unaTarea = new Gson().fromJson(jsonString, Tarea[].class);
					return unaTarea;
				}

				Tarea[] unaLista = null;
				return unaLista; 
	}

}
