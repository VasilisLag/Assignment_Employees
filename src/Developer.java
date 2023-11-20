public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }
    
    public void work() {
    	System.out.println("Developer is coding.");
    }
    
    public void eat() {
    	System.out.println("Developer is having lunch!");
    }
    
    public void sleep() {
    	
    }
}