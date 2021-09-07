package org.emp;

public class Employee {
		
			public void empId() {

		System.out.println("8889");
		}
		public void empName() {
			
			System.out.println("Rajesh Kumar");
		}
		public void empDob() {
			
			System.out.println("24/08/90");
		}
		public void empMob() {
			
			System.out.println("9361888889");
		}
		public void empEmail() {
		
			System.out.println("mail2rajaesh@gmail.com");
		}
		public void empAddress() {
			System.out.println("Tirupur");
		
		}
		public static void main(String[] args) {
			Employee details = new Employee();
			details.empId();
			details.empName();
			details.empDob();
			details.empMob();
			details.empEmail();
			details.empAddress();
		}
		}
