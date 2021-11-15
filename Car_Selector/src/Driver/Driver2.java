package Driver;
import Adapter.*;

public class Driver2 {
	public static void main(String [] args){
		String filename = "/Users/benjaminchen/Desktop/Benjamin/programs/Car_Selector.txt";
		BuildAuto a1 = new BuildAuto();
		a1.buildAuto(filename);
		a1.printAuto("Toyota_Prius");
		a1.UpdateOptionPrice("Toyota_Prius", "transmission", "none", 0);
		a1.printAuto("Toyota_Prius");
	}

}
/*
Car Name: Color:  Base Price: Transmission: Brakes/Traction Control: Side Impact Air Bags: Power Moonroof:
Focus_Wagon_ZTW Pitch_Black_Clearcoat 4000 automatic Standard included included
Toyota_Prius French_Blue_Clearcoat_Metallic 32000 standard ABS_with_Advanced_Traction none included
Honda_Civic Sangria_Red_Clearcoat_Metallic 20000 Standard standard included none
Tesla_Model_S Pitch_Black_Clearcoat 60000 Standard Standard none included
Toyota_Highlander CD_Silver_Clearcoat_Metallic 30000 automatic ABS none none
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: standard Price: -815 
Type of Option: brakes and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: none Price: 0 
Type of Option: brakes and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
*/