import java.lang.String;
import java.util.Scanner;
class employee{
	int empid;
	String name,address;
	float salary;
	employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid salary name adress ");
		this.empid=sc.nextInt();
		this.salary=sc.nextFloat();
		this.name=sc.next();
		this.address=sc.next();
	}
	void display(){
		System.out.printf("%5s%10s%10s%10s\n","empid", "salary", "name"," address");
		System.out.printf("%5d%10.0f%10s%10s",empid,salary,name,address);
	}
}
class teacher extends employee{
	String dept,subject;
	teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("dept subject");
		this.dept=sc.next();
		this.subject=sc.next();
	}
	void display(){
		
		super.display();
		System.out.println("\nDeaprtment\tSubject");
		System.out.printf("%5s%17s\n",dept,subject);
	}
	public static void main(String ab[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Employees");
		int x=sc.nextInt();
		teacher b[]=new teacher[x];
		for (int i=0;i<x;i++){
			 b[i]=new teacher();
		}
		for (int i=0;i<x;i++){
			b[i].display();
		}
		
	}
}