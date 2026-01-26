package basico;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Estrutura_basica_pra_ler_arquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\CURSO DE JAVA\\Materiais\\Seção 15--- Trabalhando com arquivos\\in.txt.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);//coloca o Scanner pra ler o arquivo, no caso usa de argumento o arquivo na hora de instanciar o Scanner
			
			while(sc.hasNextLine()) {//testa se ainda tem linhas
				System.out.println(sc.nextLine());
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if(sc!=null) {
				sc.close();//recomendado fechar ele aqui
			}
		}

	}

}
