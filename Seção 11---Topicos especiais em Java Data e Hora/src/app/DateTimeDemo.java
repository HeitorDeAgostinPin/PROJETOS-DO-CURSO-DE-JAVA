package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {

		// FORMATADORES DE DATA
		// fmtData -> só data (dia/mês/ano)
		// fmtDataHora -> data e hora (dia/mês/ano hora:minuto)
		DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmtDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// PEGANDO O MOMENTO ATUAL
		LocalDate hojeData = LocalDate.now();            // só data (AAAA-MM-DD)
		LocalDateTime hojeDataHora = LocalDateTime.now(); // data + hora (AAAA-MM-DDTHH:MM:SS)
		Instant agoraInstant = Instant.now();            // instante global (UTC)

		// CRIANDO DATA/HORA A PARTIR DE TEXTO PADRÃO ISO-8601
		LocalDate data1 = LocalDate.parse("2022-07-20");               // só data
		LocalDateTime dataHora1 = LocalDateTime.parse("2022-07-20T01:30:26"); // data + hora
		Instant dataGlobal1 = Instant.parse("2022-07-20T01:30:26Z");   // UTC (Z = Zulu/UTC)
		Instant dataGlobal2 = Instant.parse("2022-07-20T01:30:26-03:00"); // UTC-3 (Brasil)

		// CRIANDO DATA/HORA A PARTIR DE TEXTO PERSONALIZADO COM FORMATTER
		LocalDate data2 = LocalDate.parse("20/07/2022", fmtData);
		LocalDateTime dataHora2 = LocalDateTime.parse("20/07/2022 01:30", fmtDataHora);

		// CRIANDO DATA/HORA A PARTIR DE VALORES MANUAIS
		LocalDate data3 = LocalDate.of(2022, 7, 20);             // ano, mês, dia
		LocalDateTime dataHora3 = LocalDateTime.of(2022, 7, 20, 1, 30); // ano, mês, dia, hora, minuto

		// IMPRIMINDO TUDO
		System.out.println("hojeData = " + hojeData.toString());
		System.out.println("hojeDataHora = " + hojeDataHora.toString());
		System.out.println("agoraInstant = " + agoraInstant.toString());
		System.out.println("data1 = " + data1.toString());
		System.out.println("dataHora1 = " + dataHora1.toString());
		System.out.println("dataGlobal1 = " + dataGlobal1.toString());
		System.out.println("dataGlobal2 = " + dataGlobal2.toString());
		System.out.println("data2 (com fmt) = " + data2.toString());
		System.out.println("dataHora2 (com fmt) = " + dataHora2.toString());
		System.out.println("data3 (manual) = " + data3.toString());
		System.out.println("dataHora3 (manual) = " + dataHora3.toString());
	}
}
