import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f= new File("Test.txt");
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
				
				dos.writeUTF("Welcome to Java");
				FileInputStream fis =  new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
				System.out.println(dis.readUTF());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
				
	}

}
