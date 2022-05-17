package design_pattern;

import java.util.Scanner;

public class Wardrobe_store {

	public static void main(String[] args) {
		int rate=0;
		System.out.println("Choose the material type to your wardrobe:-1)Real wood, 2)Metal, 3)Compressed wood");
		wardrobe w1;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int mtrl= sc.nextInt();    
		
		if(mtrl==1) {
			w1=new Realwood();
			System.out.println("choose the door type:-1) Two door,2) Three door");
			mtrl =sc.nextInt();
			
			if(mtrl==1) {
				w1.doorType("Two door");
				rate+=75000;
			}else if(mtrl==2) {
				w1.doorType("Three door");
				rate+=95000;
				
			}
		}
		else if(mtrl==2) {
			w1=new Metal();
			System.out.println("choose the door type:-1) Two door,2) Three door");
			mtrl =sc.nextInt();
			
			if(mtrl==1) {
				w1.doorType("Two door");
				rate+=70000;
			}else if(mtrl==2) {
				w1.doorType("Three door");
				rate+=80000;
			}
		}else if(mtrl==3) {
			w1=new Compressedwood();
			System.out.println("choose the door type:-1) Two door,2) Three door");
			mtrl =sc.nextInt();
			
			if(mtrl==1) {
				w1.doorType("Two door");
				rate+=55000;
			}else if(mtrl==2) {
				w1.doorType("Three door");
				rate+=75000;
			}
		}
		

		int choice;
			do {
				System.out.println("choose the add-ons you wish:- 1) Locker \n 2) Mirror  \n 3) Drawer \n 4) Exra shelf \n 5) Extra hanging rod \n 6) Done");
			choice=sc.nextInt();
				if (choice==1) {
					rate+=5000;
					System.out.println("Added");
				}
				else if (choice==2) {
					rate+=4000;
					System.out.println("Added");
				}
				else if (choice==2) {
					rate+=4000;
					System.out.println("Added");
				}else if (choice==3) {
					rate+=2000;
					System.out.println("Added");
				}else if (choice==4) {
					rate+=500;
					System.out.println("Added");
				}else if (choice==5) {
					rate+=500;
					System.out.println("Added");
				}
			}while(choice != 6);
			
		
System.out.println("Your total bill amounts upto " + rate);
	}

}
