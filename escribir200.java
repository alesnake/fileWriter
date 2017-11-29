
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escribir200 {

	public static void main(String[]args) throws IOException {
		
		File archivo =new File("C:\\Users\\aleja\\Datos\\numeros200.txt");
		FileWriter escribir=new FileWriter(archivo);
		
		for(int i=0;i<201;i++) {
			escribir.write(i+" ");
		}
		
		escribir.close();
	}
	
}
