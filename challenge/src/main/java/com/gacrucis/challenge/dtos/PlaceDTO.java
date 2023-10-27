package com.gacrucis.challenge.dtos;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceDTO implements Serializable{

    String id;

    String name;
    String postalCode;
}
