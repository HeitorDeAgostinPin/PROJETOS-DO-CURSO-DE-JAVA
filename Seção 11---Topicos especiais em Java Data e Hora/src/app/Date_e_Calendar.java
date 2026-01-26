package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Date_e_Calendar {

    public static void main(String[] args) throws ParseException {

        // 🔹 Formatadores de datas (definem como converter Date <-> String)
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Esse aqui vai sempre mostrar no fuso GMT (hora de Londres)
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // 🔹 Criando datas com Date
        Date x1 = new Date(); // Data e hora atuais
        Date x2 = new Date(System.currentTimeMillis()); // Mesma coisa que x1
        Date x3 = new Date(0L); // "Epoch" -> 01/01/1970 00:00:00 GMT
        Date x4 = new Date(1000L * 60L * 60L * 5L); // 5 horas depois do Epoch

        // 🔹 Convertendo String para Date usando SimpleDateFormat
        Date y1 = sdf1.parse("25/06/2018"); // Só a data
        Date y2 = sdf2.parse("25/06/2018 15:42:07"); // Data e hora
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Padrão ISO 8601

        // 🔹 Impressões "cruas" (toString do Date mostra em fuso local)
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        System.out.println("-------------");

        // 🔹 Formatando as datas (com fuso local)
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));

        System.out.println("-------------");

        // 🔹 Formatando as datas (forçando GMT)
        System.out.println("x1 (GMT): " + sdf3.format(x1));
        System.out.println("x2 (GMT): " + sdf3.format(x2));
        System.out.println("x3 (GMT): " + sdf3.format(x3));
        System.out.println("x4 (GMT): " + sdf3.format(x4));
        System.out.println("y1 (GMT): " + sdf3.format(y1));
        System.out.println("y2 (GMT): " + sdf3.format(y2));
        System.out.println("y3 (GMT): " + sdf3.format(y3));

        System.out.println("-------------");

        // 🔹 Manipulando datas com Calendar
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("Data original: " + sdf2.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d); // associa a data ao calendário
        cal.add(Calendar.HOUR_OF_DAY, 4); // soma 4 horas
        d = cal.getTime(); // volta para Date

        System.out.println("Data + 4h: " + sdf2.format(d));

        // 🔹 Obtendo partes da data
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); // (Janeiro = 0 → por isso soma +1)

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
