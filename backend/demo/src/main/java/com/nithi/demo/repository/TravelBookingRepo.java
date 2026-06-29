package com.nithi.demo.repository;
import com.nithi.demo.model.TravelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TravelBookingRepo
            extends JpaRepository<TravelBooking, Integer>{

}

