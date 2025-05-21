public class ApiEmailServiceFactory implements EmailServiceFactory {
    @Override
    public IEmailService createEmailService() {
        return new ApiEmailService();
    }
}
