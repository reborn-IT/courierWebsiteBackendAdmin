package com.example.DeliveryWebApp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BranchDetailDto {
    private String branchName;
    private String address;
    private String contactNumber;
    private String latitude;
    private String longitude;
}
