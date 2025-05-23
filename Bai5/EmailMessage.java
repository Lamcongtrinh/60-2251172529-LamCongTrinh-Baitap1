public class EmailMessage {
    private String to;
    private String subject;
    private String body;

    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "To: " + to + "\nSubject: " + subject + "\nBody: " + body;
    }
}
