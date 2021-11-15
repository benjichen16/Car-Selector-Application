package Exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Recorder {
	public void exceptions(String x) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/benjaminchen/eclipse-workspace/lab5/Exceptions.txt \n"));
		    writer.write(x);
		    writer.close();
		}
		catch(IOException e) {
			System.out.printf("Error--"+ e.toString()+ "\n");
	}
}
}
