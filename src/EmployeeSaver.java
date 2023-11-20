import java.io.FileWriter;
import java.io.IOException;

public class EmployeeSaver {
	
    public void saveEmployeeToFile(Employee employee) {
        // Save employee to a file (persistence logic)
    	try {
  	      FileWriter myWriter = new FileWriter("employ_pers.txt");
  	      myWriter.write("Employee Details: " + employee.getName() + ", " + employee.getSalary());
  	      myWriter.close();
  	      System.out.println("Successfully wrote to the file.");
  	    } catch (IOException e) {
  	      System.out.println("An error occurred.");
  	      e.printStackTrace();
  	    }
    }
}