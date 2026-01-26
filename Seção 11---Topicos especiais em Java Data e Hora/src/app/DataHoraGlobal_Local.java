package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraGlobal_Local {

	public static void main(String[] args) {

		// Caso queira listar todos os fusos horários disponíveis no Java
		// for (String s : ZoneId.getAvailableZoneIds())
		//     System.out.println(s);

		// Criando datas a partir de textos ISO
		LocalDate dataSimples = LocalDate.parse("2022-07-20"); // só a data
		LocalDateTime dataHoraLocal = LocalDateTime.parse("2022-07-20T01:30:26"); // data + hora local
		Instant instanteGlobal = Instant.parse("2022-07-20T01:30:26Z"); // instante UTC (global)

		// Convertendo Instant para data/hora em fusos diferentes
		LocalDate dataNoFusoLocal = LocalDate.ofInstant(instanteGlobal, ZoneId.systemDefault());
		LocalDate dataEmPortugal = LocalDate.ofInstant(instanteGlobal, ZoneId.of("Portugal"));
		LocalDateTime dataHoraNoFusoLocal = LocalDateTime.ofInstant(instanteGlobal, ZoneId.systemDefault());
		LocalDateTime dataHoraEmPortugal = LocalDateTime.ofInstant(instanteGlobal, ZoneId.of("Portugal"));

		// Mostrando as conversões
		System.out.println("dataNoFusoLocal = " + dataNoFusoLocal);
		System.out.println("dataEmPortugal = " + dataEmPortugal);
		System.out.println("dataHoraNoFusoLocal = " + dataHoraNoFusoLocal);
		System.out.println("dataHoraEmPortugal = " + dataHoraEmPortugal);

		// Pegando pedaços de uma LocalDate (somente data)
		System.out.println("dataSimples dia = " + dataSimples.getDayOfMonth());
		System.out.println("dataSimples mês = " + dataSimples.getMonthValue());
		System.out.println("dataSimples ano = " + dataSimples.getYear());

		// Pegando pedaços de uma LocalDateTime (data + hora)
		System.out.println("dataHoraLocal hora = " + dataHoraLocal.getHour());
		System.out.println("dataHoraLocal minutos = " + dataHoraLocal.getMinute());
	}
}
