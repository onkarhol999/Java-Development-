package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.LaptopRepository;
import com.example.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodForProg(){
        return true;
    }
}
