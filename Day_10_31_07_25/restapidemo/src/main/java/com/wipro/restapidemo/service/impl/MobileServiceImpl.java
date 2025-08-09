package com.wipro.restapidemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restapidemo.dto.Mobile;
import com.wipro.restapidemo.repo.MobileRepo;
import com.wipro.restapidemo.service1.MobileService;

@Service
public class MobileServiceImpl implements MobileService{

	 @Autowired
	     MobileRepo repository;

	    @Override
	    public Mobile createMobile(Mobile mobile) {
	        repository.save(mobile);
	        return mobile;
	    }

	    @Override
	    public Mobile getMobileById(Integer id) {
	        return repository.findById(id);
	    }

	    @Override
	    public List<Mobile> getAllMobiles() {
	        return repository.findAll();
	    }

	    @Override
	    public Mobile updateMobile(Integer id, Mobile mobile) {
	        Mobile existing = repository.findById(id);
	        if (existing != null) {
	            mobile.setId(id); 
	            repository.update(mobile);
	            return mobile;
	        }
	        return null;
	    }

	    @Override
	    public String deleteMobile(Integer id) {
	        boolean deleted = repository.delete(id);
	        return deleted ? "Mobile deleted successfully." : "Mobile not found.";
	    }
    
}
