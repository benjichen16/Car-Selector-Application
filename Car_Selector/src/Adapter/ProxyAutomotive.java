package Adapter;
import Model.*;
import Model.Properties;
import Util.FileIO;
import java.util.*;
public abstract class ProxyAutomotive extends Thread{
	private static LinkedHashMap <Integer,Automotive> a1 = new LinkedHashMap<Integer, Automotive>();
	private static LinkedHashMap <Integer, Properties> p1 = new LinkedHashMap<Integer, Properties>();
	private boolean a = true;
	public void UpdateSetName(String modelName, String OptionSetname, String newName) {
		int temp = 0;
		for(int i = 0; i < a1.size(); i++) {
			if(a1.get(i).getAutoName().equalsIgnoreCase(modelName)) {
				temp = i;
			}
		}
		a1.get(temp).setOptionSetName(a1.get(temp).findOptionSet(OptionSetname), newName);
	}
	
	public void buildAuto(String filename) {
		String holder = null;
		int holder2 = 0, holder3 = 5;
		for(int i = 0; i <5; i++) {
			a1.put(i , new Automotive(holder, holder2, holder3));
		}
		FileIO io = new FileIO();
		io.readFile(filename, a1);
	}
	
	public void printAuto(String Modelname) {
		for(int i = 0; i < a1.size(); i++) {
			if(a1.get(i).getAutoName().equalsIgnoreCase(Modelname)) {
				a1.get(i).print();
			}
		}
	}
	public void UpdateOptionPrice(String modelName, String Optionname, String newName, int price) {
		int temp = 0;
		String holder = null;
		for(int i = 0; i < a1.size(); i++) {
			if(a1.get(i).getAutoName().equalsIgnoreCase(modelName)) {
				holder = a1.get(i).getAutoName();
				temp = i;
			}
		a1.get(temp).setOptionNamePrice(a1.get(temp).findOptionSet(Optionname), newName, price);
	}
	}
	public void buildProperties(String filename) {
		FileIO io = new FileIO();
		for(int i = 0; i <2; i++) {
			p1.put(i , new Properties(null, null, null, null, null, null , null, null));
			a1.put(i , new Automotive(null, 0, 5));

		}
		io.loadin(filename, p1);
		
		for(int i = 0; i < p1.size(); i++) {
			a1.get(i).setValues(p1.get(i).getProperty("carMake") +" "+ p1.get(i).getProperty("carType"), p1.get(i).getProperty("color"), Integer.parseInt(p1.get(i).getProperty("price")), p1.get(i).getProperty("transmission"), p1.get(i).getProperty("brakes"), p1.get(i).getProperty("airbags"), p1.get(i).getProperty("moonroof"));
			a1.get(i).setOptionChoice("transmission", p1.get(i).getProperty("transmission"));
			a1.get(i).setOptionChoice("brakes",p1.get(i).getProperty("brakes"));
			a1.get(i).setOptionChoice("moonroof",p1.get(i).getProperty("moonroof"));
			a1.get(i).setOptionChoice("airbags", p1.get(i).getProperty("airbags"));
			a1.get(i).print();
			System.out.println("Total Price for Car: $" + a1.get(i).getTotalPrice());
		}
	}
	public void serialize() {
		FileIO io = new FileIO();
		for(int i = 0; i < a1.size(); i++) {
			io.AutoSerialize(a1.get(i));
		}
	}
	public String[] getAllModels() {
		String x[] = new String [p1.size()];
		for(int i = 0; i <= p1.size(); i++) {
			x[i] = p1.get(i).getProperty("carType");
		}
		return x;
	}
	public Automotive getAutomotive(int x) {
		return a1.get(x);
	}
	public void configureAuto() {
		Scanner input = new Scanner(System.in);
		System.out.printf("What Car would  you like to change? \n1. %s \n2. %s", a1.get(0).getAutoName(), a1.get(1).getAutoName());
		int x = input.nextInt();
		System.out.print("What option would you like to change: \n");
			for(int i = 0; i < 5; i++) {
					System.out.printf( i+ 1 + ". Option Name: %s and Option Set: \n", a1.get(x-1).getOptionSetName(i), a1.get(x-1).getOptionName(i));
				}
			int y = input.nextInt();
			if(y == 1){
			System.out.println("What would you like to change it to:");
			String color = input.next();
			a1.get(x-1).setOptionChoice("color", color);
		}
			if(y == 2) {
				System.out.println("What would you like to change the transmission to: automatic or standard");
				String transmission;
				transmission = input.next();
				if(!transmission.equals("automatic") && !transmission.equals("standard")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				a1.get(x-1).setOptionChoice("transmission", transmission);
			}
			if(y == 3) {
				System.out.println("What would you like to change the brakes to: ABS or standard or ABS with Advanced Traction?");
				String brakes = input.next();
				if(!brakes.equals("standard") && !brakes.equals("ABS") && !brakes.equals("ABS with Advanced Traction")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				a1.get(x-1).setOptionChoice("brakes", brakes);
			}
			if(y == 4) {
				System.out.println("What would you like to change the airbags to: included or none");
				String airbags = input.next();
				if(!airbags.equals("included") && !airbags.equals("none")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				a1.get(x-1).setOptionChoice("airbags", airbags);
			}
			if(y == 5) {
				System.out.println("What would you like to change the moonroof to: included or none");
				String moonroof = input.next();
				if(!moonroof.equals("included") && !moonroof.equals("none")) {
					System.out.println("Incorrect Input");
					System.exit(1);
				}
				a1.get(x-1).setOptionChoice("moonroof", moonroof);
			}
			a1.get(x-1).print();
			System.out.println("Total Price: $"+a1.get(x-1).getTotalPrice());
	}
}