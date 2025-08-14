package com.nandy.springMaster.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nandy.springMaster.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
