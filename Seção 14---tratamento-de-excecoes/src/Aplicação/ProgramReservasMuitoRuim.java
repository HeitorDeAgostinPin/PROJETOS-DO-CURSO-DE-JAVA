package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Entidades.Reserva;

public class ProgramReservasMuitoRuim {
	/*
	 Solução 1 (muito ruim): lógica de validação no programa principal
	Lógica de validação não delegada à reserva
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

			Date now = new Date();

			if (checkin.before(now) || checout.before(now)) {
				System.out.println("Errorin reservation: Reservation dates for updatemust be future dates\r\n" + "");
			} else // se a dat de checout não for posterior a de checkin
			if (!checout.after(checkin)) {// testa se uma data é depois da outra
				System.out.println("Errorin reservation: Reservation dates for updatemust be future dates\r\n" + "");
			} else {
				reserva.upDate(checkin, checout);
				System.out.println("reserva: " + reserva);
			}
		}

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