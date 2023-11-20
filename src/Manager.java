
public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    
    public void attendMeeting() {
    	System.out.println("Manager is attending a meeting.");
    }
    
    public void eat() {
    	System.out.println("Manager is eating.");
    }
    
    public void sleep() {
    	System.out.println("Manager is sleeping.");
    }
}