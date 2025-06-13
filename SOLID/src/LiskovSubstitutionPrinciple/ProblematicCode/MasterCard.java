package LiskovSubstitutionPrinciple.ProblematicCode;

public class MasterCard  extends CreditCard{
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

    @Override
    public void upiPay() {
        /*
            Although this payment method not supported
            by Master Card but still we are forced to
            implement this method.

         */
    }
}
