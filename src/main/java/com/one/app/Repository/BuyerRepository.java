package com.one.app.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.one.app.Entity.BuyerEntity;

import java.util.UUID;

public interface BuyerRepository extends JpaRepository <BuyerEntity,UUID> {

    @Modifying
    @Query(value = "update buyers set buyerName = :buyerName ,email = :email ,country = :country where buyerId = :buyerId" ,nativeQuery = true)
    void updateBuyer(@Param("buyerId") UUID buyerId,@Param("buyerName") String buyerName,@Param("email") String email,@Param("country") String country);
}
