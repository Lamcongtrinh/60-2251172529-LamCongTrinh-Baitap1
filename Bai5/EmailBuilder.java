public interface EmailBuilder {
    void reset();

    void setRecipient(String to);

    void setSubject(String subject);

    void setBody(String body);

    EmailMessage getResult();
}
