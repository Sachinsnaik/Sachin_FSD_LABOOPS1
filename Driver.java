package Application;

import Services.AdminDepartment;
import Services.HrDepartment;
import Services.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment(); 
		ad.departmantName();
		ad.getTodaysWork();
		ad.getWorkDeadline(); 
		holiday(); 
		
		HrDepartment hd = new HrDepartment();
		hd.departmantName();
		hd.getTodaysWork(); 
		hd.getWorkDeadline();
		hd.doActivity();
		holiday();
		
		TechDepartment td = new TechDepartment();
		td.departmantName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStachInformation();
		holiday();
	
	}

	static void holiday() {
		System.out.println("Today is not a holiday");
		System.out.println("                      ");
														
	}

}