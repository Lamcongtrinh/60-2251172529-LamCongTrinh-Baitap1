public class Main {
    public static void main(String[] args) {
        System.out.println("=== Test với SmtpEmailService ===");
        EmailNotifier smtpNotifier = new EmailNotifier(new SmtpEmailServiceFactory());
        smtpNotifier.notify("user@example.com", "Chào bạn!");
        smtpNotifier.notify("", "Chào bạn!");

        System.out.println("\n=== Test với ApiEmailService ===");
        EmailNotifier apiNotifier = new EmailNotifier(new ApiEmailServiceFactory());
        apiNotifier.notify("user@example.com", "Chào bạn!");
        apiNotifier.notify("", "Chào bạn!");
    }
}
