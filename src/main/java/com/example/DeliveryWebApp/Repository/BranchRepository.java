package com.example.DeliveryWebApp.Repository;

import com.example.DeliveryWebApp.Dto.BranchDetailDto;
import com.example.DeliveryWebApp.Entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {

    @Query(value = "select * from branch where branch_name=?", nativeQuery = true)
    List<Branch> FindBranchByName(String branchname);

//    @Modifying
//    @Query(value = "delete from branch where branch_id=?", nativeQuery = true)
//    void DeleteABranch(Long id);
}
