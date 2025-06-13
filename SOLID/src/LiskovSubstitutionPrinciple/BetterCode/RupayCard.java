package LiskovSubstitutionPrinciple.BetterCode;

public class RupayCard extends CreditCard implements UPIPaymentCompatibleCreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("This is rupay card's tap and pay method");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("This is rupay card's online transfer method");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("This is rupay card's swipe and pay method");
    }

    @Override
    public void upiPay() {
        System.out.println("This is rupay card's UPI pay method");
    }
}
