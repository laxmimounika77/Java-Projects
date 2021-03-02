import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		Random rand= new Random();
		
		//Game variables
		String[] enemies= {"Skeleton", "Zombie", "Warrior", "Assasin"};
		int maxEnemyHealth =75;
		int enemyAttackDamage =25;
		
		//player variables
		int health=100;
		int attackDamage =50;
		int numHealthPortions =3;
		int healthPortionHealAmount =30;
		int healthPortionDropChance =50;
		
		boolean running =true;
		
		System.out.println("Welcome to the Duneon!");
		
		GAME:
		while(running) {
			System.out.println("---------------------------------------");
			
			int enemyHealth =rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t#"+ enemy + "appeared! #\n");
			
			while(enemyHealth>0) {
				System.out.println("\tYour HP: "+health);
				System.out.println("\t"+ enemy + "'s HP: "+enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health portion");
				System.out.println("\t3. Run!");
				
				String input= in.nextLine();
				if(input.equals("1")) {
					int damageDealt=rand.nextInt(attackDamage);
					int damageTaken=rand.nextInt(enemyAttackDamage);
					
					enemyHealth-=damageDealt;
					health-=damageTaken;
					
					System.out.println("\t You strike the "+enemy+" for "+damageDealt+" damage");
					System.out.println("\t you receive the "+damageTaken+ " in retaliation");
					
					if(health<1) {
						System.out.println("\t You have taken too much damage, you are too weak to proceed");
						break;
					}
					
				}
				else if(input.equals("2")) {
					if(numHealthPortions>0) {
						health+=healthPortionHealAmount;
						numHealthPortions--;
						
						System.out.println("\t your current health is: "+health+ "You have "+numHealthPortions+" left");
					}
					
					else {
						System.out.println("\t You have no health portions left, defeat an enemy to get a random chance");
					}
					
				}
                else if(input.equals("3")) {
                	
                	System.out.println("\t Run away from the "+enemy+ "!");
                	continue GAME;
					
				}
                else {
                	System.out.println("\t Invalid Command!");
                }
				
				
			}
			
			if(health <1) {
				System.out.println("\t You limp out of the dungeon, weak from the battle");
			}
			
			System.out.println("---------------------------------------");
			System.out.println(" # "+enemy+" was defeated! #");
			System.out.println(" # You have "+health+ "HP left #");
			if(rand.nextInt(100)<healthPortionDropChance) {
				numHealthPortions++;
				System.out.println("The "+enemy+ "dropped a health portion!");
				System.out.println("You now have "+numHealthPortions+ " health portions left!");
			}
			
			System.out.println("---------------------------------------");
			System.out.println("What would you like to do now?");
			System.out.println("\t 1. Continue to fight Enemies");
			System.out.println("\t 2. Exit the dungeon");
			
			String  x=in.nextLine();
			
			while (!x.equals("1") &&  !x.equals("2")) {
				System.out.println("Invalid Input. Enter a valid input: ");
				x=in.nextLine();
			}
			if(x.equals("1")) {
				
				System.out.println("\t You continue on your adeventure");
				
			}
			
			else if(x.equals("2")) {
				System.out.println("\t You can exit the dungeon!");
				break;
				
			}
			
		}
		
		System.out.println("\t Thanks for playing!!!!!");

		

	}

}
