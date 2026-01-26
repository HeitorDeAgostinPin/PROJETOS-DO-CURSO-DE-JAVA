package basico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bloco_try_with_resources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "E:\\CURSO DE JAVA\\Materiais\\Seção 15--- Trabalhando com arquivos\\in.txt.txt";
		//FileReader fr = null;
		//BufferedReader br = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//fr = new FileReader(path);
			//br = new BufferedReader(fr);//br = new BufferedReader(new FileReader(path));
			
			String linha = br.readLine();//le uma linha do arquivo
			
			while(linha != null) {//se for a ultima linha do arquivo ( s enão tiver mais) vaindar null
				System.out.println(linha);
				linha = br.readLine();//pra continuar 
			}
		}
		catch(IOException e) {
			System.out.println("Erro " + e.getMessage());
		}
		
		
	}

}
