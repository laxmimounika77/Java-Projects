import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ask how many users we want to add
		System.out.println("Enter number of new students to enroll:");
		Scanner in =new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] student =new Student[numOfStudents];
		
		
		
		//create n number of students in the database
		for(int i=0; i<numOfStudents; i++) {
			student[i] = new Student();
			
			student[i].enroll();
			
			student[i].payTuition();
			
			System.out.println("Student Info: \n "+student[i].showInfo());
			
		}
		System.out.println("Enrolled "+numOfStudents+ " Students are: ");
		for(int i=0; i<numOfStudents; i++) {
			
			
			System.out.println("\n "+student[i].showInfo());

		}
		
		
		

	}

}
