package scale;
import Adapter.BuildAuto;
import Exception.*;
public class EditOptions extends Thread{
	private BuildAuto a;
	private AutoException healing = new AutoException();
	private String modelName, Optionname, newName, OptionSetname, newOptionSetName;
	private int price;
	private String filename = "/Users/benjaminchen/Desktop/Benjamin/programs/Car_Selector.txt";
	public EditOptions(String modelName, String Optionname, String newName, int price, String OptionSetname, String newOptionSetName, BuildAuto a) {
		this.modelName = modelName;
		this.Optionname = Optionname;
		this.newName = newName;
		this.price = price;
		this.OptionSetname = OptionSetname;
		this.newOptionSetName = newOptionSetName;
		this.a = a;
		a.buildAuto(filename);
	}
	public void editOptions() {
		System.out.println("Editing Options for " + Thread.currentThread().getId());
		a.UpdateOptionPrice(modelName, Optionname, newName, price);
		a.printAuto(modelName);
		while(a.getA()) {
			try {
				a.setA(false);
				wait();
			} catch (Exception e) {
				healing.handleAll(e);
			}
		}
		a.setA(false);
		notifyAll();
	}
	public void updateSetName() {
		System.out.println("Updating Option Set Name for " + Thread.currentThread().getId());
		a.UpdateSetName(modelName, OptionSetname, newOptionSetName);
		a.printAuto(modelName);
		while(!a.getA()) {
			try {
				a.setA(true);
				wait();
			} catch (Exception e) {
				healing.handleAll(e);
			}
		}
		a.setA(true);
		notifyAll();
	}
	public synchronized void run() {
		editOptions();
		updateSetName();
	}
}