import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.text.WordUtils;

public class Task {
	private int ID = 1;
	private String description;
	private String priority;
	private String filepath = "task.txt";
	private Map<Integer, String> tasks = tasks = new HashMap();
	

	
	public Task() {
		
	}
	
	//Add a tak to the list
	public void addTask(String description) {
	
		
		 String newDescription = WordUtils.wrap(description, 40, "\n\t",true);
			
			 
		tasks.put(ID, newDescription);
		
		
		try {
			if(description !=null) {
			FileWriter fw = new FileWriter(filepath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
					
			pw.println("No."+ ID + "|"+ tasks.get(ID) + "\n");
			System.out.println("No."+ID +"|"+"\t"+ tasks.get(ID) + "\n");
			ID++;
			pw.flush();
			pw.close();
			
			
			}
					
		} catch (IOException e) {
			System.out.println("No task added");
	}
		
 }
	
	
		
	}
	
	
	
	
		
	
	


