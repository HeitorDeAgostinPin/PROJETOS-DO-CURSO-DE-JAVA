package Aplicação;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.Entidades.Produto;

public class Leitor_dos_Produtos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		// Garante uso de ponto como separador decimal
		Locale.setDefault(Locale.US);

		// Leitura do teclado
		Scanner sc = new Scanner(System.in);

		// Lista para armazenar os produtos lidos do CSV
		List<Produto> lista = new ArrayList<>();

		// Usuário informa o caminho do arquivo CSV
		System.out.println("Caminho do arquivo: ");
		String caminhoArq = sc.nextLine();

		// Representa o arquivo informado
		File arquivo = new File(caminhoArq);

		// Pega apenas o caminho da pasta (sem o nome do arquivo)
		String pasta = arquivo.getParent();

		// Cria a pasta "out" dentro da pasta original
		new File(pasta + "\\out").mkdir();

		// Caminho do arquivo de saída
		String arquivoSaida = pasta + "\\out\\produtosSomados.csv";

		// ===== LEITURA DO ARQUIVO =====
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {

			String linha = br.readLine(); // Lê a primeira linha

			while (linha != null) {

				// Separa os dados da linha pelo caractere ','
				String[] campos = linha.split(",");

				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);

				// Cria um produto e adiciona na lista
				lista.add(new Produto(nome, preco, quantidade));

				// Lê a próxima linha
				linha = br.readLine();
			}
		}

		// ===== ESCRITA DO ARQUIVO =====
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida))) {

			for (Produto p : lista) {
				bw.write(p.getNome() + "," + String.format("%.2f", p.total()));
				bw.newLine();
			}
		}

		System.out.println("Arquivo criado em: " + arquivoSaida);

		sc.close();
	}
}
//"E:\CURSO DE JAVA\Materiais\Seção 15--- Trabalhando com arquivos\produtos.csv.txt"

/*
 * Fazer umprograma para ler o caminhode umarquivo .csv contendoos dados de
 * itens vendidos. Cada itempossui um
 * nome,preçounitárioequantidade,separadosporvírgula.Você
 * devegerarumnovoarquivochamado"summary.csv", localizado
 * emumasubpastachamada"out"apartirdapastaoriginal do
 * arquivodeorigem,contendoapenasonomeeovalortotalpara aquele item (preço
 * unitário multiplicado pela quantidade), conformeexemplo.
 */

/*
 * Essas classes servem para trabalhar com arquivos:
 * 
 * File → representa caminho de arquivo/pasta
 * 
 * FileReader → abre arquivo para leitura
 * 
 * BufferedReader → lê o arquivo linha por linha
 * 
 * FileWriter → cria/escreve arquivo
 * 
 * BufferedWriter → escreve com melhor desempenho
 * 
 * IOException → erro de entrada/saída (arquivo)
 */