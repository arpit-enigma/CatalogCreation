package cbre;
//11995657   shadi  s srivastava sanyukta 89 born

import java.util.List;

public class CatalogPOJO {

	private String apiVersion;
    private String kind;
    private String tags;
	
	    public CatalogPOJO(String apiVersion, String kind, String tags) {
	        this.apiVersion = apiVersion;
	        this.kind = kind;
	        this.tags = tags;
	    }

	    // Without a default constructor, Jackson will throw an exception
	    public CatalogPOJO() {}

	    public String getApiVersion() {
			return apiVersion;
		}

		public void setApiVersion(String apiVersion) {
			this.apiVersion = apiVersion;
		}

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getTags() {
			return tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

	

	    // Getters and setters
	    

	    @Override
	    public String toString() {
	        return "\napiVersion: " + apiVersion +
	        		"\nkind: " + kind +
	        		"\ntags: " + tags  + "\n";
}
}
