package SingleResponsibilityPrinciple.BetterCode.Contract;

import SingleResponsibilityPrinciple.BetterCode.Domain.Employee;

public interface SalaryCalculator {
    double calculateSalary(Employee employee);
}