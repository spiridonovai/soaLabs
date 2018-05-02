package com.example.soa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soa.model.TimeSheet;
import com.example.soa.repository.TimeSheetRepository;
import com.example.soa.service.TimeSheetService;

@Service
public class TimeSheetServiceImpl implements TimeSheetService{
	
	@Autowired
	TimeSheetRepository timesheetRepository;

	@Override
	public List<TimeSheet> getAll() {
		return timesheetRepository.findAll();
	}

	@Override
	public TimeSheet getTimeSheetById(Long id) {
		Optional<TimeSheet> timesheet = timesheetRepository.findById(id);
		if(timesheet.isPresent()) {
			return timesheet.get();
		}
		return null;
	}

	@Override
	public TimeSheet updateTimeSheet(TimeSheet timesheet) {
		// TODO Auto-generated method stub
			return 	timesheetRepository.save(timesheet); 
	}

	@Override
	public void deleteTimesheet(Long id) {
		// TODO Auto-generated method stub
		timesheetRepository.deleteById(id);
	}

	@Override
	public TimeSheet createTimeSheet(TimeSheet timesheet) {
		// TODO Auto-generated method stub
		return timesheetRepository.save(timesheet);
	}

}
