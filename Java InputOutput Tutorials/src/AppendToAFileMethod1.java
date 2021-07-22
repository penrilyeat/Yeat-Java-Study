import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToAFileMethod1 {
	public static void main(String[] args) {
		try {
			String content="This is my content which would be appended "+"at the end of the specified file\n";
			File file=new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
			/*This logic is to create the file if the
			 * file is not already present
			 */
			if(!file.exists())
				file.createNewFile();
			
			//Here true is to append the content to file
			FileWriter fw=new FileWriter(file,true);
//			fw.write(content);
//			fw.close();
			//BufferedWriter writer give better performance
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(content);
			//Closing Buffered Writer Stream
			bw.close();
			
			System.out.println("Data successfully appended at the end of file");
		}catch(IOException ioe) {
			System.out.println("Exception occured:");
			ioe.printStackTrace();
		}
	}
}
