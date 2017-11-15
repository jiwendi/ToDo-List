
public class View {
	
	
	
	
	public void begin() {
		
		System.out.println("_____________________________________________________________________________________");
		System.out.println("                 WELCOME TO NOTEFOX TODO LIST & Diary Application\n\t\t\t Createtd By Joy Iwendi");
		System.out.println("_____________________________________________________________________________________");
		System.out.println("_____________________________________________________________________________________");
		
		System.out.println("		>Press 1 to LOGIN IN\n\t\t>Not registered? Press 2 to CREATE ACCOUNT");
		System.out.println("_____________________________________________________________________________________");
	}
		
	
	public void loggedIn() {
		
		System.out.println("_____________________________________________________________________________________");
		System.out.println("_____________________________________________________________________________________");
		System.out.println("					WHAT WOULD YOU LIKE TO DO?\n");
		
		System.out.println("		>Press 1 to ADD TASK\n\t\t>Press 2 VIEW SAVED TASKS\n\t\t>Press 3 to REMOVE A TASK\n\t\t>Press 3 to EDIT A TASK");
		System.out.println("_____________________________________________________________________________________");
	}
	
	//This method registers a new user and takes them to the add task option after successful account creation
	public void accountCreation() {
		
		ControllerU user = new ControllerU();
		 user.registerUser();
		 loggedIn();
		
		 /*ControllerT newTask = new ControllerT();
		 newTask.addTask();*/
		 

	
	
	}
}	

