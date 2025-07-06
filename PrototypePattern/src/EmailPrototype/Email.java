package EmailPrototype;

public abstract class Email implements Prototype<Email> {
    private String subject;
    private String to;
    private String cc;
    private String content;

    public Email(String subject, String to, String cc, String content) {
        this.subject = subject;
        this.to = to;
        this.cc = cc;
        this.content = content;
    }

    public Email(Email e){
        this.subject = e.subject;
        this.to = e.to;
        this.cc = e.cc;
        this.content = e.content;
    }

    @Override
    public abstract Email copy();

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "To: " + this.to + " CC: " + this.cc + " Subject: " + this.subject + " Content: " + this.content;
    }
}
