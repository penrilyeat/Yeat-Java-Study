import java.io.File;

public class MakeAFileWritableExample {
	public static void main(String[] args) {
		File myfile = new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
		// Set it writable
		myfile.setWritable(true);
		if (myfile.canWrite())
			System.out.println("File is writable.");
		else
			System.out.println("File is read only");
	}
}
