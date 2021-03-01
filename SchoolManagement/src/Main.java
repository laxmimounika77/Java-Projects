import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher mart= new Teacher(1, "mart", 500);
		Teacher cart= new Teacher(1, "cart", 500);
		Teacher part = new Teacher(1, "part", 500);
		
		List<Teacher> teacherList =new ArrayList<>();
		teacherList.add(mart);
		teacherList.add(cart);
		teacherList.add(part);
		
		Student prill= new Student(1, "prill", 7);
		Student srill= new Student(1, "srill", 5);
		Student mrill = new Student(1, "mrill", 8);
		
		List<Student> studentList =new ArrayList<>();
		studentList.add(prill);
		studentList.add(srill);
		studentList.add(mrill);
		
		School school= new School(teacherList, studentList);
		System.out.println("School has earned" + school.getTotalMoneyEarned());
		
		
		
		

	}

}
