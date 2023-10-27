package com.gacrucis.challenge.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gacrucis.challenge.models.Booking;

public interface BookingRepository extends MongoRepository<Booking, String>{
    
}
