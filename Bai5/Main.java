public class Main {
    public static void main(String[] args) {
        EmailBuilder smtpBuilder = new SmtpEmailBuilder();
        EmailBuilder apiBuilder = new ApiEmailBuilder();

        EmailNotifier notifier = new EmailNotifier(smtpBuilder);
        System.out.println("SMTP:");
        notifier.notify("user@example.com", "Chào bạn!");
        notifier.notify("", "Chào bạn!");

        System.out.println("\nAPI:");
        notifier.changeBuilder(apiBuilder);
        notifier.notify("user@example.com", "Chào bạn!");
        notifier.notify("", "Chào bạn!");
    }
}
