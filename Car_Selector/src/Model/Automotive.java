package Model;
import java.io.*;
import java.util.*;
import Model.OptionSet.Options;
public class Automotive extends Thread implements Serializable{
	private String name;
	private int price;
	private ArrayList<OptionSet> optset = new ArrayList<OptionSet>();
	private int size;
	private String nameHolder;
	private int intHolder = 2;
	public Automotive(String name, int price, int size) {
		this.name = name;
		this.price = price;
		for(int i = 0; i < optset.size(); i++) {
			optset.add(new OptionSet(nameHolder, intHolder));
		}
	}
	public synchronized String getAutoName() {
		return name;
	}
	public synchronized int getSize() {
		return size;
	}
	public synchronized int getPrice() {
		return price;
	}
	public void setValues(String name, String color,int price, String transmission,String brakes, String airbags, String moonroof) {
		setAutoName(name);
		setPrice(price);
		for(int i = 0; i < 5 ; i++) {
			newOptionSet(null, 1);
		}
		optset.get(0).setName("color");
		optset.get(1).setName("transmission");
		optset.get(2).setName("brakes");
		optset.get(3).setName("airbags");
		optset.get(4).setName("moonroof");
		optset.get(0).setOptionSet(0,color, 0);
		optset.get(1).setOptionSet(0,transmission, 0);
		optset.get(2).setOptionSet(0,brakes, 0);
		optset.get(3).setOptionSet(0,airbags, 0);
		optset.get(4).setOptionSet(0,moonroof, 0);
		
	}
	public synchronized void setOptionChoice(String x, String y) {
		if(x.equalsIgnoreCase("transmission") && y.equalsIgnoreCase("automatic")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(0);
		}
		else if(x.equalsIgnoreCase("transmission")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(-815);}
		
		if(x.equalsIgnoreCase("brakes") && y.equalsIgnoreCase("standard")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(0);
		}
		else if(x.equalsIgnoreCase("brakes") && y.equalsIgnoreCase("ABS")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(400);}
		else if(x.equalsIgnoreCase("brakes")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(1625);
		}
		
		if(x.equalsIgnoreCase("airbags") && y.equalsIgnoreCase("none")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(0);
		}
		else if(x.equalsIgnoreCase("airbags")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(350);}
		
		if(x.equalsIgnoreCase("moonroof") && y.equalsIgnoreCase("none")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(0);
		}
		else if(x.equalsIgnoreCase("moonroof")){
			findOptionSet(x).getOption(0).setName(y);
			findOptionSet(x).getOption(0).setPrice(595);}
		if(x.equalsIgnoreCase("color")) {
			findOptionSet(x).getOption(0).setName(y);
		}
		System.out.println("Option choice changed for " + x + " to " +y);
	}
	public synchronized Options getOptionChoice(String x) {
		return findOptionSet(x).getOption(0);
	}
	public synchronized int getOptionChoicePrice(String x) {
		return findOptionSet(x).getOption(0).getPrice();
	}
	public synchronized String getOptionChoiceName(String x) {
		return findOptionSet(x).getOption(0).getName();
	}
	public synchronized int getTotalPrice() {
		int temp = 0;
		temp = temp + price;
		for(int i = 0; i < optset.size(); i++) {
			for(int j = 0; j < 1; j++) {
				temp = temp + optset.get(i).getOption(j).getPrice();
			}
		}
		return temp;
	}
	public synchronized OptionSet getOptionSet(int i) {
		return optset.get(i);
	}
	public synchronized ArrayList<OptionSet> getOptionSets() {
		return optset;
	}
	public synchronized ArrayList <Options> getOptions(int x) { 
		return optset.get(x).getOptions();
	}
	public synchronized Options getOption(int x, int y){
		return optset.get(x).getOption(y);
	}
	
	public synchronized void setAutoName(String x) {
		name = x;
	}
	public synchronized void setPrice(int x) {
		price = x;
	}
	public synchronized void setSize(int x) {
		size = x;
	}
	public synchronized void setOptionSets(ArrayList<OptionSet> a) {
		optset = a;
	}
	public synchronized void setOptionSet(int x, OptionSet a) {
		optset.get(x).setName(a.getName());
		optset.get(x).setSize(a.getSize());
	}
	public synchronized void setOption(int x, String name, int price) {
		optset.get(x).addOption(optset.get(x).newOption(name, price));
	}
	public synchronized void setOptionSetName(OptionSet x, String name) {
		x.setName(name);
	}
	public synchronized void setOptionNamePrice(OptionSet x, String newName, int newPrice) {
		x.getOption(0).setName(newName);
		x.getOption(0).setPrice(newPrice);
	}
	public synchronized void newOption(int x, int y, String name, int price) {
		optset.get(x).getOption(y).setName(name);
		optset.get(x).getOption(y).setPrice(price);
	}
	public synchronized void newOptionSet(String name,int size) {
		optset.add(new OptionSet(name, size));
	}
	public synchronized OptionSet findOptionSet(String x) {
		for(int i = 0; i < optset.size() ;i++) {
			if(optset.get(i).getName().equalsIgnoreCase(x)) {
				return optset.get(i);
			}
		}
		System.out.println("OptionSet not found");
		return optset.get(0);
	}
	public String getOptionSetName(int x) {
		return optset.get(x).getName();
	}
	public String getOptionName(int x) {
		return optset.get(x).getOptionName();
	}
	public synchronized void print() {
		System.out.printf("Automotive Name: %s and Automotive Base Price: %d\n", name, price);
		for(int i = 0; i < optset.size(); i++) {
			optset.get(i).print();
		}
	}
}
