package Util;

import java.io.*;
import Model.*;
import Model.Properties;
import Exception.*;
import java.util.*;
public class FileIO {
	public LinkedHashMap<Integer, Automotive> readFile(String filename, LinkedHashMap<Integer, Automotive> a) {
		AutoException healing = new AutoException();
		try {
			int counter = 0;
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				counter++;
				if (line == null) {
					eof = true;
				} else if (counter == 1) {
					System.out.println(line);
				} else if (counter >= 2) {
					tokenize(a.get(counter - 2), line);
					System.out.println(line);
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error ­­ " + e.toString() + "\n");
			healing.handleAll(e);
		}
		return a;
	}
	public void tokenize(Automotive a, String x) {
		int counter = 0;
		int num = 0;
		StringTokenizer token = new StringTokenizer(x);
		while (token.hasMoreTokens()) {
			if (counter == 0) {
				a.setAutoName(token.nextToken());
			}
			if(counter == 1) {
				String temp = token.nextToken();
				a.newOptionSet("color", 1);//makes new Optionset at index 0  with name color and size of 1 
				a.setOption(0, temp, 0); //makes new Option at index 0 with
			}
			if(counter == 2) {
				String price = token.nextToken();
				a.setPrice(Integer.parseInt(price));
			}
			if(counter == 3) {
				a.newOptionSet("transmission", 1);
				String holder = token.nextToken();
				if(holder.equalsIgnoreCase("standard"));
				{
					num = -815;
				}
				a.setOption(1, holder, num);

			}
			if(counter == 4) {
				num = 0;
				String holder = token.nextToken();
				a.newOptionSet("brakes",  1);
				if(holder.equalsIgnoreCase("ABS")){
					num = 400; 
				}
				if(holder.equals("ABS_with_Advanced_Traction")) {
					num = 1625;
				}
				else num = 0;
				a.setOption(2, holder, num);
			}
			if(counter == 5) {
				num = 0;
				String holder = token.nextToken();
				a.newOptionSet("airbags",1);
				if(holder.equalsIgnoreCase("included")) {
					num = 350;
				}
				a.setOption(3, holder, num);			
				}
			if(counter == 6) {
				num = 0;
				String holder = token.nextToken();

				a.newOptionSet("power moonroof", 1);
				if(holder.equalsIgnoreCase("included")) {
					num = 595;
				}
				a.setOption(4, holder, num);
			}
			counter++;
		}
	}
	public void AutoSerialize(Automotive a) {
		String filename = "file.ser";
		try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(a);
		System.out.println("Object has been serialized");
		out.close();
		file.close();
		}
		catch (IOException ie){
			System.out.println("IO Execption:" + ie);
		}
	}
	public void Deserialize(String filename) {
		Automotive a[] = new Automotive [5];
		for(int i = 0; i < a.length; i++) {
			a[i] = new Automotive(null, 0 ,5);
		}
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			System.out.println("Deseralized Data: " + in.readObject().toString());
		}
		catch(IOException ie) {
			System.out.println("IO Exception has been caught");
		}
		catch(ClassNotFoundException ie) {
			System.out.println("Class not found exception caught");
		}
	}
	public LinkedHashMap<Integer, Properties> loadin(String filename, LinkedHashMap <Integer, Properties> prop) {
		AutoException healing = new AutoException();
		String x[] = new String [8];
		try {
			int counter = 0;
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				counter++;
				if (line == null) {
					eof = true;
				}
				else if (counter >= 1) {
					System.out.println(line);
					x = tokenize2(line);
					prop.get(counter - 1).setString("carMake", x[0]);
					prop.get(counter - 1).setString("carType", x[1]);
					prop.get(counter - 1).setString("color", x[2]);
					prop.get(counter - 1).setString("price", x[3]);
					prop.get(counter - 1).setString("transmission", x[4]);
					prop.get(counter - 1).setString("brakes", x[5]);
					prop.get(counter - 1).setString("airbags", x[6]);
					prop.get(counter - 1).setString("moonroof", x[7]);
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error ­­ " + e.toString() + "\n");
			healing.handleAll(e);
		}
		return prop;
	}
	public String[] tokenize2(String x) {
		String strings[] = new String [8];
		StringTokenizer token= new StringTokenizer(x);
		int i = 0;
		while(token.hasMoreTokens()) {
			strings[i] = token.nextToken();
			i++;
		}
		return strings;
	}
}
