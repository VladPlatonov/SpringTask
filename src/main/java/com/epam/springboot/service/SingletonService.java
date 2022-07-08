package com.epam.springboot.service;


import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    public String getMethod(){
        return prototypeService().getDateTime();
    }

    @Lookup
    public PrototypeService prototypeService(){
        return null;
    }

}
