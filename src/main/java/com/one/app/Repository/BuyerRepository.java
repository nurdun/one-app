package com.one.app.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.one.app.Model.BuyerEntity;

import java.util.List;
import java.util.UUID;

public interface BuyerRepository extends JpaRepository <BuyerEntity,UUID> {

    @Modifying
    @Query(value = "update buyers set buyerName = :buyerName ,email = :email ,country = :country where buyerId = :buyerId" ,nativeQuery = true)
    void updateBuyer(@Param("buyerId") UUID buyerId,@Param("buyerName") String buyerName,@Param("email") String email,@Param("country") String country);
}
