package SingleResponsibilityPrinciple.BetterCode.Implementation;

import SingleResponsibilityPrinciple.BetterCode.Contract.BioDataProvider;
import SingleResponsibilityPrinciple.BetterCode.Domain.Employee;

public class SimpleBioDataProvider implements BioDataProvider {
    @Override
    public String fetchBioData(Employee employee) {
        return "This is the Bio Data for Sample Employee" ;
    }
}
