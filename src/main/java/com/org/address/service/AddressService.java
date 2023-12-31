package com.org.address.service;

import com.org.address.modal.Address;
import com.org.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Optional<Address> getAddressId(Long id){
        return addressRepository.findById(id);
    }

    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    public Address saveAddress(Address address){
        return addressRepository.save(address);
    }
}
