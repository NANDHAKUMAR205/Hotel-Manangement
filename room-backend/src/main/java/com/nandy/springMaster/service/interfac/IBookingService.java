package com.nandy.springMaster.service.interfac;

import com.nandy.springMaster.entity.Booking;
import com.nandy.springMaster.dto.Response;   


public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
