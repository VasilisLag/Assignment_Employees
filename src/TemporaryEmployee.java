// Violation of Liskov Substitution Principle (LSP)
public class TemporaryEmployee extends Employee {
	
    public TemporaryEmployee(String name, double salary) {
		super(name, salary);
	}

	// Violation: Temporary employees cannot have a bonus, breaking the expected behavior of the base class.
    public double calculateBonus() {
        return 0;
    }
}