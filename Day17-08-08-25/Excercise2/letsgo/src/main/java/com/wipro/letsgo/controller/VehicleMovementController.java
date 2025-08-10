package com.wipro.letsgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;

import java.util.List;

@RestController
@RequestMapping("/move")
public class VehicleMovementController {
	@Autowired
   VehicleMovementService service;


    @PostMapping
    public ResponseEntity<VehicleMovement> moveVehicle(@RequestBody VehicleMovement movement) {
        VehicleMovement saved = service.save(movement);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<VehicleMovement>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}