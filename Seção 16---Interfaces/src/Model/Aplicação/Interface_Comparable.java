package Model.Aplicação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.Entiades.Funcionarios;

public class Interface_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Funcionarios> list = new ArrayList<>();
		// String path ="E:\\CURSO DE JAVA\\Materiais\\Seção
		// 16---Interfaces\\in.txt.txt";
		String path = "E:\\CURSO DE JAVA\\Materiais\\Seção 16---Interfaces\\funcionarios.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String funcionarioTXT = br.readLine();
			while (funcionarioTXT != null) {
				/*
				 * String name= br.readLine();
				 *  while (name!= null) {
				 *   list.add(name); 
				 *   name= br.readLine()
				 */
				String[] campos = funcionarioTXT.split(",");
				list.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
				funcionarioTXT = br.readLine();
			}
			

			Collections.sort(list);// pra ordeanar
			// for(String func : list) {

			for (Funcionarios func : list) {
				System.out.println(func.getName() + ", " + func.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
/*
 * Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
 * linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e
 * mostra-los ordenadamente na tela. Nota: o caminho do arquivo pode ser
 * informado "hardcode".
 * 
 * Façaumprogramapara lerumarquivocontendo funcionários (nomeesalário) no
 * formato.csv,armazenando-osemumalista.Depois,ordenaralistapornomeemostrar
 * oresultadonatela.Nota:ocaminhodoarquivopodeserinformado"hardcode".
 */