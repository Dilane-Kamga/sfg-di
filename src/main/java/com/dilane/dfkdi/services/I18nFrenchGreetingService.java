package com.dilane.dfkdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("I18nService")
public class I18nFrenchGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Salut Monde - FR";
    }
}
