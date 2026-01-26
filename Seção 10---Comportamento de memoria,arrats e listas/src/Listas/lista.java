package Listas; // Define o pacote onde está a classe

import java.util.ArrayList;       // Importa a classe ArrayList para criar listas dinâmicas
import java.util.List;            // Importa a interface List
import java.util.stream.Collectors; // Importa utilitário para operações com streams

public class lista {
    public static void main(String[] args) {
        // Cria uma lista de Strings chamada 'list'
        List<String> list = new ArrayList<>();

        // Adiciona elementos à lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // Insere "Marco" na posição 2 (desloca os elementos seguintes)
        list.add(2, "Marco");

        // Imprime o tamanho da lista
        System.out.println(list.size());

        // Imprime todos os elementos da lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Remove todos os elementos que começam com a letra 'M'
        list.removeIf(x -> x.charAt(0) == 'M');

        // Imprime a lista após a remoção
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Mostra o índice de "Bob" e "Marco" na lista
        System.out.println("Index of Bob: " + list.indexOf("Bob"));     // Deve retornar posição de Bob
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Deve retornar -1 (Marco foi removido)

        System.out.println("---------------------");

        // Cria uma nova lista com elementos que começam com 'A'
        List<String> result = list.stream()
                                  .filter(x -> x.charAt(0) == 'A')
                                  .collect(Collectors.toList());

        // Imprime os elementos filtrados
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Procura o primeiro nome que começa com 'J' (não existe, então retorna null)
        String name = list.stream()
                          .filter(x -> x.charAt(0) == 'J')
                          .findFirst()
                          .orElse(null);

        // Imprime o resultado da busca
        System.out.println(name);
    }
}
