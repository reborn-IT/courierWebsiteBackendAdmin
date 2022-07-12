package com.example.DeliveryWebApp.ServiseImpl;

import com.example.DeliveryWebApp.Dto.Sender.AddSenderDto;
import com.example.DeliveryWebApp.Entity.Sender;
import com.example.DeliveryWebApp.Repository.SenderRepository;
import com.example.DeliveryWebApp.Service.SenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SenderServiceImpl implements SenderService {
    private final SenderRepository senderrepo;

    @Override
    public void AddNewSender(AddSenderDto addsenderdto) {
        Sender sender=new Sender(addsenderdto.getSenderName(),addsenderdto.getSenderAddress(), addsenderdto.getSenderMobile(), addsenderdto.getSenderAltMobile(), addsenderdto.getSenderEmail());
        senderrepo.save(sender);
    }

}
