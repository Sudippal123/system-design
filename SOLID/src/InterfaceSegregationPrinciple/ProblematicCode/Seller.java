package InterfaceSegregationPrinciple.ProblematicCode;

public class Seller implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public void approveProduct() {
        System.out.println("I am not the right person to approve . Generate some exception!!!");
    }
}
