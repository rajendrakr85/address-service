package com.org.address.controller;

import com.org.address.modal.Address;
import com.org.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    public ResponseEntity<List<Address>> getAllAddress(){
        return new ResponseEntity<>(addressService.getAllAddress(), HttpStatus.OK);
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable(value = "id") Long id){
        Optional<Address>address=addressService.getAddressId(id);
        return new ResponseEntity<>(address.get(), HttpStatus.OK);
    }

    @PostMapping("/address")
    public ResponseEntity<Address>saveAddress(@RequestBody Address address){
        return new ResponseEntity<>(addressService.saveAddress(address),HttpStatus.OK);
    }
}
