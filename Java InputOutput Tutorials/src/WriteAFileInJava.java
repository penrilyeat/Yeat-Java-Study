import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFileInJava {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file = new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
		String myContent = "This is my Data which needs" + " to be written into the file";
		String myContent2 = "The combination of IOS, MACOS and IPADOS is just so nice.";
		try {
			fos = new FileOutputStream(file);
			/*
			 * This logic will check whether the file exists or not. If the file is not
			 * found at the specified location it would create a new file
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			/*
			 * String content cannot be directly written onto a file. It needs to be
			 * converted into bytes
			 */
			byte[] byteArray = (myContent+"\n"+myContent2).getBytes();
			fos.write(byteArray);
			fos.flush();
			System.out.println("File Written Successfully");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				if(fos!=null)
					fos.close();
			}catch(IOException ioe)
			{
				System.out.println("Error in closing the Stream");
			}
		}
	}
	
}