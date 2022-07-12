package com.example.DeliveryWebApp.Service;

import com.example.DeliveryWebApp.Dto.BranchDetailDto;

import java.util.List;

public interface BranchService {

    List<BranchDetailDto> GetAllBBranch();
    List<BranchDetailDto> GetRelevatBranch(String branchname);

}
