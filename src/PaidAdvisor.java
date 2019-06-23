
	public class PaidAdvisor extends Person {
		
		
		static double regularPayRate = 25;
		static double overtimePayRate = 1.5 * regularPayRate;
		static double specialPayRate = 50;
		static double hoursRegular = 0;
		static double regularWages = 0, overtimeWages = 0, specialWages = 0, totalHours = 0, wagesPaid = 0;
		static boolean specialSesh, overtime;
		static double hoursOvertime = 0;
		static double hoursSpecial = 0;
		public String wages;
		
		public String toString() 
		{
			String wages = Double.toString(wagesPaid);
			
	        return wages;	
	    }
		
		public static void getPayRate()
		{
			overtime = false;
			
				if ((totalHours - hoursSpecial) > 30) 
				{
				overtime = true;
				hoursRegular = 30;
				}
		}
		
		public static void calculatePay() 
		{
			if (specialSesh == true && overtime == true)
	        { 
				hoursOvertime = totalHours - (hoursSpecial + hoursRegular);
				
				hoursRegular = totalHours - hoursSpecial;
				
	            
	            
	            wagesPaid = (hoursRegular * regularPayRate) + (hoursOvertime * overtimePayRate) + (hoursSpecial * specialPayRate);
	        }
	        
				else 
					if (specialSesh == true && overtime == false) 
					{
						hoursRegular = totalHours - hoursSpecial;
								
						hoursOvertime = 0;
						
						wagesPaid = (hoursRegular * regularPayRate) + (hoursOvertime * overtimePayRate) + (hoursSpecial * specialPayRate) ;
					}
						else 
							if (specialSesh == false && overtime == true)
							{
								hoursSpecial = 0;
								hoursRegular = 30;
								hoursOvertime = totalHours - hoursRegular;
								wagesPaid = (hoursRegular * regularPayRate) + (hoursSpecial * specialPayRate) + (hoursOvertime * overtimePayRate);
							}
						
						
		}
		
		public static double getHoursWorked() 
		{
			return totalHours;
		}
		
		public void setNameRateHours(String first, String last) 
		{
			firstName = first;
			lastName = last;
		}
	}

