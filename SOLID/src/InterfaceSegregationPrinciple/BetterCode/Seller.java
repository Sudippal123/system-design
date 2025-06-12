package InterfaceSegregationPrinciple.BetterCode;

public class Seller implements ICanBuy,ICanModify,ICanSell{
    @Override
    public void buy() {
        System.out.println("Seller is buying the product");
    }

    @Override
    public void modify() {
        System.out.println("Seller is modifying the product");
    }

    @Override
    public void sell() {
        System.out.println("Seller is selling the product");
    }
}
