package com.wipro.restapidemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapidemo.dto.Mobile;
import com.wipro.restapidemo.service1.MobileService;


	@RestController
	@RequestMapping("/mobile")
	public class MobileController {

		  @Autowired
		    MobileService service;
		
		    @PostMapping
		    public Mobile createMobile(@RequestBody Mobile mobile) {
		    	 System.out.println("Mobile added Successfully: "+mobile);
		        return service.createMobile(mobile);
		       
		    }

		    @GetMapping("/{id}")
		    public Mobile getMobileById(@PathVariable Integer id) {
		        return service.getMobileById(id);
		    }

		    @GetMapping
		    public List<Mobile> getAllMobiles() 
		    {
		        return service.getAllMobiles();
		    }

		    @PutMapping("/{id}")
		    public Mobile updateMobile(@PathVariable Integer id, @RequestBody Mobile mobile) {
		        return service.updateMobile(id, mobile);
		    }

		    @DeleteMapping("/{id}")
		    public String deleteMobile(@PathVariable Integer id) {
		        return service.deleteMobile(id);
		    }
}
