package staffregistration;

public class staff {
	
	private String name;
	private String email;
	private String nic;
	private String username;
	private String password;
	private String contact;
	public staff(String name, String email, String nic, String username, String password, String contact) {
		
		this.name = name;
		this.email = email;
		this.nic = nic;
		this.username = username;
		this.password = password;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNic() {
		return nic;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getContact() {
		return contact;
	}
	
	
}
