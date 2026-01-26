package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosData_e_Hora {

    public static void main(String[] args) {

        // Só a data (sem hora) → 20/07/2022
        LocalDate dataSimples = LocalDate.parse("2022-07-20");
        // Data + hora local → 20/07/2022 às 01:30:26
        LocalDateTime dataHoraLocal = LocalDateTime.parse("2022-07-20T01:30:26");
        // Instante global em UTC → 20/07/2022 01:30:26 Zulu (Londres)
        Instant instanteGlobal = Instant.parse("2022-07-20T01:30:26Z");

        
        // 🔹 Operações com LocalDate
        LocalDate umaSemanaAntesData = dataSimples.minusDays(7);
        LocalDate umaSemanaDepoisData = dataSimples.plusDays(7);

        // 🔹 Operações com LocalDateTime
        LocalDateTime umaSemanaAntesDataHora = dataHoraLocal.minusDays(7);
        LocalDateTime umaSemanaDepoisDataHora = dataHoraLocal.plusDays(7);

        // 🔹 Operações com Instant (precisa informar a unidade: ChronoUnit.DAYS)
        Instant umaSemanaAntesInstante = instanteGlobal.minus(7, ChronoUnit.DAYS);
        Instant umaSemanaDepoisInstante = instanteGlobal.plus(7, ChronoUnit.DAYS);

        // Saídas
        System.out.println("umaSemanaAntesData = " + umaSemanaAntesData);
        System.out.println("umaSemanaDepoisData = " + umaSemanaDepoisData);

        System.out.println("umaSemanaAntesDataHora = " + umaSemanaAntesDataHora);
        System.out.println("umaSemanaDepoisDataHora = " + umaSemanaDepoisDataHora);

        System.out.println("umaSemanaAntesInstante = " + umaSemanaAntesInstante);
        System.out.println("umaSemanaDepoisInstante = " + umaSemanaDepoisInstante);

        // 🔹 Calculando durações (diferenças entre duas datas)
        Duration diffDatas = Duration.between(umaSemanaAntesData.atStartOfDay(), dataSimples.atStartOfDay());
        Duration diffDataHora = Duration.between(umaSemanaAntesDataHora, dataHoraLocal);
        Duration diffInstante = Duration.between(umaSemanaAntesInstante, instanteGlobal);
        Duration diffInvertida = Duration.between(instanteGlobal, umaSemanaAntesInstante); // negativo

        // Saídas das diferenças
        System.out.println("diffDatas em dias = " + diffDatas.toDays());
        System.out.println("diffDataHora em dias = " + diffDataHora.toDays());
        System.out.println("diffInstante em dias = " + diffInstante.toDays());
        System.out.println("diffInvertida em dias = " + diffInvertida.toDays());
    }
}
