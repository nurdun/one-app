package com.one.app.Controller;

import com.one.app.Entity.BuyerEntity;
import com.one.app.Service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@Controller
@RequestMapping("/api")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @RequestMapping(method = POST,value = "/getbuyer")
    @ResponseBody
    public BuyerEntity getBuyerById(@RequestParam UUID buyerId){
        BuyerEntity buyer = new BuyerEntity();
        buyer = buyerService.getBuyerById(buyerId);
        return buyer;
    }

    @RequestMapping("/buyers")
    @ResponseBody
    public List<BuyerEntity> getAllBuyers(){
        List<BuyerEntity> buyers = new ArrayList<BuyerEntity>();
        buyers = buyerService.getAllBuyers();
        return buyers;
    }

    @RequestMapping(method = POST,value = "/addbuyer",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String addBuyer(@RequestBody BuyerEntity buyer){
       return buyerService.addBuyer(buyer);
    }

    @RequestMapping(method = POST,value = "/updatebuyer",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String updateBuyerById(@RequestBody BuyerEntity buyer){
        return buyerService.updateBuyer(buyer);
    }

    @RequestMapping(method = POST,value = "/deletebuyer")
    @ResponseBody
    public String deleteBuyerById(@RequestParam UUID buyerId){
        return buyerService.deleteBuyerById(buyerId);
    }

}
