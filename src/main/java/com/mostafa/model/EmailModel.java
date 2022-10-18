package com.mostafa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {
    private String receiverEmail;
    private String emailSubject;
    private String emailBody;
}
