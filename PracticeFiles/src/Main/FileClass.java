package Main;


public class FileClass {
	
	public static void main(String[] args){
		
		CreatingFile file = new CreatingFile();
		
		file.openFile();
		file.addInfo();
		file.closeFile();

	}
}
