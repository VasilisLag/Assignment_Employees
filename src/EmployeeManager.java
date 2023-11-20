import java.io.FileWriter;
import java.io.IOException;  
// Violation of Single Responsibility Principle (SRP) - resolved
public class EmployeeManager {
	private EmployeeDisplayer displayer;
	private EmployeeSaver saver;
	
	public EmployeeManager(EmployeeDisplayer displayer, EmployeeSaver saver) {
		this.displayer = displayer;
		this.saver = saver;
	}
    public void processEmployee(Employee employee) {
        // Violation: This class is responsible for processing, displaying, and persisting employee information. - resolved
        displayer.displayEmployeeInfo(employee);
        saver.saveEmployeeToFile(employee);
    }

}