package com.example.DeliveryWebApp.ServiseImpl;

import com.example.DeliveryWebApp.Dto.BranchDetailDto;
import com.example.DeliveryWebApp.Entity.Branch;
import com.example.DeliveryWebApp.Repository.BranchRepository;
import com.example.DeliveryWebApp.Service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BranchServiceImpl implements BranchService {
    private final BranchRepository branchrepo;



    @Override
    public List<BranchDetailDto> GetAllBBranch() {
        List<Branch> branchlist =branchrepo.findAll();
        List<BranchDetailDto> branchlistdto=new ArrayList<>();
        for ( Branch branch:branchlist) {
            branchlistdto.add(new BranchDetailDto(branch.getBranchName(),branch.getAddress(),branch.getContactNumber(),branch.getLatitude(),branch.getLongitude()));
        }
        return branchlistdto;
    }

    @Override
    public List<BranchDetailDto> GetRelevatBranch(String branchname) {
        List<Branch> searchedbranch=branchrepo.FindBranchByName(branchname);
        List<BranchDetailDto> branchdetaildto=new ArrayList<>();
        for (Branch branch:searchedbranch) {
            branchdetaildto.add(new BranchDetailDto(branch.getBranchName(),branch.getAddress(),branch.getContactNumber(), branch.getLatitude(), branch.getLongitude()));
        }
        return branchdetaildto;
    }


}
