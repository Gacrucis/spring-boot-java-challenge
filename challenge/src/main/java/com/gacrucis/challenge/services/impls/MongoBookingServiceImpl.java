package com.gacrucis.challenge.services.impls;

import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.gacrucis.challenge.dtos.BookingDTO;
import com.gacrucis.challenge.mappers.BookingMapper;
import com.gacrucis.challenge.models.Booking;
import com.gacrucis.challenge.repositories.BookingRepository;
import com.gacrucis.challenge.services.interfaces.IBookingService;

@Service
public class MongoBookingServiceImpl implements IBookingService{
    
    @Autowired
    private BookingRepository bookingRepository;

    private static final BookingMapper bookingMapper = Mappers.getMapper(BookingMapper.class);

    @Autowired 
    private MongoTemplate mongoTemplate;

    @Override
    public BookingDTO createBooking(BookingDTO booking) {
        Booking created = bookingRepository.save(bookingMapper.bookingDTOToBooking(booking));

        return bookingMapper.bookingToBookingDTO(created);
    }

    @Override
    public BookingDTO updateBooking(BookingDTO booking) {
        // Find the object to be updated
        Query query = new Query(Criteria.where("id").is(booking.getId()));

        // Perform the replacement
        Booking replaced = mongoTemplate.findAndReplace(query, bookingMapper.bookingDTOToBooking(booking));

        return bookingMapper.bookingToBookingDTO(replaced);
    }

    @Override
    public BookingDTO getBookingById(String id) {
        Optional<Booking> found = bookingRepository.findById(id);

        return found.map(bookingMapper::bookingToBookingDTO).orElse(null);
    }

    @Override
    public BookingDTO deleteBookingById(String id) {
        Optional<Booking> found = bookingRepository.findById(id);

        if (found.isPresent()) {
            bookingRepository.deleteById(id);
            return bookingMapper.bookingToBookingDTO(found.get());
        } else {
            return null;
        }
    }
    
    
}
