import java.io.File;

public class MakeAFileReadOnlyExample {
	public static void main(String[] args) {
		File myfile = new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
		// making the file read only
		boolean flag = myfile.setReadOnly();
		//Set it writable
//		boolean flag2=myfile.setWritable(true);
		if (flag == true)
			System.out.println("File successfully converted to Read only mode!!");
		else
			System.out.println("Unsuccessful Operation!!");
	}
}
