package com.wipro.subjectproducer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.wipro.subjectproducer.dto.Subject;
import com.wipro.subjectproducer.service.SubjectService;


@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectService subjectkService;
	
	@PostMapping
	void sendStockData(@RequestBody Subject subject)
	{
		subjectkService.sendSubjectData(subject);
	}


}
