package Driver;

import Util.*;
import Model.Automotive;
import java.util.*;

public class Driver3 {
	public static void main(String[] args) {
		String holder = null;
		int holder2 = 0, holder3 = 5;
		String filename = "/Users/benjaminchen/Desktop/Benjamin/programs/Car_Selector.txt";
		LinkedHashMap<Integer, Automotive> a = new LinkedHashMap<Integer, Automotive>();
		for(int i = 0; i <5; i++) {
			a.put(i,new Automotive(holder, holder2, holder3));
		}
		Set set = a.entrySet();
		Iterator iterator = set.iterator();
		
	     while(iterator.hasNext()) {
	            Map.Entry me = (Map.Entry)iterator.next();
	            System.out.print("Key is: "+ me.getKey() +  "& Object is is: "+me.getValue()+"\n");
	     }
		FileIO io = new FileIO();
		for(int i = 0; i < 5; i++) {
		io.AutoSerialize(a.get(i));
		io.Deserialize("file.ser");
		}
		io.readFile(filename, a);
		for(int i = 0; i < 5; i++) {
			a.get(i).print();
			System.out.printf("Total Price: %d\n", a.get(i).getTotalPrice());
			System.out.println(a.get(i).getOptionChoiceName("transmission"));
			System.out.println(a.get(i).getOptionChoicePrice("transmission"));
			a.get(i).setOptionChoice("transmission","standard");
			System.out.println(a.get(i).getOptionChoiceName("airbags"));
			System.out.println(a.get(i).getOptionChoicePrice("airbags"));
		}
	}

}
/*
 * 
 *
Output:
Key is: 0& Object is is: Model.Automotive@4b1210ee
Key is: 1& Object is is: Model.Automotive@4d7e1886
Key is: 2& Object is is: Model.Automotive@3cd1a2f1
Key is: 3& Object is is: Model.Automotive@2f0e140b
Key is: 4& Object is is: Model.Automotive@7440e464
Object has been serialized
Deseralized Data: Model.Automotive@3f91beef
Object has been serialized
Deseralized Data: Model.Automotive@37bba400
Object has been serialized
Deseralized Data: Model.Automotive@254989ff
Object has been serialized
Deseralized Data: Model.Automotive@37f8bb67
Object has been serialized
Deseralized Data: Model.Automotive@20ad9418
Car Name: Color:  Base Price: Transmission: Brakes/Traction Control: Side Impact Air Bags: Power Moonroof:
Focus_Wagon_ZTW Pitch_Black_Clearcoat 4000 automatic Standard included included
Toyota_Prius French_Blue_Clearcoat_Metallic 32000 standard ABS_with_Advanced_Traction none included
Honda_Civic Sangria_Red_Clearcoat_Metallic 20000 Standard standard included none
Tesla_Model_S Pitch_Black_Clearcoat 60000 Standard Standard none included
Toyota_Highlander CD_Silver_Clearcoat_Metallic 30000 automatic ABS none none
Automotive Name: Focus_Wagon_ZTW and Automotive Base Price: 4000
Type of Option: color and its status: Pitch_Black_Clearcoat Price: 0 
Type of Option: transmission and its status: automatic Price: -815 
Type of Option: brakes and its status: Standard Price: 0 
Type of Option: airbags and its status: included Price: 350 
Type of Option: power moonroof and its status: included Price: 595 
Total Price: 4130
automatic
-815
Option choice changed for transmission to standard
included
350
Automotive Name: Toyota_Prius and Automotive Base Price: 32000
Type of Option: color and its status: French_Blue_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: standard Price: -815 
Type of Option: brakes and its status: ABS_with_Advanced_Traction Price: 1625 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
Total Price: 33405
standard
-815
Option choice changed for transmission to standard
none
0
Automotive Name: Honda_Civic and Automotive Base Price: 20000
Type of Option: color and its status: Sangria_Red_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: Standard Price: -815 
Type of Option: brakes and its status: standard Price: 0 
Type of Option: airbags and its status: included Price: 350 
Type of Option: power moonroof and its status: none Price: 0 
Total Price: 19535
Standard
-815
Option choice changed for transmission to standard
included
350
Automotive Name: Tesla_Model_S and Automotive Base Price: 60000
Type of Option: color and its status: Pitch_Black_Clearcoat Price: 0 
Type of Option: transmission and its status: Standard Price: -815 
Type of Option: brakes and its status: Standard Price: 0 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: included Price: 595 
Total Price: 59780
Standard
-815
Option choice changed for transmission to standard
none
0
Automotive Name: Toyota_Highlander and Automotive Base Price: 30000
Type of Option: color and its status: CD_Silver_Clearcoat_Metallic Price: 0 
Type of Option: transmission and its status: automatic Price: -815 
Type of Option: brakes and its status: ABS Price: 0 
Type of Option: airbags and its status: none Price: 0 
Type of Option: power moonroof and its status: none Price: 0 
Total Price: 29185
automatic
-815
Option choice changed for transmission to standard
none
0
*/