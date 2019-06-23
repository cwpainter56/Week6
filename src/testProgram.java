import java.util.Scanner;

public class testProgram extends PaidAdvisor {

	public static void main(String[] args) {

		Scanner scanman = new Scanner(System.in);
		Scanner special = new Scanner(System.in);
		
		System.out.println("Enter total number of hours worked:");
		
		totalHours = scanman.nextDouble();
		
		
		System.out.println("Did you work for a special session? (true or false)");
		
		specialSesh = special.nextBoolean();
		
		
			if (specialSesh == true) 
			{
				System.out.println("How many hours did you work in the special session?");
				hoursSpecial = scanman.nextDouble();
			}
			else
			
				if (specialSesh == false) 
				{
			
					hoursSpecial = 0;
				
				}
			
			 scanman.close();
			 special.close();
			 
			 getPayRate();
			 
			 System.out.println("You worked " + totalHours + " total hours this pay period.");
			
			 calculatePay();
			 
			 System.out.println(hoursRegular + " regular hours, " + hoursOvertime + " overtime hours, and " + hoursSpecial + " special hours.");
			 
			 System.out.println("You were paid: $" + wagesPaid);
			}
			
	
}

