package com.medi.bot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/ask")
    public String ask(@RequestParam String question, Model model) {
        String response = chatbotService.getResponse(question);
        model.addAttribute("response", response);
        model.addAttribute("question", question);
        return "index";
    }
}

