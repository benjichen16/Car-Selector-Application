package Driver;
import java.util.*;
import Adapter.*;
import Model.Properties;
import server.*;
public class Driver5 {
	public static void main(String [] args) {
		String filename = "/Users/benjaminchen/Desktop/Benjamin/programs/properties.txt";
		BuildAuto a1 = new BuildAuto();
		a1.buildProperties(filename);
		a1.configureAuto();

	}
}
