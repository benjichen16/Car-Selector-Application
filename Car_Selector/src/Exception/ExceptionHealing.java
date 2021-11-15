package Exception;
import java.util.*;
public class ExceptionHealing {
	private String filename;
	public void healing(int number) {
		switch(number) {
		case 1: System.out.println("Please enter the name of the file you want to store Automobile in:");
		Scanner input = new Scanner(System.in);
		filename = input.nextLine();
		}
	}
}
