package basico;

import java.io.File;
import java.util.Scanner;

public class Manipulando_pastas_com_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite uma pasta");
		String strPath =  sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println(folders);
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files= path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
		System.out.println(file);
		}
		
		boolean success =  new File(strPath + "\\subpasta").mkdir();
		System.out.println("diretorio criado com sucesso: " + success);
		
		
		sc.close();
	}

}
