package com.nithi.demo.controller;

import com.nithi.demo.model.TravelBooking;
import com.nithi.demo.service.TravelBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/travel")
public class TravelBookingController {

    @Autowired
    private TravelBookingService service;

    @PostMapping("/book")
    public String bookTrip(@RequestBody TravelBooking booking){

        service.saveBooking(booking);

        return "Trip Booked Successfully";
    }

    @GetMapping("/all")
    public List<TravelBooking> getBookings(){

        return service.getAllBookings();
    }
}