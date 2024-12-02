package com.hotel_mgt_system.hotel_mgt_system.repo;

import com.hotel_mgt_system.hotel_mgt_system.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
