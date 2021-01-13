package com.test.json.dto;

import java.util.List;

/**
 * 
 * @author Ravi
 *
 */
public class DataDTO {
	private String title;
	private Employee employee;
	private List<PersonalDetailsDTO> personal_details;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<PersonalDetailsDTO> getPersonal_details() {
		return personal_details;
	}
	public void setPersonal_details(List<PersonalDetailsDTO> personal_details) {
		this.personal_details = personal_details;
	}	
}
