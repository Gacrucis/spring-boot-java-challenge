package com.gacrucis.challenge.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gacrucis.challenge.models.Place;

public interface PlaceRepository extends MongoRepository<Place, String>{
    
}
