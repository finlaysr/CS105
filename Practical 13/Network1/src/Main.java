public class Main {
    public static void main(String[] args) {
        MessagePost[] messages = {new MessagePost("bob", "hello"), new MessagePost("ben", "hi")};
        PhotoPost[] photos = {new PhotoPost("jack", "hello.png", "beatiful"), new PhotoPost("zack", "image.jpeg", "how?")};



        NewsFeed newsFeed = new NewsFeed();
        for (MessagePost m : messages) {
            newsFeed.addMessagePost(m);
        }
        for (PhotoPost p : photos) {
            newsFeed.addPhotoPost(p);
        }
        newsFeed.show();

        MessagePost messagePost = new MessagePost("fin", "hi again");
        messagePost.addComment("This is a comment");
        newsFeed.addMessagePost(messagePost);

        newsFeed.show();

    }
}