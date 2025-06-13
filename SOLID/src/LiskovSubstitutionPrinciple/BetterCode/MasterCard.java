package LiskovSubstitutionPrinciple.BetterCode;

public class MasterCard  extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("This is master card's tap and pay method");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("This is master card's online transfer method");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("This is master card's swipe and pay method");
    }
}
