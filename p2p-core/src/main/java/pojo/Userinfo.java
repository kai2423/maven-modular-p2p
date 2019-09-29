package pojo;

public class Userinfo {
	
	private String id;
	private String version;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Userinfo [id=" + id + ", version=" + version + "]";
	}
	
	

}
