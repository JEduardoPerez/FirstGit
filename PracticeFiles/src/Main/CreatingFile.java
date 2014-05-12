package Main;

import java.util.Formatter;

public class CreatingFile {

	private Formatter file;
	
	public void openFile(){
		
		try{
			file = new Formatter("Amigo.txt");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void addInfo(){
		file.format("%s%s%s", "21 ", " Eduardo, ", "Happy");
	}
	
	public void closeFile(){
		file.close();
	}
}
