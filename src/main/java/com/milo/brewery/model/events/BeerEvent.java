package com.milo.brewery.model.events;

import com.milo.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 8947416792330681769L;

    private BeerDto beerDto;
}
