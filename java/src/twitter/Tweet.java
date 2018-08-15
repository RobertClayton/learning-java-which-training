package twitter;

public class Tweet extends Message {

    public Tweet() {
    }

    public Tweet(String username, String text) {
        this(username, text, Category.FRIDAY);
    }


    public Tweet(String username, String text, Category category) {
        super(username, text, category); // This deferred these back to Message
    }

    @Override
    public void setText(String text) {
        text = text.length()>140
                ? text.substring(0,140) : text;
        super.setText(text);
    }

    @Override
    public String getText() {
        return "Tweet: " + super.getText();
    }

}
