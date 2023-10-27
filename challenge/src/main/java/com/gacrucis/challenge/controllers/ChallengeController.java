package com.gacrucis.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gacrucis.challenge.dtos.BookingDTO;
import com.gacrucis.challenge.services.interfaces.IBookingService;

@RestController
@RequestMapping("/api/bookings")
public class ChallengeController {
    
    @Autowired
    IBookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO booking) {
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }

    @PutMapping
    public ResponseEntity<BookingDTO> updateBooking(@RequestBody BookingDTO booking) {
        return ResponseEntity.ok(bookingService.updateBooking(booking));
    }

    @GetMapping
    public ResponseEntity<BookingDTO> getBooking(@RequestParam String id) {
        return ResponseEntity.ok(bookingService.getBookingById(id));
    }

    @DeleteMapping
    public ResponseEntity<BookingDTO> deleteBooking(@RequestParam String id) {
        return ResponseEntity.ok(bookingService.deleteBookingById(id));
    }

}
