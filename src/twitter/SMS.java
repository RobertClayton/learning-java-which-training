package twitter;

public class SMS extends Message {

    public SMS() {
    }

    public SMS(String username, String text) {
        this(username, text, Category.FRIDAY);
    }

    public SMS(String username, String text, Category category) {
        super(username, text, category); // This deferred these back to Message
    }

    @Override
    public String getText() {
        return "SMS: " + super.getText();
    }
}
