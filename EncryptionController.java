package com.example.demo.controller;

import com.example.demo.model.EncryptionResponse;
import com.example.demo.service.EncryptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EncryptionController {

    private final EncryptionService encryptionService;

    // Constructor injection of the EncryptionService
    public EncryptionController(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    // Endpoint: /api/encrypt?message=Hello
    @GetMapping("/encrypt")
    public EncryptionResponse encrypt(@RequestParam String message) {
        String encrypted = encryptionService.encrypt(message);
        return new EncryptionResponse(message, encrypted, "encryption");
    }

    // Endpoint: /api/decrypt?message=Mjqqt
    @GetMapping("/decrypt")
    public EncryptionResponse decrypt(@RequestParam String message) {
        String decrypted = encryptionService.decrypt(message);
        return new EncryptionResponse(message, decrypted, "decryption");
    }
}


