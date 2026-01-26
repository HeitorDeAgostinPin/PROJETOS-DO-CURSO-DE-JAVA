package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Entidades.Reserva;
import Model.Execeções.DomainExcepition;

public class ProgramReservasBOA {
	/*
	 * • Solução 3 (boa): tratamento de exceções
	 * 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("numero do quarto: ");
		int numeroQuarto = sc.nextInt();

		try {
			System.out.println("data de checkin: ");
			Date checkin = sdf.parse(sc.next());
			System.out.println("data de checout: ");
			Date checout = sdf.parse(sc.next());
	
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
	
			reserva.upDate(checkin, checout);
			System.out.println("reserva: " + reserva);
		}
		catch(ParseException e ) {
			System.out.println("Digitou data invalida");
		}
		catch(DomainExcepition e ){
			System.out.println("Erro na reserva " + e.getMessage() );
		}
		catch(RuntimeException e) {
			System.out.println("erro inesperado");
		}
		sc.close();
	}

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