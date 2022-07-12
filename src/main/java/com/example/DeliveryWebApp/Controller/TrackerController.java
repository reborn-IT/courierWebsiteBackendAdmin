package com.example.DeliveryWebApp.Controller;

import com.example.DeliveryWebApp.Dto.BranchDetailDto;
import com.example.DeliveryWebApp.Dto.SearchTrackingDto;
import com.example.DeliveryWebApp.Dto.TrackerDto;
import com.example.DeliveryWebApp.Service.PickupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/tracker")
@RequiredArgsConstructor
@CrossOrigin
public class TrackerController {
    private final PickupService pickupservice;

    @GetMapping(value = "/{pickupId}",produces = APPLICATION_JSON_VALUE)
    public  TrackerDto GetTrackerDetails(@PathVariable("pickupId") Long pickupId){
        TrackerDto listdto=pickupservice.GetTrackingInfo(pickupId);
        return listdto;
    }
}
