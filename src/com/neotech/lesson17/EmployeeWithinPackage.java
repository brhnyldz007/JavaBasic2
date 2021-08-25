package com.neotech.lesson17;

public class EmployeeWithinPackage {

	public static void main(String[] args) {

		Employee1 emp = new Employee1();
		Employee1.company = "Neotech";
		emp.empName = "Sahin";
		emp.empLastName = "Erol";
		emp.salary = 70;
//		emp.ssn = 12345;  //you can not access it from here
	
		emp.method1();
		emp.method2();
		emp.method3();
	//	emp.method4(); //not visible from here

		
		
	
	}
}
