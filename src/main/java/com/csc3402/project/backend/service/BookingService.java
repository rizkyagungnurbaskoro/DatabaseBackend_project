package com.csc3402.project.backend.service;

import com.csc3402.project.backend.model.Booking;
import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<Booking> getAllBookings();
    Optional<Booking> getBookingById(Integer id);
    Booking createBooking(Booking booking);
    void deleteBooking(Integer id);
}
