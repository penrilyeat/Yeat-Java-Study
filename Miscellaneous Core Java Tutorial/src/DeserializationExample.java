import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String[] args) {
		Student a = null;
		try {
			FileInputStream fis=new FileInputStream("Student.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			a=(Student)ois.readObject();
			ois.close();
			fis.close();
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
			return;
		}catch(ClassNotFoundException cnfe)
		{
 			System.out.println("Student Class is not found");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Student Name: "+a.getStuName());
		System.out.println("Student Age: "+a.getStuAge());
		System.out.println("Student Roll No:"+a.getStuRollNum());
		System.out.println("Student Address:"+a.getStuAddress());
		System.out.println("Student Height:"+a.getStuHeight());
	}

}
