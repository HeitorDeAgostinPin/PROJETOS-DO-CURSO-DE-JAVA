package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class estruraBasicaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> lista = new ArrayList<String>();
     
     lista.add("Hetor");
     lista.add("pedro");
     lista.add("joão");
     lista.add("rossi");
     
     lista.add(2, "MARCO");//ADICIONA USANDO A POSIÇÃO PRIMEIRO
     
     System.out.println(lista.size());//TAMANHO DA LISTA
     System.out.println("=======================================================");
    
     for(String x:lista) 
     {
    	 System.out.println(x);
     }
     
      lista.remove("rossi");//REMOVE PELO NOME OU PELA POSIÇÃO
     
     lista.removeIf(x ->x.charAt(0) == 'm');//REMOVE SEGUNDO UMA CONDIÇÃO
	
	System.out.println("========================================================");
     for(String x:lista) 
     {
    	 System.out.println(x);
     }
 	System.out.println("========================================================");
 
 	System.out.println("Indice do Heitor" + lista.indexOf("Heitor"));//INFORMA A POSIÇÃO DO VALOR
 	
	System.out.println("========================================================");

 	List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
 	
 	for(String x:resultado) 
    {
   	 System.out.println(x);
    }
	System.out.println("========================================================");
	
	 String name= lista.stream().filter(x-> x.charAt(0) == 'r').findFirst().orElse(null);
	 System.out.println(name);

	}

}
