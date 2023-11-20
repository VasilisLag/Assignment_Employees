
public class DeveloperBonusCalculator implements BonusCalculator{
    @Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1;
    }
}
