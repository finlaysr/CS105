public class Main {
    public static void main(String[] args) {
        MessagePost messagePost = new MessagePost("bob", "hello");
        messagePost.like();
        messagePost.addComment("comment");
        messagePost.display();
        messagePost.printShortSummary();
    }
}