package com.example.soa.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.soa.model.TimeSheet;
import com.example.soa.model.User;
import com.example.soa.repository.TimeSheetRepository;
import com.example.soa.service.TimeSheetService;


@RestController
@RequestMapping("/timesheet")
public class TimesheetController {
	
	@Autowired
	private TimeSheetService service;
	 @RequestMapping(value = "/all",method=RequestMethod.GET)
	 public List<TimeSheet> getAll() {
		 return service.getAll();
	 }
	 @RequestMapping(value = "/{id}",method=RequestMethod.GET)
	 public TimeSheet findById (@PathVariable Long id ) {
		 return service.getTimeSheetById(id);
	 }
	 @RequestMapping(value = "/",method=RequestMethod.POST)
	 public TimeSheet createTimeSheet (@RequestBody TimeSheet timesheet ) {
		 return service.createTimeSheet(timesheet);
	 }
	 @RequestMapping(value = "/",method=RequestMethod.PUT)
	 public TimeSheet updateTimeSheet (@RequestBody TimeSheet id ) {
		 return service.updateTimeSheet(id);
	 }
	 @RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	 public void deleteTimeSheetById (@PathVariable Long id ) {
		 service.deleteTimesheet(id);
	 }
	 
}
