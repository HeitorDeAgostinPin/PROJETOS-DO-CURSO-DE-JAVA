package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Entidades.Reserva;

public class ProgramReservasRuim {
/*
 • Solução 2 (ruim): método retornando string • A semântica da operação é prejudicada
• Retornar string não tem nada a ver com atualização de reserva
• E se a operação tivesse que retornar um string?
• Ainda não é possível tratar exceções em construtores
• Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve 
erro
• A lógica fica estruturada em condicionais aninhadas
*/
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("numero do quarto: ");
		int numeroQuarto = sc.nextInt();

		System.out.println("data de checkin: ");
		Date checkin = sdf.parse(sc.next());
		System.out.println("data de checout: ");
		Date checout = sdf.parse(sc.next());

		if (!checout.after(checkin)) {// testa se uma data é depois da outra
			System.out.println("Errorin reservation: Check-out date must beaftercheck-in date\r\n" + "");
		} else {
			Reserva reserva = new Reserva(numeroQuarto, checout, checout);
			System.out.println(reserva);

			System.out.println();
			System.out.println("entre com os dados pra atualizar a resera");
			System.out.println("numero do quarto: ");
			numeroQuarto = sc.nextInt();

			System.out.println("data de checkin: ");
			checkin = sdf.parse(sc.next());
			System.out.println("data de checout: ");
			checout = sdf.parse(sc.next());

			
				String error =reserva.upDate(checkin, checout);// pq retorna string
				System.out.println("reserva: " + reserva);
				if(error!= null) {// se der nulo quer dizer que não deu erro  no metodo upDate da classe Reserva
					System.out.println("Error in reservation " + error);
				} else {
					System.out.println("REserva " + reserva);
				}
			
		}

	sc.close();}

}
/*
 * Fazerumprogramaparalerosdadosdeumareservadehotel(númerodoquarto,data
 * deentradaedatadesaída)emostrarosdadosdareserva, inclusivesuaduraçãoem dias.
 * Emseguida, lernovasdatasdeentradaesaída, atualizarareserva, emostrar
 * novamenteareservacomosdadosatualizados.Oprogramanãodeveaceitardados
 * inválidosparaareserva,conformeasseguintesregras:-
 * Alteraçõesdereservasópodemocorrerparadatasfuturas-
 * Adatadesaídadevesermaiorqueadatadeentra
 * 
 */