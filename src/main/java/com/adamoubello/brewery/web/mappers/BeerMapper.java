package com.adamoubello.brewery.web.mappers;

import com.adamoubello.brewery.domain.Beer;
import com.adamoubello.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
