package com.example.DeliveryWebApp.Controller;

import com.example.DeliveryWebApp.Dto.Sender.AddSenderDto;
import com.example.DeliveryWebApp.Dto.Sender.SenderDetailsDto;
import com.example.DeliveryWebApp.Service.SenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/sender")
@CrossOrigin
@RequiredArgsConstructor
public class SenderController {
    private final SenderService senderservice;

    @PostMapping(value = "/addsender", consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE )
    public AddSenderDto AddNewSender(@RequestBody AddSenderDto addsenderdto){
        senderservice.AddNewSender(addsenderdto);
        return addsenderdto;
    }




}
