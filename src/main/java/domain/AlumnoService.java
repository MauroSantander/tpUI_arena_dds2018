package domain;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class AlumnoService {
	
	 private static final String API_NOTITAS = "http://notitas.herokuapp.com";
	    private Client client;
		private String bearerToken;
		
		
		public AlumnoService(String bearerToken){
			this.bearerToken = bearerToken;
			this.client = Client.create();
		}
		
		public Alumno getStudent(){
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

}
