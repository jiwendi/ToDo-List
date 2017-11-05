import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControllerU {
	private Map<String, String> userData;
	private String filepath = "userdata.txt";
	
	public void registerUser() {
		
		Register user = new Register();
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter desired user name:  ");
		 String name = input.nextLine().toLowerCase().trim();
		 user.setUserName(name);
		 System.out.println("Enter desired password:  ");
		 String pass = input.nextLine().toLowerCase().trim();
		 user.setPassword(pass);
		 
		 userData = new HashMap<>();
		 userData.put(name, pass);
		 		 
		 if(userData !=null) {
			
			 FileWriter fw;
			try {
				fw = new FileWriter(filepath, true);
			
				 BufferedWriter bw = new BufferedWriter(fw);
				 PrintWriter pw = new PrintWriter(bw);
				 pw.println("|"+ userData.get(name) + ", " + userData.get(pass));
					
				 pw.flush();
				 pw.close(); 
			  } catch (IOException e) {
				
				System.out.println("File not found");
		 }
		
	}
		 
		 System.out.println("##################################################");
		 System.out.println("Welcome : Your new login details are: \n\tYour username is :"+userData.get(name) + "\nYour Password is: "+ userData.get(pass));
 }
}
