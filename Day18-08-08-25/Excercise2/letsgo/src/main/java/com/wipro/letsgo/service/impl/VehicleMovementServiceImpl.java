package com.wipro.letsgo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repo.VehicleMovementRepo;
import com.wipro.letsgo.service.VehicleMovementService;

@Service
public class VehicleMovementServiceImpl implements VehicleMovementService {
	@Autowired
    VehicleMovementRepo repo;


    @Override
    public VehicleMovement save(VehicleMovement movement) {
    
        return repo.save(movement);
    }

    @Override
    public List<VehicleMovement> getAll() {
        return repo.findAll();
    }
}
