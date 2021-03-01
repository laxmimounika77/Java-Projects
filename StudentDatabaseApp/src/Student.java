import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private static int costOfCourse=600;
	private int tuitionBalance;
	private static int id= 1000;
	
	
	//constructor to prompt users to enter name and year
	public Student() {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Student first name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter Student last name: ");
		this.lastName=in.nextLine();
		
		System.out.println(" 1- Freshman \n 2- Sophomore \n 3- Junior \n 4- Senior");
		System.out.println("Enter Student grade year : ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName+ " "+lastName+" " +gradeYear+ " "+ studentID);
		
		
		
	
		
		
	
	
	}
	//generate id
	
	private void setStudentID() {
		//Grade level + Static ID
		id++;
		this.studentID = gradeYear + "" +id;
	}
	
	//Enroll in courses
	public void enroll() {
		//get inside a loop , user hits zero when he is done enrolling
		
		do {
		System.out.println("Enter to enroll (Q to quit):");
		Scanner in= new Scanner(System.in);
		String course=in.nextLine();
		course=course.toUpperCase();
		if(!course.equals("Q")) {
			courses= courses + "\n" +course;
			tuitionBalance= tuitionBalance+costOfCourse;
		}
		
		else {
			break;
		}
		
	}while(1 != 0);
		
		System.out.println("Enrolled in:"+courses);
		//System.out.println("Tuition Balance:"+tuitionBalance);
		
	}
	
	//view balance and pay tuition
	
	public void viewBalance() {
		System.out.println("Your balance is: "+tuitionBalance);
		
	}
	
	public void payTuition() {
		viewBalance();
		if(tuitionBalance ==0) {
			System.out.println("You do not have any outstaning balance to pay");
			
		}
		else {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your payment: ");
		int payment=in.nextInt();
		tuitionBalance= tuitionBalance-payment;
		System.out.println("Thank you for your paymnet of $"+payment);
		viewBalance();
		}
		
	}
	
	//show status
	public String showInfo() {
		
		return "Name:" +firstName +lastName +
				"\n Student ID: "+studentID +
				"\n Year: " + gradeYear +
				"\n Courses Enrolled: " +courses +
				"\n Balance: "+tuitionBalance ;
				
	}

}
