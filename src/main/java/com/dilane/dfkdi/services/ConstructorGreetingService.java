package com.dilane.dfkdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
