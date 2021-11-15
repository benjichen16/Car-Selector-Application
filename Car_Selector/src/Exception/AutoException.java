package Exception;
import java.io.*;
public class AutoException {
	public void handleAll(Exception e) {
		Recorder writer = new Recorder();
		ExceptionHealing healing = new ExceptionHealing();
	try {
		throw e;
	}
	catch(FileNotFoundException ie) {
		System.out.printf("File Not Found. Exception No. 1\n");
		writer.exceptions(ie.toString());
		healing.healing(1);
	}
	catch(NoSuchMethodException ie) {
		System.out.printf("No Such Method. Exception No. 2\n");
		writer.exceptions(ie.toString());
	}
	catch(NullPointerException ie){
		System.out.printf("There is no such thing in the Text File. Exception No. 3\n");
		writer.exceptions(ie.toString());
	}
	catch(ArrayIndexOutOfBoundsException ie) {
		System.out.printf("Array out of Bounds. Exception No. 4\n");
		writer.exceptions(ie.toString());
	}
	catch(IOException ie) {
		System.out.printf("IO Exception. Exception No. 5\n");
		writer.exceptions(ie.toString());
	}
	catch(InterruptedException ie) {
		System.out.printf("Interrupted");
		writer.exceptions(ie.toString());
	}
	catch(Exception ie)
	{
		System.out.printf("Exception: "+ ie.toString());
		writer.exceptions(ie.toString());
	}
	}
}