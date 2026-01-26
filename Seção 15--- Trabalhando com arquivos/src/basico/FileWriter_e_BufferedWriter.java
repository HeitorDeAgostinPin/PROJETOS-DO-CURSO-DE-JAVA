package basico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] linhas = new String[] {"Bom Dia ","Boa Tarde", "Boa Noite"};
		String path = "E:\\CURSO DE JAVA\\Materiais\\Seção 15--- Trabalhando com arquivos\\novo";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path/*true*/))){
			
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
