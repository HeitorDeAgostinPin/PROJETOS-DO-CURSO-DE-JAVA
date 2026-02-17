package Model.Aplicação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.Entiades.Servico;

public class LeitorDeServicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Servico> servicos = new ArrayList<>();
		String caminho = "E:\\CURSO DE JAVA\\Materiais\\Seção 16---Interfaces\\servicos.txt";
		
		try (BufferedReader bf = new BufferedReader( new FileReader(caminho))){
			String linha = bf.readLine();
			
			while(linha != null) {
				
				String[] campos = linha.split(",");
				
				String nomeDoServico = campos[0];
				Double valorUnitario = Double.parseDouble(campos[1]);
				Integer quantidade = Integer.parseInt(campos[2]);
				
				servicos.add(new Servico(nomeDoServico,valorUnitario,quantidade));
			
			linha = bf.readLine();
			
			}
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		sc.close();
	}

}
/*🧠 EXERCÍCIO COMPLETO (Arquivos + OO + Interface)
📌 Contexto (bem parecido com o PDF)

Você vai criar um programa Java que:

Lê um arquivo .csv

Processa os dados usando orientação a objetos

Usa interface

Gera um novo arquivo com os resultados*/