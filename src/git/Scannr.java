package git;

import java.util.Scanner;

public class Scannr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Ent a name\n");
		String a = sc.next();
		System.out.println("age\n");
		int b = sc.nextInt();
		System.out.println("salary\n");
		float c = sc.nextFloat();
		
		System.out.println("Employee name is  :"+a);
		System.out.println(a+"'s Age is  :"+b);
		System.out.println(a+"'s Salary is "+c);
		sc.close();

	}

}
