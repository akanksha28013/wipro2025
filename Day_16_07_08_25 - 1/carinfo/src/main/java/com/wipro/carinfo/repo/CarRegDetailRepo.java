package com.wipro.carinfo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.carinfo.Entity.CarRegDetail;
public interface CarRegDetailRepo extends JpaRepository<CarRegDetail, Integer>{

}
