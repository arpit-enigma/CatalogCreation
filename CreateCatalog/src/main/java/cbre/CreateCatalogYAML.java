package cbre;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.*;

public class CreateCatalogYAML {
	public void createCatalogYAML() {
		
		//sign into githb with write access
		//create file
		//populate file
		
		// We want to save this Employee in a YAML file
		CatalogPOJO catalogPOJO = new CatalogPOJO("alphaVersion",  "API" , "Python");

//		 ObjectMapper is instantiated just like before
		ObjectMapper om = new ObjectMapper(new YAMLFactory());

		// We write the `employee` into `person2.yaml`
		try {
//			om.writeValue(new File("//src//main//resources//person2.yml"), catalogPOJO);
//			om.writeValue(new File("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-"
//					+ "4-4.6.2.RELEASE\\CreateCatalog\\src\\main\\resources\\person3.yaml"), 
//					catalogPOJO);
			String path =  new File(".").getCanonicalPath();
			om.writeValue(new File(path+"\\src\\main\\resources\\person4.yaml"), 
					catalogPOJO);
		} catch (Exception e) {			
			e.printStackTrace();
		} 
	}
}

//smee would be needed...
