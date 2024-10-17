package com.medi.bot;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChatbotService {

    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("symptoms of flu", "Common symptoms include fever, cough, sore throat, body aches, and fatigue.");
        responses.put("when to see a doctor", "If your symptoms are severe or persistent, it's best to consult a healthcare professional.");
        responses.put("how to treat a cold", "Rest, hydration, and over-the-counter medications can help alleviate symptoms.");
        responses.put("what is diabetes", "Diabetes is a chronic condition that affects how your body processes sugar (glucose).");
    }

    public String getResponse(String query) {
        return responses.getOrDefault(query.toLowerCase(), "I'm sorry, I don't have information on that. Please consult a healthcare professional.");
    }
}
