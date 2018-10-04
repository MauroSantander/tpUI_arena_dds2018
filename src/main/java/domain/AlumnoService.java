package domain;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class AlumnoService {
	
//	 private static final String API_NOTITAS = "http://notitas.herokuapp.com";
	    private Client client;
		private String bearerToken;
		
		public AlumnoService(String bearerToken){
			this.bearerToken = bearerToken;
			this.client = Client.create();
		}
		
		public Alumno getAlumno(){
			WebResource webResource = client
					   .resource("http://notitas.herokuapp.com");			
			
			webResource.header("Authorization", bearerToken);
			
			webResource.path("student");
			
			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);
			
			
			if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
				}

			String output = response.getEntity(String.class);
			
			Alumno alumno = new Gson().fromJson(output, Alumno.class);
			return alumno;
			
//			ClientResponse clientResponse= this.client
//	        .resource(API_NOTITAS)
//	        .path("student")
//	        .header("Authorization", "Bearer " + this.bearerToken)
//	        .accept(MediaType.APPLICATION_JSON)
//	        .get(ClientResponse.class);
//			
//			if(clientResponse.getStatus()==200){
//				clientResponse.bufferEntity();
//				String jsonString = clientResponse.getEntity(String.class);
//				Alumno alumno = new Gson().fromJson(jsonString, Alumno.class);
//				return alumno;
//			}
//			else { throw new RuntimeException("Failed : HTTP error code : "
//						+ clientResponse.getStatus());
//			}
									
		}
}
