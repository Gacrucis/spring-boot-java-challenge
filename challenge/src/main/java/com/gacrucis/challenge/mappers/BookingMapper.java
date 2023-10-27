package com.gacrucis.challenge.mappers;

import org.mapstruct.Mapper;

import com.gacrucis.challenge.dtos.BookingDTO;
import com.gacrucis.challenge.models.Booking;

@Mapper(uses = {PlaceMapper.class})
public interface BookingMapper {
    BookingDTO bookingToBookingDTO(Booking booking);

    Booking bookingDTOToBooking(BookingDTO bookingDTO);
}
