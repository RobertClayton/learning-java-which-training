package twitter;

public class Message {

    public Message() {
    }

    public Message(String username, String text) {
        this(username, text, Category.FRIDAY);
    }

    public Message(String username, String text, Category category) {
        setUsername(username);
        setText(text);
        setCategory(category);
    }

    private static final int MAX_TWEET_LENGTH = 140;
    private String username;
    private String text;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() { return text; }

    public void setText(String text) {
        text = (text.length() > MAX_TWEET_LENGTH) ? text.substring(0, MAX_TWEET_LENGTH) : text;
        this.text = text;
    }
}
