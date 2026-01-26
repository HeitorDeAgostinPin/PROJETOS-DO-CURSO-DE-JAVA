package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraTexto {

	public static void main(String[] args) {
		
		// Criando objetos de data e hora a partir de strings ISO-8601
		LocalDate somenteData = LocalDate.parse("2022-07-20"); // só a data
		LocalDateTime dataHoraLocal = LocalDateTime.parse("2022-07-20T01:30:26"); // data + hora
		Instant dataGlobalUTC = Instant.parse("2022-07-20T01:30:26Z"); // instante em UTC

		// Definindo FORMATADORES de data/hora
		DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");           // só data
		DateTimeFormatter fmtDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // data + hora
		DateTimeFormatter fmtDataHoraComFuso = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		// ↑ igual ao fmtDataHora, mas adaptando ao fuso horário da sua máquina

		DateTimeFormatter fmtISODateTime = DateTimeFormatter.ISO_DATE_TIME; // padrão ISO
		DateTimeFormatter fmtISOInstant = DateTimeFormatter.ISO_INSTANT;   // padrão ISO p/ instantes UTC

		// FORMATANDO E IMPRIMINDO

		// LocalDate (só data)
		System.out.println("somenteData = " + somenteData.format(fmtData)); // usando o format() do objeto
		System.out.println("somenteData = " + fmtData.format(somenteData)); // usando o format() do formatter
		System.out.println("somenteData = " + somenteData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // direto

		// LocalDateTime (data + hora)
		System.out.println("dataHoraLocal = " + dataHoraLocal.format(fmtData));
		System.out.println("dataHoraLocal = " + dataHoraLocal.format(fmtDataHora));
		System.out.println("dataHoraLocal = " + dataHoraLocal.format(fmtISODateTime));

		// Instant (momento UTC)
		System.out.println("dataGlobalUTC = " + fmtDataHoraComFuso.format(dataGlobalUTC)); // adaptado ao fuso local
		System.out.println("dataGlobalUTC = " + fmtISOInstant.format(dataGlobalUTC));      // padrão ISO UTC
		System.out.println("dataGlobalUTC = " + dataGlobalUTC.toString());                 // padrão ISO bruto
	}
}
