public class main {
    public static void main(String[] args) {
        // Violation of Single Responsibility Principle (SRP) - resolved
    	// Instantiate the new classes
    	EmployeeDisplayer displayer = new EmployeeDisplayer();
    	EmployeeSaver saver = new EmployeeSaver();
    	
        Employee employee = new Employee("John Doe", 50000);
        // Pass the new classes to the EmployeeManager
        EmployeeManager employeeManager = new EmployeeManager(displayer, saver);
        employeeManager.processEmployee(employee);

        // Violation of Open-Closed Principle (OCP) - resolved
        // Use the new BonusCalculators
        BonusCalculator managerBonusCalculator = new ManagerBonusCalculator();
        BonusCalculator developerBonusCalculator = new DeveloperBonusCalculator();

        // Pass the calculators to the EmployeeType
        EmployeeType managerEmployeeType = new EmployeeType(managerBonusCalculator);
        EmployeeType developerEmployeeType = new EmployeeType(developerBonusCalculator);
        // Use the EmployeeType instances
        System.out.println("Bonus for John Doe (Manager): $" + managerEmployeeType.calculateBonus(employee));
        System.out.println("Bonus for John Doe (Developer): $" + developerEmployeeType.calculateBonus(employee));

        // Violation of Liskov Substitution Principle (LSP) - resolved
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee("Jane Roe", 30000);
        System.out.println("Bonus for Temporary Employee: $" + temporaryEmployee.calculateBonus());

        // Violation of Dependency Inversion Principle (DIP) - resolved
        // Instantiate the concrete implementation of FilePersistence
        FilePersistence filePersistence = new FileWriters();

        // Instantiate FileManager with the injected dependency
        FileManager fileManager = new FileManager(filePersistence);

        // Use FileManager to save data to a file
        fileManager.saveToFile(displayer.displayEmployeeInfo(employee));


        // Violation of Interface Segregation Principle (ISP) - resolved
        Developer dev = new Developer("Andrew", 3000);
        Manager mng = new Manager("Maria", 3450);
        dev.eat(); 
        mng.sleep(); 
    }
}
