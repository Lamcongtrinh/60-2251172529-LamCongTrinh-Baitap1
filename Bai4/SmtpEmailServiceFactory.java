public class SmtpEmailServiceFactory implements EmailServiceFactory {
    @Override
    public IEmailService createEmailService() {
        return new SmtpEmailService();
    }
}
