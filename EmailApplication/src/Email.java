import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String alternateEmail;
	private String email;
	private int mailBoxCapacity;
	private int defaultPasswordLength =10;
	private String password;
	
	//constructor to received first and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		//System.out.println("Email created"+this.firstName+ " "+this.lastName);
		
		//department assignmnet and storing
		this.department=setDepartment();
		//System.out.println("Department :"+this.department);
		
		//password generation and storing
		this.password=generatePassword(defaultPasswordLength);
		//System.out.println("Password :"+this.password);
		
		//combine elements to generate email
		email= firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".com";
		//System.out.println("Email created is:"+email);

	}
	
	//ask for the department
	private String setDepartment() {
		System.out.println("Enter the department Codes \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for None");
		Scanner scan=new Scanner(System.in);
		int deptChoice=scan.nextInt();
		if(deptChoice ==1) {
			return "Sales";
		}
		else if(deptChoice ==2) {
			return "Dev";
		}
		else if(deptChoice ==3) {
			return "Acct";
		}
		else {
			return "";
		}
	}
	
	//generate a random password
	private String generatePassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
		char[] password =new char[length];
		for(int i=0;i<length;i++) {
			int rand= (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		
		return new String(password);
		
	}
	
	
	
	
	//set mailbox capacity
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
		
	}
	
	//set alternate email
	public void setAlternateEmail(String altEMail) {
		this.alternateEmail=altEMail;
		
	}
	
	//change password
	public void changePassword(String password) {
		this.password=password;
		
	}
	
	//get Methods
	public String getPassword() {
		return password;
	}
	
	public String getAlternateEMail() {
		return password;
	}

	
	public int getNewMailboxCapacity() {
		return mailBoxCapacity;
	}
	
	public String showInfo() {
		return "\n Display Name:"+firstName + " "+lastName +
				"\n Company email: "+ email + 
				"\n Mail Box Capacity: "+mailBoxCapacity;
		
	}


}
