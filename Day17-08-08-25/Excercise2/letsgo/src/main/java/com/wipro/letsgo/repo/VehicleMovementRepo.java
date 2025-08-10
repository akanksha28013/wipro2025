package com.wipro.letsgo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.letsgo.entity.VehicleMovement;

public interface VehicleMovementRepo extends JpaRepository<VehicleMovement, Long> {

}
