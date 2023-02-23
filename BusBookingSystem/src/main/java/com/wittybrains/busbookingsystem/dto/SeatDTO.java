package com.wittybrains.busbookingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wittybrains.busbookingsystem.model.BookingStatus;
import com.wittybrains.busbookingsystem.model.Seat;
import com.wittybrains.busbookingsystem.model.SeatType;
@JsonInclude(value = Include.NON_NULL)
public class SeatDTO {

    public SeatDTO(Seat seat) {
		super();
		this.seatNumber = seat.getSeatNumber();
		//this.seatType = seat.g;
		//this.bookingStatus = seatbookingStatus;
		this.price = seat.getPrice();
		//this.bus = bus;
	}
	public SeatDTO() {
		super();
	}
	private String seatNumber;
    private SeatType seatType;
    private BookingStatus bookingStatus;
    private double price;
    //private BusDTO bus;
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	 public BusDTO getBus() {
//	        return bus;
//	    }
//
//	    public void setBus(BusDTO bus) {
//	        this.bus = bus;
//	    }
		public BookingStatus getBookingStatus() {
			return bookingStatus;
		}
		public void setBookingStatus(BookingStatus bookingStatus) {
			this.bookingStatus = bookingStatus;
		}

}
