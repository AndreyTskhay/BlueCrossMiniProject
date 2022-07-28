public class Fan implements CeilingFanInterface{
	
	private int speed;
	private boolean reverse;
	
	//no argument constructor with default settings
	public Fan() {
		speed = 0;
		reverse = false;
	}
	
	public Fan(int s, boolean r) {
		speed = s;
		reverse = r;
	}
	
	//speed change cord
	public void pullCord1() {
		if(speed >= 3 && reverse == false) {		//if at max speed and not in reverse set the speed to 0
			speed = 0;
		}
		else if(speed <= 0 && reverse == true) {	//if at the minimum speed and not in reverse set the speed to 0
			speed = 3;
		}
		else if (reverse == false) {				//if not in reverse and the speed is 0-3, speed up
			speed++;
		}
		else if (reverse == true) {					//if in reverse and the speed is 0-3, speed down
			speed--;
		}
		else System.out.println("Something went wrong");
		
		System.out.println("The current fan speed is " + speed);
	}
	
	public void pullCord2() {
		
		if(reverse == true) {
			reverse = false;
			//System.out.println("\nReverse off");
		}
		
		else if(reverse == false) {
			reverse = true;
			//System.out.println("\nReverse on");
		}
		
	}
	
	public boolean isReverse() {	//returns true if the fan is in reverse
		return reverse;
	}
	
}
