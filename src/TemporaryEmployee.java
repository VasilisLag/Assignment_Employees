public class TemporaryEmployee extends Employee {
	
    public TemporaryEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
    public double calculateBonus() {
        return 1000;
    }
}