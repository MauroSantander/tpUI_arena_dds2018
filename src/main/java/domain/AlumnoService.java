package domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;

import org.json4s.JsonAST.JArray;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.research.ws.wadl.Response;

public class AlumnoService {
    private static final String API_NOTITAS = "http://localhost:9000";
    private Client client;
	private String bearerToken =  this.generarToken();
	
	
	public String generarToken() {
		String secret = "god";
		Algorithm algorithm = Algorithm.HMAC256(secret);
		String token = JWT.create()
		    .withClaim("user", 1)
		    .sign(algorithm);
		
		return token;
	}
	
	
	public AlumnoService(String bearerToken){
		//this.bearerToken = bearerToken;
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
	
	public List<Tarea> getNotas() {
		ClientResponse clientResponse= this.client
		        .resource(API_NOTITAS)
		        .path("student/assignments")
		        .header("Authorization", "Bearer " + this.bearerToken)
		        .accept(MediaType.APPLICATION_JSON)
		        .get(ClientResponse.class);
				
				if(clientResponse.getStatus()==200){
					clientResponse.bufferEntity();
					String jsonString = clientResponse.getEntity(String.class);
					JsonParser parser = new JsonParser();
					
					JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();
					JsonArray tareasArray = jsonObject.getAsJsonArray("assignments");
					
					List<Tarea> tareas = new ArrayList<Tarea>();
					
					for (JsonElement s : tareasArray) {
						
						Tarea t = new Tarea();
						
			            JsonObject sObj = s.getAsJsonObject();
			            t.setId(sObj.get("id").getAsInt());
			            t.setTitle(sObj.get("title").getAsString());
			            t.setDescription(sObj.get("description").getAsString());

			            JsonArray grades = sObj.get("grades").getAsJsonArray();
			            List<Calificacion> listCalificaciones = new ArrayList<Calificacion>();
			            for (JsonElement g : grades) {
			            	Calificacion c = new Calificacion();
			            	c.setId(g.getAsJsonObject().get("id").getAsInt());
			            	c.setValue(g.getAsJsonObject().get("value").getAsString());
			                listCalificaciones.add(c);
			                t.setTitle((sObj.get("title").getAsString() + " - " + c.getId()));
			                t.setValue(c.getValue());
			                tareas.add(t);
			            }
			            
			            t.setGrades(listCalificaciones);

			        }
					
					return tareas;

				}
				return new ArrayList<Tarea>();
	}

}
