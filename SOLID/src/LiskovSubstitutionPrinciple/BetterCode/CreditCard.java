package LiskovSubstitutionPrinciple.BetterCode;

public abstract class CreditCard {
    private String ccNumber;
    private String ownerName;
    private int cvv;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public abstract void tapAndPay();
    public abstract void onlineTransfer();
    public abstract void swipeAndPay();



    public  void displayCreditCardDetails(){
        System.out.println("CC Number : "+this.ccNumber+" With Owner Name : "+this.ownerName);
    }
}
