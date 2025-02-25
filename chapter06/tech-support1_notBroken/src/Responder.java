import java.util.*;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 *
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder {
    static Random randomGen = new Random();
    /**
     * Construct a Responder - nothing to do
     */
    ArrayList<String> possibilities = new ArrayList<>(Arrays.asList(
            "Hi", "How are you", "Great to hear", "how come", "tell me more", "why is that", "whats your name", "who are you"));

    private HashMap<String, String> responses = new HashMap<>();

    public Responder() {
        responses.put("hello", "hello: hi there");
        responses.put("bye", "bye: see you next time!");
        responses.put("help", "help: what can I help you with");
        responses.put("computer", "computer: what kind of computer do you have?");
    }

    /**
     * Generate a random response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse() {
        return possibilities.get(randomGen.nextInt(possibilities.size()));
    }

    public String findResponse(ArrayList<String> words) {
        String response = "";
        for (String word: words) {
            if (responses.containsKey(word)) {
                response += "\n" + responses.get(word);
            }
        }
        if (response.isEmpty()) {
            return generateResponse();
        } else {
            return response;
        }
    }
}
