package cbre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateCatalogApplication.class, args);
		System.out.println("Microservice to create a skeletal catalog-info.YAML initialized.");
		
		//detect repos and store the relative paths in a hashmap (key : repo ID, values : 
		//		JSON file having all metadata derived via GITAPI call)
		//getNewReposInfo();
		
		//create catalog-info.YAML based on available info.
		CreateCatalogYAML createCatalogYAML = new CreateCatalogYAML();
		createCatalogYAML.createCatalogYAML();
	}

	

}
