package day1;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		/*	
		int[] intArray = {1,2,3,4,5,6,7};
		
		for(int i : intArray){
			System.out.println(i);
		}
		
		
		ArrayList<String> str = new ArrayList<>();
		
		str.add("Add a new string");
		str.add("Another string");
		str.add("Another string2");
		str.add("Another string3");
		
		
		str.get(0);
		
		str.add(0, "newerea");
		
		str.set(1, "one");
		
		str.remove(2);
		
		for(String s: str){
			System.out.println(s);
		}
		
		ArrayList<Integer> in = new ArrayList<>();
				
		Integer i = 5; // autoboxing!!
		*/
		
		Manager bob = new Manager(random());
		
		//Manager tom = new Manager(24999);
		
		Employee guy = new Employee("Tom", "Johnes", random());
		Employee donny = new Employee("John", "X", random());
		Employee sandy = new Employee("Sandy", "Rogers", random());
		Employee sandy1 = new Employee("Sandy1", "Rogers", random());
		Employee sandy2 = new Employee("Sandy2", "Rogers", random());
		Employee sandy3 = new Employee("Sandy3", "Rogers", random());
		Employee sandy4 = new Employee("Sandy4", "Rogers", random());
		Employee sandy5 = new Employee("Sandy5", "Rogers", random());
		
		System.out.println(guy.desiredSalary);
		
		System.out.println(donny.desiredSalary);
		System.out.println(sandy.desiredSalary);
		System.out.println(sandy1.desiredSalary);
		System.out.println(sandy2.desiredSalary);
		System.out.println(sandy3.desiredSalary);
		System.out.println(sandy4.desiredSalary);
		System.out.println(sandy5.desiredSalary);
		
		bob.hire(guy);
		bob.hire(donny);
		bob.hire(sandy);
		bob.hire(sandy1);
		bob.hire(sandy2);
		bob.hire(sandy3);
		bob.hire(sandy4);
		bob.hire(sandy5);
		
		bob.askIfAllHappy();
		System.out.println(guy.manager);
		System.out.println(guy.firstName + " " + guy.lastName +  "'s salary is $" + guy.salary);
		
		donny.happy = false;
		
		sandy.happy = true;
		
		
	    
	   
		
		/*
	//	guy.askFriendIfHappy(donny);
	//	guy.askFriendIfHappy(sandy);
		
		bob.askEmployeeIfHappy(guy);
		
		
		boolean b = true;
	//	byte y =0;
	//	short s = 0;
		int x = 0;
	//	long l = 0L;
		
	//	float f = 0.0f;
		double d = 0.0;
		
	//	char c = 'A';
		
		String st = "Hello World";
		
		
		
		
		int i = 0;
		// "the box"   action    cast      "the shape"- that have to fit in the box 
		double mod        =      (int)      13D / 3.0;
		
		System.out.println(st + " mod= " + mod);
		
		
		boolean isLessThan = 7 < 8;
		boolean bb = 0 != 1;
		boolean bb2 = !(0==1);
		
		
		
		if(isLessThan){
			System.out.println("Is less than!");
		}
		else {
			System.out.println("Is not less than!");
		}
		
		
//		while (i<=10) {
//			System.out.println("Printing: " + i);
//			i++;
//		}
		
		do {
			i++;
			System.out.println("Printing: " + i);
		} while (i<10);
		
		
		
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
		
		Iterator<Integer> it = list.interator();
	
		
		int[] array = {0,1,2,3,4,5};
		
		for(int j : array) {
			System.out.println("Printing: " + j);
		}


		
//		for(int i = 0, j = 0; i < 10; i++) {
//			System.out.println("Printing: " + i);
//		}
		
	//5 = 5*4*3*2*1
	//1,1,2,3,5,8,13
		//int f = 5;
		
	
		int input = 5;
		
		
		int res = 1;
		for (int i=input; i >= 1; i--) {
			res = res * i;
		}
		System.out.println("Factorial of " + input + " is: " + res);
		
		
		  int a = 1; 
		  int next = 1;
		  for(int n=0; n<res; ++n) {
		  		next += a;
		  		a = next - a;
		  }
		  System.out.println("The Fibonachi # is: " + a);
		 
		
		long fib = 1;
		for (long i=1, x=1, temp=0; i < res; i++) {
			temp = fib; //puts the fib # into temp
			fib += x;   //calculates the current fib #
			x = temp;   //puts the previous fib # into x
		}
		System.out.println("The Fibonachi # at index " + res + " is: " + fib);
	*/
	}
	
	static double random() {
		Random r = new Random(); 
	    double d = 15000.0 + r.nextDouble() * 70000.0;
	    return d;
		}
		
}
