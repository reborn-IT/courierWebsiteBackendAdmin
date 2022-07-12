package com.example.DeliveryWebApp.Controller;

import com.example.DeliveryWebApp.Dto.BranchDetailDto;
import com.example.DeliveryWebApp.Service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/branch")
@CrossOrigin
@RequiredArgsConstructor
public class BranchController {
    private final BranchService branchservice;



    @GetMapping(value = "/findallBranches", produces = APPLICATION_JSON_VALUE)
    public List<BranchDetailDto> GetAllBranches(){
        List<BranchDetailDto> branchlist=branchservice.GetAllBBranch();
        return branchlist;
    }


    @GetMapping(value = "/searchByName/{branchname}", produces = APPLICATION_JSON_VALUE )
    public List<BranchDetailDto> FindByName(@PathVariable("branchname") String branchname){
        List<BranchDetailDto> searchedbranch=branchservice.GetRelevatBranch(branchname);
        return searchedbranch;
    }

}
