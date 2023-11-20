
public class EmployeeType {
	 private BonusCalculator bonusCalculator;

	    public EmployeeType(BonusCalculator bonusCalculator) {
	        this.bonusCalculator = bonusCalculator;
	    }

	    public double calculateBonus(Employee employee) {
	        return bonusCalculator.calculateBonus(employee);
	    }
}