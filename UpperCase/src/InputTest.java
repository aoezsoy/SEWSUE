
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * InputTest
 * @author Oezsoy Ahmet
 * @version 14.04.2016
 */
public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		int c;
		try{
			InputStream in = 
					new UppercaseInputStream(
							new BufferedInputStream(
									new FileInputStream("Input.txt")));
			while((c = in.read()) >=0){
				System.out.println((char)c);
			}
			in.close();
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}