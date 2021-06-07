package com.milo.ms.events;

import com.milo.ms.web.model.BeerDto;
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
