package Driver;
import Adapter.BuildAuto;
import Exception.AutoException;
import scale.*;
public class Driver4 {
	public static void main(String [] args) {
	AutoException healing = new AutoException();
	BuildAuto a = new BuildAuto();
	EditOptions opt = new EditOptions("Toyota_Prius", "transmission", "none", 0, "brakes", "brake", a);
	EditOptions opt2 = new EditOptions("Toyota_Prius", "transmission", "standard", -815, "color","paint", a);
	opt.start();
	try {
		Thread.sleep(2000);
	}
	catch (Exception e) {
		healing.handleAll(e);
	}
	opt2.start();
	}
}
/*
Car Name: Color:  Base Price: Transmission: Brakes/Traction Control: Side Impact Air Bags: Power Moonroof:
Focus_Wagon_ZTW Pitch_Black_Clearcoat 4000 automatic Standard included included
Toyota_Prius French_Blue_Clearcoat_Metallic 32000 standard ABS_with_Advanced_Traction none included
Honda_Civic Sangria_Red_Clearcoat_Metallic 20000 Standard standard included none
Tesla_Model_S Pitch_Black_Clearcoat 60000 Standard Standard none included
Toyota_Highlander CD_Silver_Clearcoat_Metallic 30000 automatic ABS none none
Car Name: Color:  Base Price: Transmission: Brakes/Traction Control: Side Impact Air Bags: Power Moonroof:
Focus_Wagon_ZTW Pitch_Black_Clearcoat 4000 automatic Standard included included
Toyota_Prius French_Blue_Clearcoat_Metallic 32000 standard ABS_with_Advanced_Traction none included
Honda_Civic Sangria_Red_Clearcoat_Metallic 20000 Standard standard included none
Tesla_Model_S Pitch_Black_Clearcoat 60000 Standard Standard none included
Toyota_Highlander CD_Silver_Clearcoat_Metallic 30000 automatic ABS none none
Editing Options for 11
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: none Price: 0 
Type of Option: brakes and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
Updating Option Set Name for 11
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: none Price: 0 
Type of Option: test and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
Editing Options for 17
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: standard Price: -815 
Type of Option: test and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
Updating Option Set Name for 17
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: standard Price: -815 
Type of Option: brakes and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 

*/
