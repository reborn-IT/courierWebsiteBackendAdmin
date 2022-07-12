package com.example.DeliveryWebApp.Dto.Sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddSenderDto {
    private String senderName;
    private String senderAddress;
    private String senderMobile;
    private String senderAltMobile;
    private String senderEmail;
}
