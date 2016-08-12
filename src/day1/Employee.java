package day1;

public class Employee {

	Employee (String firstName, String lastName, double desiredSalary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.desiredSalary = desiredSalary;
	}
	
	String firstName;
	
	String lastName;
	
	double salary;
	
	boolean happy;
	
	Manager manager;
	
	double desiredSalary;
	
	
	
	void getJob(double salary, Manager manager){
		this.salary = salary;
		this.manager = manager;
		
		if(salary>desiredSalary){
			happy = true;
		}else{
			happy = false;
		}
	}
	
	boolean areYouHappy(){
		return happy;
			
		
	}
	
	void askFriendIfHappy(Employee friend){
		System.out.println(friend.areYouHappy());
	}

}
