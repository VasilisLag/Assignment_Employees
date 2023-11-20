
public class Manager extends Employee implements Attendable, Eatable, Sleepable {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void attendMeeting() {
    	System.out.println("Manager is attending a meeting.");
    }
    @Override
    public void eat() {
    	System.out.println("Manager is eating.");
    }
    @Override
    public void sleep() {
    	System.out.println("Manager is sleeping.");
    }
}