public class Developer extends Employee implements Workable, Eatable {
    public Developer(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public void work() {
    	System.out.println("Developer is coding.");
    }
    @Override
    public void eat() {
    	System.out.println("Developer is having lunch!");
    }
    
}