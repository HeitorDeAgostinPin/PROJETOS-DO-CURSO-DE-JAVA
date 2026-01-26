package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class Mercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Locale.setDefault(Locale.US);
           
           Scanner sc = new Scanner(System.in);
	
           //atualizado com o construtor da aula 9
           //Product product = new Product();
           
           System.out.println("Enter product data: ");
           System.out.print("Name: ");
           //product.name = sc.next();
           String name = sc.nextLine();//variavel auxiliar
           
           System.out.println("Price");
           //product.price = sc.nextDouble();
           double price = sc.nextDouble();//variavel auxiliar
           
           System.out.println("Quantityin stock:");
           //product.quantity = sc.nextInt();
           int quantity = sc.nextInt();//variavel auxiliar
           
           Product product  = new Product(name, price, quantity);//construtor com argumentos, para fazer o programador a informar esses campos
           
           //System.out.println(product.name + "," + product.price +"," + product.quantity);
           System.out.println("Product data"+ product.toString());
           
           System.out.println("Enterthe number of products tobe added in stock:");
           quantity = sc.nextInt();
           product.addProducts(quantity);
           
           
           System.out.println("Update data data"+ product.toString());
           
           
           System.out.println(" Enterthe number ofproductstobe removed from stock:");
           quantity = sc.nextInt();
           product.removeProducts(quantity);
           
           System.out.println("Update data data"+ product.toString());
           
           
           sc.close();
	}
 
}
