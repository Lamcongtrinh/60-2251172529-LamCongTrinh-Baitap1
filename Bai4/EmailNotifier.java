public class EmailNotifier {
    private final IEmailService emailService;

    public EmailNotifier(EmailServiceFactory factory) {
        this.emailService = factory.createEmailService();
    }

    public void notify(String recipient, String message) {
        emailService.sendEmail(recipient, "Thông báo", message);
    }
}
