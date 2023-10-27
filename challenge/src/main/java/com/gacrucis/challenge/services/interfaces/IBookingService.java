package com.gacrucis.challenge.services.interfaces;

import com.gacrucis.challenge.dtos.BookingDTO;

public interface IBookingService {
    
    public BookingDTO createBooking(BookingDTO booking);
    public BookingDTO updateBooking(BookingDTO booking);
    public BookingDTO getBookingById(String id);
    public BookingDTO deleteBookingById(String id);

}
