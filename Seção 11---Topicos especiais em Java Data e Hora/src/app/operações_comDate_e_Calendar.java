package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class operações_comDate_e_Calendar {

    public static void main(String[] args) {

        // 🔹 Formatador para exibir a data em formato legível
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Criando uma data a partir de um Instant ISO 8601 (padrão internacional)
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("Data original: " + sdf.format(d));

        // ===============================
        // Exemplo 1 → Somando unidades de tempo
        // ===============================
        Calendar cal = Calendar.getInstance(); // cria um calendário
        cal.setTime(d); // coloca a data "d" dentro do calendário

        // Somar 4 horas
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime(); // pega de volta como Date

        System.out.println("Data + 4 horas: " + sdf.format(d));

        // ===============================
        // Exemplo 2 → Obtendo partes da data
        // ===============================
        cal.setTime(d); // garante que o Calendar está com a data atualizada

        int minutes = cal.get(Calendar.MINUTE); // pega os minutos
        int month = 1 + cal.get(Calendar.MONTH); // mês começa em 0 (Janeiro=0)

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
