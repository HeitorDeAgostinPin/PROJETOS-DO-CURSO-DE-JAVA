package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Social {
/*Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os 
na tela do terminal, conforme exemplo.*/
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		Comentario c1 = new Comentario("Tenha uma boa viagem");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Viajando para a Nova Zelândia",
				"Vou visitar este país maravilhoso!",12
				);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que a Força esteja com você");
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Boa noite, pessoal",
				"Até amanhã",
				5
				);
		p2.addComentario(c3);
        p2.addComentario(c4);
        
        System.out.println(p1);
        System.out.println(p2);
	}

} 
