
public class Student {
	
	private int studentID;
	private String studentName;
	private int studentGrade;
	private static  int feesPaid;
	private static int feesTotal;
	
	/**
	 * 
	 * @param studentID unique student id
	 * @param studentName name of the student
	 * @param studentGrade grade of the student
	 */
	
	public Student(int studentID, String studentName, int studentGrade) {
		this.feesPaid=0;
		this.feesTotal= 30000;
		this.studentID=studentID;
		this.studentName=studentName;
		this.studentGrade=studentGrade;
		
		
	}
	/**
	 * 
	 * @param studentGrade new student grade after updation
	 */

	public void setGrade(int studentGrade) {
		this.studentGrade=studentGrade;
		
	}
	/**
	 * 
	 * @param fees the amount to be paid and added to the feesPaid
	 */
	
	public void payFees(int fees) {
		this.feesPaid+=fees;
		
		
	}
	/**
	 * 
	 * @return student id
	 */
	public int getStudentID() {
		return  studentID;
		
	}
	
	/**
	 * 
	 * @return student grade
	 */
	
	public int getStudentGrade() {
		return studentGrade;
		
	}
	
	/**
	 * 
	 * @return student name
	 */
	public String getStudentName() {
		return studentName;
		
	}
	
	/**
	 * paid fees by the student
	 * @return
	 */
	public int getFeesPaid() {
		return feesPaid;
		
	}
	
	/**
	 * the total fees of the student
	 * @return
	 */
	
	public int getFeesTotal() {
		return feesTotal;
		
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
		
	}
	
	
	
	
}
