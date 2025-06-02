package net.farout.springai;

public class AssertTest {
    public static void main(String[] args) {
        String chatResponse = getChatResponse();
        assert chatResponse != null : "chatResponse should not be null!";
        System.out.println(chatResponse);
    }

    static String getChatResponse() {
        return null;  // Simulating null for demo
    }
}
