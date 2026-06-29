package com.nithi.demo.service;

import com.nithi.demo.model.LoginRegistry;
import com.nithi.demo.model.TravelBooking;
import com.nithi.demo.repository.LoginRegistryRepo;
import com.nithi.demo.repository.TravelBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelBookingService {
        @Autowired
        private TravelBookingRepo
                repo;

        public void saveBooking(TravelBooking booking){
            repo.save(booking);
        }

        public List<TravelBooking> getAllBookings(){
            return repo.findAll();
        }
    }

