package com.mostafa.controller;

import com.mostafa.model.EmailModel;
import com.mostafa.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailServiceController {
    public EmailService emailService;

    public EmailServiceController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailModel model){
        emailService.sendEmail(model);
        return ResponseEntity.ok("Email Sent Successfully!");
    }
}
