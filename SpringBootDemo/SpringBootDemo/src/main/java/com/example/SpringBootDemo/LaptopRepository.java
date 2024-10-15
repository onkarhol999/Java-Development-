package com.example.SpringBootDemo;

import com.example.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public  void save(Laptop lap){
//        JSBC steps here
        System.out.println("Saved in Database");
    }
}
