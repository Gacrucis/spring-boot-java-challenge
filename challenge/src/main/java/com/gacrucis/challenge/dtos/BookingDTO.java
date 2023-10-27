package com.gacrucis.challenge.dtos;

import java.io.Serializable;
import java.time.Instant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDTO implements Serializable {
    String id;

    String name;
    String email;

    PlaceDTO origin;
    PlaceDTO destination;

    Instant departureDateTime;
    Long durationMinutes;

}
