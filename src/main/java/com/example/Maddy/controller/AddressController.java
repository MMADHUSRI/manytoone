package com.example.Maddy.controller;

import com.example.Maddy.models.Address;
import com.example.Maddy.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    public AddressService service;
    @GetMapping
    public List<Address> getAllAddress(){
        return service.getAllAddress();
    }
    @PostMapping
    public String save(@RequestBody Address address){
        return service.insertNewAddress(address);
    }
    @DeleteMapping("/{id}")
    public String  delete(@PathVariable long id){
        return service.deleteAddress(id);
    }

}
