package com.wipro.letsgo.service;

import java.util.List;

import com.wipro.letsgo.entity.VehicleMovement;

public interface VehicleMovementService {
	
	VehicleMovement save(VehicleMovement movement);
    List<VehicleMovement> getAll();

}
