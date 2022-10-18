package com.mostafa.service;

import com.mostafa.model.EmailModel;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    private JavaMailSender javaMailSender;

    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(EmailModel model) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("abcd@gmail.com");
        message.setTo(model.getReceiverEmail());
        message.setSubject(model.getEmailSubject());
        message.setText(model.getEmailBody());

        this.javaMailSender.send(message);
    }
}
