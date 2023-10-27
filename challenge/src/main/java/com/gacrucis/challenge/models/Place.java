package com.gacrucis.challenge.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "places")
public class Place {
    
    @Id
    String id;

    String name;
    String postalCode;
}
