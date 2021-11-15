package Model;

import java.io.*;
import java.util.*;
public class OptionSet implements Serializable {
	public class Options implements Serializable{
		protected String name;
		protected int price;
		public Options(String name, int price) {
			this.name = name;
			this.price = price;
		}
		protected String getName() {
			return name;
		}
		protected int getPrice() {
			return price;
		}
		protected void setName(String x) {
			name = x;
		}
		protected void setPrice(int x) {
			price = x;
		}
		public void print() {
			System.out.printf("%s Price: %d \n", name, price);
		}
	}
	private ArrayList<Options> opt = new ArrayList<Options>();
	private String name;
	private int size;
	private String holder;
	private int holder2;
	public OptionSet(String name, int size) {
		this.name = name;
		this.size = size;
		for(int i = 0;i < opt.size(); i++) {
			opt.add(new Options(name, size));
		}
	}

	protected String getName() {
		return name;
	}

	protected int getSize() {
		return size;
	}
	
	protected Options getIndex(int x) {
		return opt.get(x);
	}
	protected Options getOption(int x) {
		return opt.get(x);
	}
	protected ArrayList<Options> getOptions() {
		return opt;
	}

	protected void deleteOption(int x) {
		opt.remove(x);
	}
	
	protected Options createOption(String name, int price) {
		Options temp = new Options(name, price);
		return temp;
	}
	protected void setOptionSet(int x, String newName, int newPrice) {
		opt.add(new Options(null, 1));
		opt.get(x).setName(newName);
		opt.get(x).setPrice(newPrice);
		
	}
	protected void setName(String x) {
		name = x;
	}
	
	protected void setSize(int x) {
		size = x;
	}
	
	protected void setOption(int x, Options y) {
		opt.get(x).setName(y.getName());
		opt.get(x).setPrice(y.getPrice());
	}
	protected Options newOption(String name, int price) {
		Options temp = new Options(name,price);
		return temp;
	}
	protected void addOption(Options x) {
		opt.add(x);
	}
	protected void setOptions(ArrayList<Options> y ) {
		opt = y;
	}
	
	protected int findOption(String x) {
		for(int i = 0; i < opt.size(); i++) {
			if(opt.get(i).getName().equalsIgnoreCase(x)) {
				return i;
			}
		}
		System.out.println("Cannot be found");
		return 0;
	}
	protected String getOptionName() {
		return opt.get(0).getName();
	}
	protected void print() {
		System.out.printf("Type of Option: %s and its status: ", getName());
		for(int i = 0; i < opt.size(); i++) {
			opt.get(i).print();
		}
	}
}
