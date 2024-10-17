package com.medi.bot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping
    public ResponseEntity<String> submitFeedback(@RequestBody FeedbackDto feedbackDto) {
        feedbackService.saveFeedback(feedbackDto.getUserId(), feedbackDto.getMessage());
        return new ResponseEntity<>("Thank you for your feedback!", HttpStatus.CREATED);
    }
}
