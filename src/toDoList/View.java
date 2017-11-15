//This class represents the user interface , with main menu options with calls to the user controller or task controller class.
package toDoList;
import java.util.Scanner;

public class View {
	private static Scanner input = new Scanner(System.in);
	ControllerU user = new ControllerU();
	ControllerT taskController = new ControllerT();
	
	
	public void begin() {
		
		System.out.println("_____________________________________________________________________________________");
		System.out.println("                 WELCOME TO NOTEFOX TODO LIST & Diary Application\n\t\t\t Createtd By Joy Iwendi");
		System.out.println("_____________________________________________________________________________________");
		System.out.println("_____________________________________________________________________________________");
		System.out.println("_____________________________________________________________________________________");
		
		System.out.println("                          Press 1 to LOGIN IN\n\t\tNot registered? Press 2 to CREATE ACCOUNT");
		
		
				
		
		int choice = input.nextInt();
				
				switch(choice){
					
					case 1 :
						user.verifyLogin();
							break;
					case 2 :
							user.add();
							break;
					default:
						System.out.println("Try again. Choose a valid number");
				}
		
		
	}
		
	
	public void loggedIn() {
			
		System.out.println("_____________________________________________________________________________________");
		System.out.println("					WHAT WOULD YOU LIKE TO DO?\n");
		
		System.out.println("What would you like to do?\n\n 1 = ADD A TASK\n2 = REMOVE A TASK\n3 = SEARCH FOR A TASK\n4 = DISPLAY ALL TASKS\n5 = Status of tasks\n6 = Display all users\n7 = Remove a user\n8 = EXIT\n---------------------\n\t");
		
		
		int  choice = input.nextInt();
	
		
				switch(choice){
					
				case 1 :
					taskController.add();
					break;
				case 2 :
			try {
				taskController.remove();
			} catch (Exception e) {
				System.out.println("Could not read data");
			}
					break;
				case 3 :	
					taskController.search();
					break;
				case 4 :
			try {
				taskController.display();
			} catch (Exception e) {
				System.out.println("File not found");
			}
					break;
				case 5:
					taskController.taskStatus();
					break;
				case 6:
					user.display();
					break;
				case 7:
					user.remove();
					break;
				case 8 :
					System.out.println("Goodbye !!");
					System.exit(0);
					break;
				
				default :
					System.out.println("Try again. Choose a valid number");
			}
							
				}
					

	}
			
				
				
			

	
	
	
	
	
	

