package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;

import com.example.demo.model.Reservation;

import com.example.demo.repository.ReservationRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class BusReservationController {

	@Autowired
	private ReservationRepository reservationRepository;
	
	//get all data
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Reservations")
	public List <Reservation> getAllReservation(){
		return reservationRepository.findAll();
	}  
	
	
	
	//create 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/CreateReservation")
	public Reservation createEmployee(@RequestBody Reservation reservation)
	{
		return reservationRepository.save(reservation);
	}
	
	
	// get data by id 
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/reservation/{id}")
	public ResponseEntity<Reservation> getByID(@PathVariable Long id) {
		Reservation reservation = reservationRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("reservation with id "+id+"does not exists"));
		return ResponseEntity.ok(reservation);
	}
	
	
	//update data 
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping ("/reservations/{id}")
	public ResponseEntity<Reservation> updateEmployeeByID(@PathVariable Long id, @RequestBody Reservation reservationDetails){
		Reservation reservation = reservationRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("reservation with id "+id+"does not exists"));
		
		reservation.setPassengerName(reservationDetails.getPassengerName());
		reservation.setBusNumber(reservationDetails.getBusNumber());
		reservation.setDate(reservationDetails.getDate());
		reservation.setSeatNumber(reservationDetails.getSeatNumber());
		
		Reservation updatedReservation=reservationRepository.save(reservation);
		
		return ResponseEntity.ok(updatedReservation);
}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/reservations/{id}")
	public ResponseEntity <Map<String, Boolean> >deleteEmployee(@PathVariable Long id){
		
		
		Reservation reservation = reservationRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Reservation with id "+id+"does not exists"));
		
		reservationRepository.delete(reservation);
		
		Map<String, Boolean>  response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	
}
	
}