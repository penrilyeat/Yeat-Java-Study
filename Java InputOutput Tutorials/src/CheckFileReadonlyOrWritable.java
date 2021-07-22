import java.io.File;

public class CheckFileReadonlyOrWritable {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
		if(file.canWrite())
		{
			System.out.println("File is writable.");
		}
		else
		{
			System.out.println("File is read only.");
		}
	}
}
