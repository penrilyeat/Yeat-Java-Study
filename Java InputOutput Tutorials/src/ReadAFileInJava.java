import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFileInJava {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\yeatn\\Desktop\\JavaOutputFile.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		try {
			// FileInputStream to read the file
			fis = new FileInputStream(file);
			/*
			 * Passed the FileInputStream to BufferedInputStream For Fast read using the
			 * buffer array
			 */
			bis = new BufferedInputStream(fis);

			/*
			 * available() method of BufferedInputStream returns 0 when there are no more
			 * bytes present in the file to be read
			 */
			
			System.out.println(bis.available());
			while (bis.available() > 0) {
				System.out.print((char) bis.read());
			}
		} catch (

		FileNotFoundException fnfe) {
			System.out.println("The specified file not found" + fnfe);
		} catch (IOException ioe) {
			System.out.println("I/O Exception: " + ioe);
		} finally {
			try {
				if (bis != null && fis != null) {
					fis.close();
					bis.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in InputStream close(): " + ioe);
				
			}
		}
	}
}
