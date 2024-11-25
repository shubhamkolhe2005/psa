package com.app.controller;

import com.app.exceptions.BusException;
import com.app.exceptions.LoginException;
import com.app.model.Bus;
import com.app.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BusController {
	@Autowired
	private BusService  bService;
		
	@PostMapping("/save/{key}")
    public ResponseEntity<Bus> createBus(@Valid @RequestBody Bus bus,@PathVariable("key") String key)throws BusException, LoginException {
		
        return new ResponseEntity<Bus>(bService.addBus(bus,key),HttpStatus.OK);
    } 
	
	@GetMapping("/find/{busId}")
    public ResponseEntity<Bus> getBusById(@PathVariable int busId)throws BusException{
		
		return new ResponseEntity<Bus>(bService.viewBus(busId),HttpStatus.OK); 
    }
		
	
	@PutMapping("/update/{key}")
    public ResponseEntity<Bus> updateBusById(@Valid @RequestBody Bus bus,@PathVariable("key") String key)throws BusException, LoginException {
		
		return new ResponseEntity<Bus>(bService.updateBus(bus,key),HttpStatus.OK);
    }
	
	@DeleteMapping("/delet/{busId}/{key}")
    public ResponseEntity<Bus> deleteRouteById(@PathVariable int busId,@PathVariable("key") String key)throws BusException, LoginException {
		
		return new ResponseEntity<Bus>(bService.deleteBus(busId,key),HttpStatus.OK);
    }
	
	@GetMapping("/buses/{busType}")
	public ResponseEntity<List<Bus>> getBusesByType(@PathVariable("busType") String busType) throws BusException{
		
		List<Bus> listOfBuses=bService.viewBusByType(busType);
		
		return new ResponseEntity<List<Bus>>(listOfBuses,HttpStatus.OK);
	}
	
	
	@GetMapping("/buses")
	public ResponseEntity<List<Bus>> getAllBuses() throws BusException{
		
		List<Bus> listOfBuses=bService.viewAllBuses();
		
		return new ResponseEntity<List<Bus>>(listOfBuses,HttpStatus.OK);
	}

}
