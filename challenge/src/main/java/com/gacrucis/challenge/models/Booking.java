package com.gacrucis.challenge.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "bookings")
public class Booking {
    
    @Id
    String id;

    String name;
    String email;

    Place origin;
    Place destination;

    Instant departureDateTime;
    Long durationMinutes;
}
