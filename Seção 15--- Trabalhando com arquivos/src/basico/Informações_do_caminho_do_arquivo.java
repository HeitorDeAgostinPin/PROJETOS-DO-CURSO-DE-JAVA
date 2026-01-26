package basico;

import java.io.File;
import java.util.Scanner;

public class Informações_do_caminho_do_arquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("inform o caminho do arquivo");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());//nome do arquivo
		System.out.println("getParent: " + path.getParent());//só o caminho
		System.out.println("getPath: " + path.getPath());//caminho completo
		
		
		
		
		sc.close();
	}

}
