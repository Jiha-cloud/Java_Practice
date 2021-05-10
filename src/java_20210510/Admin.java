package java_20210510;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	public Admin() {
		
	}
	public Admin(String id, String pwd, String email) {
		this(id,pwd,email,0);
	}
	public Admin(String id, String pwd, String email, int level) {
		this.id =id;
		this.pwd = pwd;
		this.email=email;
		this.level=level;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
