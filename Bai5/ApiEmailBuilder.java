public class ApiEmailBuilder implements EmailBuilder {
    private EmailMessage email;

    @Override
    public void reset() {
        email = new EmailMessage();
    }

    @Override
    public void setRecipient(String to) {
        if (to == null || to.isEmpty()) {
            System.out.println("Địa chỉ email không hợp lệ (API)");
        } else {
            email.setTo(to);
        }
    }

    @Override
    public void setSubject(String subject) {
        email.setSubject(subject);
    }

    @Override
    public void setBody(String body) {
        email.setBody("Gửi email tới " + email + " thành công qua API\n" + body);
    }

    @Override
    public EmailMessage getResult() {
        return email;
    }
}
