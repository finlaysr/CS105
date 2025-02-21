import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testComment() {
        Comment comment = new Comment("Finlay", "Excellent", 5);
        assertEquals("Finlay", comment.getAuthor());
        assertEquals(5, comment.getRating());

    }

    @Test
    void testUpvote() {
        Comment comment = new Comment("Finlay", "Excellent", 5);
        comment.upvote();
        assertEquals(1, comment.getVoteCount());
    }

    @Test
    void testDownvote() {
        Comment comment = new Comment("Finlay", "Excellent", 5);
        comment.downvote();
        assertEquals(-1, comment.getVoteCount());
    }


}