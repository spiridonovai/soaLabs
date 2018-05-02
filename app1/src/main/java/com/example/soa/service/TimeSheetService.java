package com.example.soa.service;

import java.util.List;

import com.example.soa.model.TimeSheet;

public interface TimeSheetService {
	public List<TimeSheet> getAll();
	
	public TimeSheet getTimeSheetById(Long id);
	public TimeSheet updateTimeSheet(TimeSheet timesheet);
	public void deleteTimesheet(Long id);
	public TimeSheet createTimeSheet(TimeSheet timesheet);
	
}
