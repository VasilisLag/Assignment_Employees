import java.io.FileWriter;
import java.io.IOException;  
// Violation of Single Responsibility Principle (SRP)
public class EmployeeManager {
    public void processEmployee(Employee employee) {
        // Violation: This class is responsible for processing, displaying, and persisting employee information.
        displayEmployeeInfo(employee);
        saveEmployeeToFile(employee);
    }

    private void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee Details: " + employee.getName() + ", " + employee.getSalary());
    }

    private void saveEmployeeToFile(Employee employee) {
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