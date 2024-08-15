import java.util.*;

class Calculator{
	float unit;
	double a , b , c , d , e ;
	
	Calculator(float unit, String type){
		
		this.unit = unit;
		
		if (type.equals("Old")){
			
			a = 400 * 4.6;
			b = 100 * 6.15;
			c = 100 * 8.15;
			d = 200 * 9.2;
			e = 200 * 10.2;
			
			System.out.println("Old cost : "+ printBill());
			
			
		}
		else if (type.equals("New")){
			
			a = 400 * 4.8;
			b = 100 * 6.45;
			c = 100 * 8.45;
			d = 200 * 9.65;
			e = 200 * 10.7;
			
			System.out.println("New cost : "+ printNewBill());
			
			
		}else
		{
			System.out.println("Invaild String format");
		}

	}
	
	public double printBill(){
		
		if(unit <= 400){
			
			return (unit*4.6);
			
			
		}
		else if (401 <= unit && unit <= 500) {
			
			return a+(unit-400)*6.15;
			
			
		}
		else if (501 <= unit && unit <= 600) {
			
			return  a+ b +(unit-500)*8.15;
			
			
		}
		else if (601 <= unit && unit <= 800) {
			
			return  a + b + c + ((unit-600)*9.2 );
			
			
		}		
		else if (801 <= unit && unit <= 1000) {
			
			return  a + b + c + d + (unit-800)*10.20;
			
			
		}
		else if (unit > 1000) {
			return  a + b + c + d + e + (unit-1000) * 11.25 ; 
			
		}
		else{
			System.out.println("Invaild value");
			return 0;
			
		}
		
	}
	
	public double printNewBill(){
		
		
		if(unit <= 400){
			
			return  (unit*4.8);
			
			
		}
		else if (401 <= unit && unit <= 500) {
			
			return  a+(unit-400)*6.15;
			
			
		}
		else if (501 <= unit && unit <= 600) {
			
			return  a+ b +(unit-500)*8.15;
			
			
		}
		else if (601 <= unit && unit <= 800) {
			return  a + b + c + ((unit-600)*9.2 );
			
			
		}		
		else if (801 <= unit && unit <= 1000) {
			
			return  a + b + c + d + (unit-800)*10.20;
			
			
		}
		else if (unit > 1000) {
			return  a + b + c + d + e + (unit-1000) * 11.25 ; 
			
		}
		else{
			System.out.println("Invaild value");
			return 0;
		}
		
	}
	
}


class Details{
	
	String name,type;
	int houseId;
	float unit;
	
	public void operator(){
		
		Scanner s = new Scanner(System.in);
			
		System.out.print("Enter your name : ");
		name = s.nextLine();
		
		System.out.print("Enter your house ID : ");
		houseId = s.nextInt();
		
		s.nextLine();
		
			
		System.out.print("Enter used unit : ");
		unit = s.nextFloat();
			
		s.nextLine();
			
		System.out.print("Enter type Old or New : ");
		type = s.nextLine();
			
		Calculator obj = new Calculator(unit,type);
		
	}
	
}

class ElectricBillCalculator{
	public static void main(String args[]){
		
		int choice;
		
		Scanner scan = new Scanner(System.in);
		
		
			while(true){
				System.out.println(" Enter choice :\n 1. Print bill\n 2. Exit");
				choice = scan.nextInt();
				
				switch (choice) {
					case 1 : 
						Details obj = new Details();
						obj.operator();
					break;
					
					case 2 :
						System.exit(0);
					break;
					
					default :
						System.out.println("Invaild choice");
						
				}
			
			}
		
		
		
	}
}