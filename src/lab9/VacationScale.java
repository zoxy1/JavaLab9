package lab9;

public class VacationScale {
	private int[] vacationDays;
	public void setVacationScale (){
		vacationDays=new int[7];
		vacationDays[0]=10; 	
		vacationDays[1]=15; 
		vacationDays[2]=15; 
		vacationDays[3]=15; 
		vacationDays[4]=20; 
		vacationDays[5]=20; 
		vacationDays[6]=25; 
		
	}
	 public void displayVacationDays(int yearsOfService){
		 if(yearsOfService>=0&&yearsOfService<=5){
		 System.out.println("Ваш отпуск: "+vacationDays[yearsOfService]+" дней"); 
		 }
		 else
		 {
			 if(yearsOfService>5)	{
				 System.out.println("Ваш отпуск: 25 дней");	
			 }
		 }
		
		}
}
