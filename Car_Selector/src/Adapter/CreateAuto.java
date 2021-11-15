package Adapter;
import Model.Automotive;
interface CreateAuto {
	void printAuto(String Modelname);
	void buildAuto(String filename);
	void buildProperties(String filename);
	void serialize();
}
