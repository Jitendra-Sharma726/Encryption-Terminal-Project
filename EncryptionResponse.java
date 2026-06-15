package com.example.demo.model;

public class EncryptionResponse {
    private String originalText;
    private String transformedText;
    private String operation; // "encrypt" or "decrypt"

    public EncryptionResponse(String originalText, String transformedText, String operation) {
        this.originalText = originalText;
        this.transformedText = transformedText;
        this.operation = operation;
    }

    // Getters and Setters
    public String getOriginalText() { 
        return originalText; 
    }
    public String getTransformedText() { 
        return transformedText; 
    }
    public String getOperation() { 
        return operation; 
    }
}
