package classes_metier;

public class Client {

	protected String name;
	protected String password;
	protected int id;
			
	public Client(String name, String password) {
		
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int i) {
		this.id=i;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate() {
		if (name.equals("jovan")  && password.equals("jovan")) {
			return true;
		} else {
			return false;
		}
	}
}	
	

