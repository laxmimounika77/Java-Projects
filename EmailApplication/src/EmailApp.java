import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inn=new Scanner(System.in);
		Email eml1= new Email("John", "Doe");
		
		System.out.println("New worker information set up");
		System.out.println(eml1.showInfo());
		
	
		//reset mailCapacity
		System.out.println("\n Do you want to reset the mailbox capacity? Please enter 1 for yes and 0 for no");
		int x=inn.nextInt();
		if(x == 1) {
			System.out.println("Enter the new Mail box capacity:");
			int newCapacity= inn.nextInt();
			eml1.setMailBoxCapacity(newCapacity);
			System.out.println("New mail box capacity is set to: " +eml1.getNewMailboxCapacity());
		}
		
		
		
		System.out.println(eml1.showInfo());
		
		//reset password
		System.out.println("\n Do you want to reset the password? Please enter 1 for yes and 0 for no");
				
				int y=inn.nextInt();
				if(y == 1) {
					System.out.println("Enter the new password:");
					String newPassword= inn.nextLine();
				
					eml1.changePassword(newPassword);
				
					System.out.println("New password is set to: " +eml1.getPassword());
				}
				
				
		System.out.println(eml1.showInfo());
		
		
		
		
		
		

	}

}
