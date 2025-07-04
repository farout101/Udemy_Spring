package net.farout.springai.controller;

import lombok.extern.java.Log;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/openai")
public class OpenAIController {

    Logger logger = LoggerFactory.getLogger(OpenAIController.class);

    private final ChatClient client;

    public OpenAIController(OpenAiChatModel model) {
        this.client = ChatClient.create(model);
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message) {

        ChatResponse chatResponse = client
                .prompt(message)
                .call()
                .chatResponse();

        assert chatResponse != null : "Chat response is null";
        logger.info("Model used: {}", chatResponse.getMetadata().getModel());

        String response = chatResponse
                .getResult()
                .getOutput()
                .getText();

        return ResponseEntity.ok(response);
    }
}
