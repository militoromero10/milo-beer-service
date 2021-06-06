package com.milo.ms.events;

import com.milo.ms.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
