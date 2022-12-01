package com.greedy.onoff.classes.dto;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassesScheduleDto {
	
	private Long scheduleCode;
	private Long classCode;
	private String dayName;
	private String timeName;

}
