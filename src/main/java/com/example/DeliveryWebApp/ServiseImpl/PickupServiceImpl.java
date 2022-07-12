package com.example.DeliveryWebApp.ServiseImpl;

import com.example.DeliveryWebApp.Dto.Pickup.PickupDetailsDto;
import com.example.DeliveryWebApp.Dto.SearchTrackingDto;
import com.example.DeliveryWebApp.Dto.TrackerDto;
import com.example.DeliveryWebApp.Entity.Pickup;
import com.example.DeliveryWebApp.Repository.PickupRepository;
import com.example.DeliveryWebApp.Service.PickupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PickupServiceImpl implements PickupService {
    private PickupRepository pickuprepo;

//    @Override
//    public List<TrackerDto> GetTrackingInfo(SearchTrackingDto searchDto) {
//        List<TrackerDto> deliverydetailslist=pickuprepo.GetTrackerDetails(searchDto.getPickupId());
//        List<TrackerDto> list=new ArrayList<>();
//        for ( TrackerDto trackingDetails:deliverydetailslist) {
//            list.add(new TrackerDto(trackingDetails.getDeliveryName(),trackingDetails.getDeliveryAddress(),trackingDetails.getPickupDate(),trackingDetails.getDeliveryDate()));
//        }
//        return list;
//    }

    @Override
    public TrackerDto GetTrackingInfo(Long pickupId) {
        TrackerDto val;
        try {
            val=pickuprepo.GetTrackerDetails(pickupId);
            System.out.println(val.getDeliveryAddress()+val.getDeliveryName()+val.getDeliveryDate()+val.getPickupDate());
        }catch (Exception e){
            val=null;
            System.out.println("Exceptionnn");

        }

        return val;
    }

    @Override
    public List<PickupDetailsDto> getPickupDetails() {
        List<Pickup> pickuplist=pickuprepo.findAll();
        List<PickupDetailsDto> pickupdtolist=new ArrayList<>();
        for (Pickup pickup:pickuplist) {
            pickupdtolist.add(new PickupDetailsDto());
        }
        return null;
    }
}
