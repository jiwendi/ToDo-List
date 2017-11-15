
public class Register {
		private String userName;
	private String password;
	
	
	
	public Register() {
		
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}
 
	public String toString() {
				
		return "Your login details are: " + userName + password;
	}


	public void setPassword(String password) {
		this.password = password;
	}




}
