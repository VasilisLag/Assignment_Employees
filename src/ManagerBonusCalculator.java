
public class ManagerBonusCalculator implements BonusCalculator {
	@Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.2;
    }

}
