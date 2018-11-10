package Web;

import spark.Spark;

public class Server {
	
	public static void main(String[] args) {
		
		Spark.port(9000);
		Router.configure();
	}

}
