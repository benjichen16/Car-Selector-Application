
package client;

import Model.*;
import java.util.*;

public class SelectCarOptions {

	////////// PROPERTIES //////////
	private Scanner input = new Scanner(System.in);

	////////// CONSTRUCTORS //////////

	public SelectCarOptions() {

	}

	////////// INSTANCE METHODS //////////

	public void configureAuto(Automotive obj) {
		if(!isAutomobile(obj)) {
			System.out.println("Object is not automotive");
			System.exit(1);
		}
		System.out.print("What option would you like to change: \n");
			for(int i = 0; i < 5; i++) {
					System.out.printf( i+ 1 + ". Option Name: %s and Option Set: \n", obj.getOptionSetName(i), obj.getOptionName(i));
				}
			int y = input.nextInt();
			if(y == 1){
			System.out.println("What would you like to change it to:");
			String color = input.next();
			obj.setOptionChoice("color", color);
		}
			if(y == 2) {
				System.out.println("What would you like to change the transmission to: automatic or standard");
				String transmission;
				transmission = input.next();
				if(!transmission.equals("automatic") && !transmission.equals("standard")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				obj.setOptionChoice("transmission", transmission);
			}
			if(y == 3) {
				System.out.println("What would you like to change the brakes to: ABS or standard or ABS with Advanced Traction?");
				String brakes = input.next();
				if(!brakes.equals("standard") && !brakes.equals("ABS") && !brakes.equals("ABS with Advanced Traction")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				obj.setOptionChoice("brakes", brakes);
			}
			if(y == 4) {
				System.out.println("What would you like to change the airbags to: included or none");
				String airbags = input.next();
				if(!airbags.equals("included") && !airbags.equals("none")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				obj.setOptionChoice("airbags", airbags);
			}
			if(y == 5) {
				System.out.println("What would you like to change the moonroof to: included or none");
				String moonroof = input.next();
				if(!moonroof.equals("included") && !moonroof.equals("none")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				obj.setOptionChoice("moonroof", moonroof);
			}
			obj.print();
			System.out.println("Total Price: $"+obj.getTotalPrice());
	}

	public boolean isAutomobile(Object obj) {
		boolean isAutomobile = false;

		try {
			Automotive a1 = (Automotive) obj;
			isAutomobile = true;
		}
		catch (ClassCastException e) {
			isAutomobile = false;
		}

		return isAutomobile;
	}

}
