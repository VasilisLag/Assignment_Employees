public class main {
    public static void main(String[] args) {
        // Violation of Single Responsibility Principle (SRP)
        Employee employee = new Employee("John Doe", 50000);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.processEmployee(employee);

        // Violation of Open-Closed Principle (OCP)
        EmployeeType employeeType = new EmployeeType();
        System.out.println("Bonus for John Doe: $" + employeeType.calculateBonus(employee));

        // Violation of Liskov Substitution Principle (LSP)
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee("Jane Roe", 30000);
        System.out.println("Bonus for Temporary Employee: $" + temporaryEmployee.calculateBonus());

        // Violation of Dependency Inversion Principle (DIP)
        FileManager fileManager = new FileManager();
        fileManager.saveToFile("Bonus for John Doe: $" + employeeType.calculateBonus(employee));

        // Violation of Interface Segregation Principle (ISP)
        Developer dev = new Developer("Andrew", 3000);
        Manager mng = new Manager("Maria", 3450);
        dev.eat(); 
        mng.sleep(); //Dev doesn't need a sleep method but implements Workable which includes sleep()
    }
}
