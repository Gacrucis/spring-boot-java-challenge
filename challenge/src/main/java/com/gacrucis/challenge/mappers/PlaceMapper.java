package com.gacrucis.challenge.mappers;

import org.mapstruct.Mapper;

import com.gacrucis.challenge.dtos.PlaceDTO;
import com.gacrucis.challenge.models.Place;

@Mapper
public interface PlaceMapper {

    PlaceDTO placeToPlaceDTO(Place place);

    Place placeDTOToPlace(PlaceDTO placeDTO);
}
