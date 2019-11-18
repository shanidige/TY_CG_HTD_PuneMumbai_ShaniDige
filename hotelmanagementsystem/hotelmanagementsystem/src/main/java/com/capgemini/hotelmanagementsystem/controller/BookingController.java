package com.capgemini.hotelmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hotelmanagementsystem.bean.BookingInfoBean;
import com.capgemini.hotelmanagementsystem.exception.HotelManagementSystemExceptionController;
import com.capgemini.hotelmanagementsystem.response.HotelManagementResponse;
import com.capgemini.hotelmanagementsystem.service.BookingInfoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class BookingController {
	@Autowired
	public BookingInfoService bookingInfoService;

	HotelManagementResponse hotelManagementResponse = new HotelManagementResponse();

	@PostMapping("/booking")
	public HotelManagementResponse booking(@RequestBody BookingInfoBean bookingInfoBean, @RequestParam int hotelId,
			@RequestParam int roomId) throws HotelManagementSystemExceptionController {
		boolean roomBooking = bookingInfoService.bookingInfo(bookingInfoBean, hotelId, roomId);

		if (roomBooking) {
			hotelManagementResponse.setStatusCode(201);
			hotelManagementResponse.setMessage("Success");
			hotelManagementResponse.setDescription("Room Booked Successfully");
		} else {
			hotelManagementResponse.setStatusCode(401);
			hotelManagementResponse.setMessage("Failed");
			hotelManagementResponse.setDescription("Room Not Available");
		}
		return hotelManagementResponse;
	}// end of booking()

	@GetMapping("/getBookedRoomList")
	public HotelManagementResponse getRoomList() throws HotelManagementSystemExceptionController {
		List<BookingInfoBean> boookedRoomList = bookingInfoService.bookedRoomList();
		if (boookedRoomList != null && !boookedRoomList.isEmpty()) {
			hotelManagementResponse.setStatusCode(201);
			hotelManagementResponse.setMessage("Success");
			hotelManagementResponse.setDescription("boookedRoomList ");
			hotelManagementResponse.setBoookedRoomList(boookedRoomList);
		} else {
			hotelManagementResponse.setStatusCode(401);
			hotelManagementResponse.setMessage("Failed");
			hotelManagementResponse.setDescription("Unable to fetch boookedRoomList ");
		}
		return hotelManagementResponse;
	}// end of getBookedRoomList()

	@DeleteMapping("/cancelBooking")
	public HotelManagementResponse cancelBooking(@RequestParam int bookingId, @RequestParam int roomId,
			@RequestParam int hotelId) throws HotelManagementSystemExceptionController {
		boolean canceled = bookingInfoService.cancelBooking(bookingId, hotelId, roomId);
		if (canceled) {
			hotelManagementResponse.setStatusCode(201);
			hotelManagementResponse.setMessage("Success");
			hotelManagementResponse.setDescription("Booking Canceled Successfully");
		} else {
			hotelManagementResponse.setStatusCode(401);
			hotelManagementResponse.setMessage("Failed");
			hotelManagementResponse.setDescription("Unable to Cancel Booking");
		}
		return hotelManagementResponse;
	}// end of cancelBooking()

	@GetMapping("/days")
	public HotelManagementResponse days(@RequestParam int bookingId) throws HotelManagementSystemExceptionController {
		float days = bookingInfoService.getDays(bookingId);
		if (days > 0.0) {
			hotelManagementResponse.setStatusCode(201);
			hotelManagementResponse.setMessage("Success");
			hotelManagementResponse.setDescription("Days" + days);
		} else {
			hotelManagementResponse.setStatusCode(401);
			hotelManagementResponse.setMessage("Failed");
			hotelManagementResponse.setDescription("Unable");
		}
		return hotelManagementResponse;
	}// end of days()

	@GetMapping("/getBill")
	public HotelManagementResponse getBill(@RequestParam int bookingId)
			throws HotelManagementSystemExceptionController {
		double totalAmount = bookingInfoService.getBill(bookingId);
		if (totalAmount > 0.0) {
			hotelManagementResponse.setStatusCode(201);
			hotelManagementResponse.setMessage("Success");
			hotelManagementResponse.setDescription("Days" + totalAmount);
		} else {
			hotelManagementResponse.setStatusCode(401);
			hotelManagementResponse.setMessage("Failed");
			hotelManagementResponse.setDescription("Unable");
		}
		return hotelManagementResponse;
	}// end of getBill()

}
