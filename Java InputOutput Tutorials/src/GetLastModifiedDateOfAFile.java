import java.io.File;
import java.text.SimpleDateFormat;

public class GetLastModifiedDateOfAFile {
	public static void main(String[] args) {
		//Specify the file path and name
		File file =new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last Modified Date: "+sdf.format(file.lastModified()));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("MM-dd-yy HH:mm a");
		System.out.println("Last Modified Date: "+sdf2.format(file.lastModified()));
	}
}
