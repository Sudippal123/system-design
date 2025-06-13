package SingleResponsibilityPrinciple.ProblematicCode;

public class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public String fetchBioData(){
        return "Bio Data";
    }

    public double calculateSalary(){
        return 0;
    }

    public void printPerformanceData(){
        System.out.println("Performance Data");
    }
}
//multiple reason to change the class