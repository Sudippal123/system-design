package SingleResponsibilityPrinciple.BetterCode.Implementation;

import SingleResponsibilityPrinciple.BetterCode.Domain.Employee;
import SingleResponsibilityPrinciple.BetterCode.Contract.SalaryCalculator;

public class NewTaxRegimeSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return 0;
    }
}
