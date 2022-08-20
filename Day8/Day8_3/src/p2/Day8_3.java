package p2;

import java.util.Scanner;



import p1.Options;

public class Day8_3 {
	 
	static int menu()
		{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("0.EXIT\n1.Add\n2.SUB\n3.MUL\n4.DIV");
			System.out.println("Enter the choice");
			
			int choice = sc.nextInt();
			
			return choice;
			
		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		do {
			int choice = menu();
			System.out.println("Enter two number");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			Options x = null;
			
			 if(choice == 0)
				 x = Options.EXIT;
			 else if(choice == 1)
				 x = Options.ADD;
			 else if(choice == 2)
				 x = Options.SUB;
			 else if(choice == 3)
				 x = Options.MUL;
			 else if(choice == 4)
				 x = Options.DIV;
			 else
				 System.out.println("INVALID");
			
			switch(x)
			{
			case EXIT :
					break;
			case ADD :
				
				System.out.println("Addition is :"+(n1+n2));
				break;
				
			case SUB :
				
				System.out.println("Subtraction is :"+(n1-n2));
				break;
				
			case MUL :
				
				System.out.println("Multiplication is :"+(n1*n2));
				break;
				
			case DIV :
			
			
				if( n2!= 0)
					System.out.println("Division is :"+(n1/n2));
				else
					System.out.println("Can not divide by zero");
				break;
				
			default:
				break;
			}
			System.out.println("Do you want to countinue? yes(1) or no(0)");
			 a = sc.nextInt();
			
			
		}while(a!= 0);
		sc.close();
		

	}
}


