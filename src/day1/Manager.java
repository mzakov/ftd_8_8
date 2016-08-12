package day1;

import java.util.ArrayList;

public class Manager {
	

//	public String toString() {
//	    return "something";
//	}
	
	Manager(double defaultSalary){
		this.defaultSalary = defaultSalary;
	}
	
	ArrayList<Employee> employee = new ArrayList<>();
	
	double defaultSalary;
	double happiness = 0;
	

	void hire(Employee peon){
		peon.getJob(defaultSalary, this);
		employee.add(peon);
	
		
	}
	
	void askEmployeeIfHappy(Employee emp){
		System.out.println(emp.firstName + " " + emp.lastName + " is happy: " + emp.areYouHappy());
	}
	
	int notHappyCount = 0;
	
	void askIfAllHappy(){
		for(int i=0; i<employee.size(); i++){
			if(employee.get(i).areYouHappy() == false){
				notHappyCount++;
			}			
	}
			happiness = (double)(employee.size() - notHappyCount)/(double)employee.size()*100;
			System.out.println("Number of employees: " + employee.size());
			System.out.println("Numer of unhappy ppl: " + notHappyCount);
			
			System.out.println("The Happiness level is " + happiness +"%");
}
}
