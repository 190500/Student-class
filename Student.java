

import java.util.Scanner;

public class Student {
	int roll;
	int number;
	String name;
	 static int count = 0;
	float percentage;
	{
		count = count + 1;
	}
	Student(){
		roll = 0;
		name = null;
		percentage = 0.0f;	
		number = 0;
		
	}
	Student(int r, String n, int num, float per ){
		roll = r;
		name = n;
	    percentage = per;
	    number = num;
	    
	}
	
	public String toString(){
		return("Roll no: " + roll + " Name: " + name + " Number: " + number + " Percentage: " + percentage);
	}
	
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		Student s1 = new Student();
		System.out.println(s1);
		Student s2 = new Student(22,"Karan", 35, 35.3f );
		System.out.println(s2);
		Student s3 = new Student(23,"Rhea", 34, 34.3f );
		System.out.println(s3);
		
		
		
		System.out.println("Objects created: " + count);
	}
	
	
	
     
}
