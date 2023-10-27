package com.gacrucis.challenge;

import java.time.Instant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gacrucis.challenge.dtos.BookingDTO;
import com.gacrucis.challenge.mappers.BookingMapper;
import com.gacrucis.challenge.models.Booking;
import com.gacrucis.challenge.models.Place;
import com.gacrucis.challenge.services.impls.MongoBookingServiceImpl;

@SpringBootTest
class ChallengeApplicationTests {

    private static final BookingMapper bookingMapper = Mappers.getMapper(BookingMapper.class);

	@Autowired
    private MongoBookingServiceImpl bookingService;

    private Booking testBookingA;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        Place testPlace = new Place();
        testPlace.setName("Test Place");

        this.testBookingA = new Booking();
        this.testBookingA.setId("A");
        this.testBookingA.setName("Test Booking A");
        this.testBookingA.setDepartureDateTime(Instant.now());
        this.testBookingA.setOrigin(testPlace);
        this.testBookingA.setDestination(testPlace);

    }

    @Test
    void testCreateBooking() {
        BookingDTO bookingDTO = bookingMapper.bookingToBookingDTO(this.testBookingA);

		// when(bookingRepository.save(any(Booking.class))).thenReturn(this.testBookingA);

        BookingDTO returned = bookingService.createBooking(bookingDTO);
        Assertions.assertEquals(this.testBookingA.getName(), returned.getName());
    }

    @Test
    void testUpdateBooking() {
        String updatedName = "Updated Name";
        BookingDTO bookingDTO = bookingMapper.bookingToBookingDTO(this.testBookingA);
        bookingDTO.setName(updatedName);

        // when(mongoTemplate.findAndReplace(any(Query.class), any(Booking.class))).thenReturn(this.testBookingA);

        bookingService.updateBooking(bookingDTO);
        BookingDTO returnedAgain = bookingService.updateBooking(bookingDTO);
        Assertions.assertEquals(updatedName, returnedAgain.getName());
    }
    @Test
    void testGetBooking() {
        BookingDTO returned = bookingService.getBookingById(this.testBookingA.getId());

        Assertions.assertEquals(this.testBookingA.getId(), returned.getId());
    }

    @Test
    void testDeleteBooking() {
        BookingDTO deleted = bookingService.deleteBookingById(this.testBookingA.getId());
        Assertions.assertEquals(this.testBookingA.getId(), deleted.getId());
    }
}
