package com.wittybrains.busbookingsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.busbookingsystem.dto.SeatDTO;
import com.wittybrains.busbookingsystem.model.Seat;
import com.wittybrains.busbookingsystem.repository.SeatRepository;

@RestController
@RequestMapping("/seat")
public class SeatController {
	
    private final SeatRepository seatRepository;
    
    public SeatController(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }
    
    @PostMapping("/createSeat")
    public ResponseEntity<Seat> createSeat(@RequestBody SeatDTO seatDTO) {
        try {
            Seat seat = new Seat();
            seat.setSeatNumber(seatDTO.getSeatNumber());
            //seat.setSeatType(seatDTO.getSeatType());
            //seat.setBookingStatus(BookingStatus.AVAILABLE);
            seat.setPrice(seatDTO.getPrice());
            seatRepository.save(seat);
            return ResponseEntity.status(HttpStatus.CREATED).body(seat);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
