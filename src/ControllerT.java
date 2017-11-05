import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.text.WordUtils;

public class ControllerT {
	
	private static String filepath = "task.txt";
	private  List<Task> tasks = new ArrayList<>();
	private List<String> savedTasks = new LinkedList<String>();
	private Scanner input;
	private FileWriter fw;
	private BufferedWriter bw;
	private PrintWriter pw;
	
	public ControllerT(){}
	
	
	
	public void addTask(){ 
				
		Task myTasks = new Task();
		input = new Scanner(System.in);
		 
		System.out.println("Add a task TITLE:\n");
		 String title = input.nextLine().toUpperCase().trim();
		 myTasks.setTitle(title);
		 System.out.println("Add a DESCRIPTION:\n");
		 String desc = input.nextLine().toLowerCase().trim();
		 myTasks.setDescription(desc);
		 System.out.println("Set a PRIORITY: LOW, MEDIUM, HIGH: \n");
		 String priority = input.nextLine().toUpperCase().trim();
		 myTasks.setPriority(priority);
		 	
		 tasks.add(myTasks);
				
		
		try {
			if(myTasks !=null) {
			
				fw = new FileWriter(filepath, true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
			
				
				 pw.println(myTasks.getTitle() + "|" + "Description:         " + myTasks.getDescription() + "|"  + "Priority: " + myTasks.getPriority() + "\n");
				 pw.flush();
				 pw.close();
				 
			}
				 
			}catch (IOException e) {
				
				System.out.println("No task added");
			}
		
			System.out.println("|Task added !! \n| " + "The Task title: " + myTasks.getTitle().toString()+ "\n" + "|Description: " + myTasks.getDescription() +"\n" + "Priority: " + myTasks.getPriority()+"\n" );
			taskOptions();
		
}



	public void savedTasks() throws IOException {
		
			System.out.println("              Your To Do List !!");
			    
		try {
			
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(filepath));
			String line;
			
			while ((line = reader.readLine()) != null) {
				
				this.savedTasks.add(line);
			}
				savedTasks.forEach(System.out::println);
				reader.close();
				
			} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		}
	}

	public void removeTask() throws IOException {
		
		savedTasks();
		 
		System.out.println("_________________________________________________________________________________");
		System.out.println("_________________________________________________________________________________");
		System.out.println("What No task will you remove.   \n" );
		 
		input= new Scanner(System.in);
		int index = input.nextInt();
		savedTasks.remove(index);
		savedTasks.forEach(System.out::println);
		
  }
	
         
		
	public void taskOptions() {
		
		input= new Scanner(System.in);
		View view = new View();
		String n = null;
		System.out.println("Do you want to add anoter task? Y = yes, N = no \n");
		String choice = input.nextLine().trim().toLowerCase();
		 if( (choice.equalsIgnoreCase("y"))) {
			 
					addTask();
					
			} else if (choice.equals("n")) {
				
				view.loggedIn();
			}else {
				 
				view.loggedIn();
			}
	}
	public void searchTasks() {
		
		String title = " "; String description = " "; String priority = " ";
		System.out.println("Enter Task title: ");
		Scanner inputu = new Scanner(System.in);
		String term = inputu.nextLine().trim().toUpperCase();
		boolean found = false;
		
		
				try {
					 input= new Scanner(new File(filepath));
				
				     input.useDelimiter("[|\n]");
				
				  																
					while(input.hasNext() && !found){
						
						title = input.next();
						description = input.next();
						priority = input.next();
					
						if(title.contains(term) ){
					
					    found = true;
					   }
				 		
					}
						if (found) {
							

						    System.out.print(title + ",     |" + description + ",     |" + priority + "\n");
				 		}
						else {
							System.out.print("Error");
						}
						
							inputu.close();
				} catch (FileNotFoundException e) {
					
					System.out.println("file not found");
				}	
			}
	public void deleteTask() {
		
		String tempFile = "temp.txt";
		File oldFile = new File(filepath);
		File newFile = new File(tempFile);
		String title = " "; String description = " "; String priority = " ";
		
		
	try {
		  System.out.println("Enter Task title to delete task: ");
		  Scanner inputU = new Scanner(System.in);
		  String term = inputU.nextLine().trim().toUpperCase();
		  
		  
		  fw = new FileWriter(tempFile, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			input = new Scanner(new File(filepath));
			input.useDelimiter("[|\n]");
			
			while(input.hasNext()) {
				
				title = input.next();
				description = input.next();
				priority = input.next();
				
				if(!title.equals(term)) {
					
					pw.println(title + "|" + "Description:         " + description + "|"  + "Priority: " + priority + "\n");
				}
				
			}
				input.close();
				inputU.close();
				pw.flush();
				pw.close();
				oldFile.delete();
				File dump = new File(filepath);
		        newFile.renameTo(dump);
		
		
		}
		catch(Exception e) {
			System.out.println("Error");
		}
			
		}
		
	}
	
	

	

