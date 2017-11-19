
//This class is for setting and getting user name and password
package toDoList;

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
				
		return "Your login details are:\n" + "Username: " + userName + "\nPassword:  " + password;
	}


	public void setPassword(String password) {
		this.password = password;
	}




}
