package SingleResponsibilityPrinciple.BetterCode.Implementation;

import SingleResponsibilityPrinciple.BetterCode.Contract.PerformanceReportGenerator;

public class AnnualPerformanceReport implements PerformanceReportGenerator {
    @Override
    public void generatePerformanceReport() {
        System.out.println("This is annual performance report");
    }
}
