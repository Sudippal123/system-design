package EmailPrototype;

public class PremiumEmail extends Email {
    private String bcc;
    public PremiumEmail(String subject, String to, String cc, String bcc, String content) {
        super(subject, to, cc, content);
        this.bcc = bcc;
    }
    private PremiumEmail(PremiumEmail e){
        super(e);
        this.bcc = e.bcc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    @Override
    public PremiumEmail copy() {
        return new PremiumEmail(this);
    }

    @Override
    public String toString(){
        return super.toString()+" bcc :"+this.bcc;
    }
}
