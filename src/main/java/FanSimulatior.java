import java.util.Scanner;

public class FanSimulatior {
	public static void main(String [] args) {
		CeilingFanInterface ceilingFan = new Fan();
		int input = 1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("There is a ceiling fan in the room where you are now.");
		
		
			while(input != -1) {
				try {
					
					System.out.println("\nEnter '1' to pull the first cord to change the speed"
							+ "\nEnter '2' to pull the second cord to "
							+ "\nEnter '-1' to exit");
					
					if(ceilingFan.isReverse() == true) {
						System.out.println("\nReverse on");
					}
					else System.out.println("\nReverse off");
					
					
					input = s.nextInt();	//get the input
					
					switch(input) {
						case 1:				//if the user enters '1' that means they pulled cord 1
							ceilingFan.pullCord1();
							break;
						case 2: 			//if the user enters '2' that means they pulled cord 2
							ceilingFan.pullCord2();
							break;
					}
					
					if(input > 2 || input < 1) {
						System.out.println("Please enter number '1' or '2'");
					}
				}
				
				catch(Exception e) {
					input = 0;					//set to zero to continue the loop
					s.next(); 
					System.out.println("Please enter a valid number from 1 to 2");
					
				}
			}
			s.close();
	}
}
