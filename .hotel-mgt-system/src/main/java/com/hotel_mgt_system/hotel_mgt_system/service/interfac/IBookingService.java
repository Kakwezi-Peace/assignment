package com.hotel_mgt_system.hotel_mgt_system.service.interfac;

import com.hotel_mgt_system.hotel_mgt_system.dto.Response;
import com.hotel_mgt_system.hotel_mgt_system.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
