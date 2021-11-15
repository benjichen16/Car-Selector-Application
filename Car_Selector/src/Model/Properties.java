package Model;
import java.util.*;

public class Properties {
	private String carMake;
	private String carType;
	private String color;
	private String price;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	public Properties(String carMake, String carType, String color, String price, String option1, String option2, String option3, String option4) {
		this.carMake = carMake;
		this.carType = carType;
		this.color = color;
		this.price = price;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	public String getProperty(String x) {
		if(x.equalsIgnoreCase("carMake")) {
			return carMake;
		}
		if(x.equalsIgnoreCase("carType")) {
			return carType;
		}
		if(x.equalsIgnoreCase("color")) {
			return color;
		}
		if(x.equalsIgnoreCase("price")) {
			return price;
		}
		if(x.equalsIgnoreCase("transmission")) {
			return option1;
		}
		if(x.equalsIgnoreCase("brakes")) {
			return option2;
		}
		if(x.equalsIgnoreCase("airbags")) {
			return option3;
		}
		if(x.equalsIgnoreCase("moonroof")) {
			return option4;
		}
		else return null;
	}
	public void setString(String x, String y) {
		if(x.equalsIgnoreCase("carMake")) {
			carMake = y;
		}
		if(x.equalsIgnoreCase("carType")) {
			carType = y;
		}
		if(x.equalsIgnoreCase("color")) {
			color = y;
		}
		if(x.equalsIgnoreCase("price")) {
			price = y;
		}
		if(x.equalsIgnoreCase("transmission")) {
			option1 = y;
		}
		if(x.equalsIgnoreCase("brakes")) {
			option2 = y;
		}
		if(x.equalsIgnoreCase("airbags")) {
			option3 = y;
		}
		if(x.equalsIgnoreCase("moonroof")) {
			option4 = y;
		}
	}
}