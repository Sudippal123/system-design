package SingleResponsibilityPrinciple.BetterCode.Contract;


import SingleResponsibilityPrinciple.BetterCode.Domain.Employee;

public interface BioDataProvider {
    String fetchBioData(Employee employee);
}
