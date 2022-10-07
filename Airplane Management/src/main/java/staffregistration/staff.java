package staffregistration;

public class staff {
	
	private int id;
	private String name;
	private String email;
	private String nic;
	private String username;
	private String password;
	private String repeatpassword;
	private String contact;
	public staff(int id, String name, String email, String nic, String username, String password,String repeatpassword, String contact) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.nic = nic;
		this.username = username;
		this.password = password;
		this.repeatpassword = repeatpassword;
		this.contact = contact;
	}
	public int getID() {
		return id;
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
	public String getRepeatPassword() {
		return repeatpassword;
	}
	
	public String getContact() {
		return contact;
	}
	
	
}
