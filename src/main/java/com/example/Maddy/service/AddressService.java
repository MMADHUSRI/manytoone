package com.example.Maddy.service;

import com.example.Maddy.models.Address;
import com.example.Maddy.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
     @Autowired
    public AddressRepository repository;
     public List<Address> getAllAddress(){
         return repository.findAll();
    }
    public String insertNewAddress(Address address){
         repository.save(address);
         return  "Address Saved Successfully....";
    }
    public String deleteAddress(long id){
         repository.deleteById(id);
         return "Address is deleted successfully";
    }
}
