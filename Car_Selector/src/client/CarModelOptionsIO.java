
package client;

import java.io.*;
import java.util.*;
import Model.Properties;
import Util.FileIO;
import Model.Automotive;

public class CarModelOptionsIO{

	////////// PROPERTIES //////////


	////////// CONSTRUCTORS //////////

	public CarModelOptionsIO() {
		
	}

	////////// INSTANCE METHODS //////////

	public LinkedHashMap<Integer, Properties> loadPropsFile(String fname) {
		LinkedHashMap <Integer, Properties> properties = new LinkedHashMap<Integer, Properties>();
		FileIO io = new FileIO();
			io.loadin(fname, properties);

		return properties;
	}

	public Object loadTextFile(String fname) {
		StringBuffer sbuff = new StringBuffer();
		try {
			BufferedReader buff = new BufferedReader(new FileReader(fname));
			boolean eof = false;
			int counter = 0;
			while (!eof) {
				String line = buff.readLine();
				if (line == null)
					eof = true;
				else {
					if (counter == 0)
						sbuff.append(line);
					else
						sbuff.append("\n" + line);
				}
				counter++;
			}
			buff.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Error in file directory ... ");
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println("Error reading file from directory ... ");
			System.exit(1);
		}

		return sbuff;
	}

}
