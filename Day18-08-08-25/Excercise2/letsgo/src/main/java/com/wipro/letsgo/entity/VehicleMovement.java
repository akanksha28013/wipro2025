package com.wipro.letsgo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "vehicle_movement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    
    @Column(name = "vehical_ID")
     Integer vehId;
    @Column(name = "latitude")
     Double lat;
    @Column(name = "longitude")
     Double longitude;
}
