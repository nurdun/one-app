package com.one.app.Service;

import com.one.app.Entity.BuyerEntity;
import com.one.app.Repository.BuyerRepository;
import com.one.app.Util.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

@Service
public class BuyerService extends RestService {

    @Autowired
    BuyerRepository buyerRepository;

    public String addBuyer(BuyerEntity buyer){
        buyerRepository.save(buyer);
        return addSucceed;
    }

    public String updateBuyer(BuyerEntity buyer){
        try {
//            buyerRepository.updateBuyer(buyer);
//            return buyer.getBuyerId().toString();
            BuyerEntity newBuyer = this.getBuyerById(buyer.getBuyerId());
            newBuyer.setBuyerName(buyer.getBuyerName());
            newBuyer.setEmail(buyer.getEmail());
            newBuyer.setCountry(buyer.getCountry());
            buyerRepository.save(newBuyer);
            return buyer.getBuyerId().toString();
        }catch (Exception err){
            err.printStackTrace();
            return err.toString();
        }
    }

    public String deleteBuyerById(UUID buyerId){
        buyerRepository.deleteById(buyerId);
        return deleteSucceed;
    }

    public BuyerEntity getBuyerById(UUID buyerId){
        try{
            Optional<BuyerEntity> buyer = buyerRepository.findById(buyerId);
            return buyer.orElseThrow(() -> new Exception("Couldn't find a buyer with id: " + buyerId));
        }catch (Exception err){
            err.printStackTrace();
            return  null;
        }
    }

    public List<BuyerEntity> getAllBuyers(){
        return buyerRepository.findAll();
    }

}
