public class EmailNotifier {
    private EmailBuilder builder;

    public EmailNotifier(EmailBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(EmailBuilder builder) {
        this.builder = builder;
    }

    public void notify(String to, String message) {
        builder.reset();
        builder.setRecipient(to);
        builder.setSubject("Thông báo");
        builder.setBody(message);
        EmailMessage email = builder.getResult();
        System.out.println(email.toString());
    }
}
