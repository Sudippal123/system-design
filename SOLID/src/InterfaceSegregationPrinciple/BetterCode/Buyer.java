package InterfaceSegregationPrinciple.BetterCode;

public class Buyer implements ICanBuy{
    @Override
    public void buy() {
        System.out.println("I can able to buy only");
    }
}
