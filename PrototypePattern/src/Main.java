import EmailPrototype.Email;
import EmailPrototype.PremiumEmail;

public class Main {
    public static void main(String[] args){
        Email email1 = new PremiumEmail("subject",
                "to@gmail.com",
                "cc@gmail.com",
                "bcc@gmail.com",
                "content");

        // Create a copy object
        Email email2 = email1.copy(); // this is calling the copy constructor
        email2.setContent("content2");
        email2.setTo("sudip@gmail.com");

        System.out.println(email1.toString());
        System.out.println(email2.toString());


        PremiumEmail premiumEmail1 = new PremiumEmail("subject",
                "premiumEmail1_to@gmail.com",
                "premiumEmail1_cc@gmail.com",
                "premiumEmail1_bcc@gmail.com",
                "This is a premium email");

        // Create a copy object
        PremiumEmail premiumEmail2 = premiumEmail1.copy(); // this is calling the copy constructor
        premiumEmail2.setBcc("bcc@gmail.com");

        System.out.println(premiumEmail1.toString());
        System.out.println(premiumEmail2.toString());


    }
}
