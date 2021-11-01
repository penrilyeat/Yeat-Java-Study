import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
	public static void main(String[] args) {
		Student obj=new Student(100,23,"Yeat","Kuching",175);
		try {
			FileOutputStream fos=new FileOutputStream("Student.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("Serialization Done!!");
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
 
	}
}
