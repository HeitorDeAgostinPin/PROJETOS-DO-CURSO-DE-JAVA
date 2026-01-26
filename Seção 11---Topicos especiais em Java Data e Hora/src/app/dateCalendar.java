package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class dateCalendar {

    public static void main(String[] args) throws ParseException {

        // 🔹 Criando formatadores para transformar Date em texto e vice-versa
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // só data
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // data + hora
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // também data + hora

        // Forçando o sdf3 a usar o fuso GMT (Londres)
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // 🔹 Criando objetos Date de formas diferentes
        Date x1 = new Date(); // Data e hora atuais
        Date x2 = new Date(System.currentTimeMillis()); // Mesma coisa que x1
        Date x3 = new Date(0L); // "Epoch" → 01/01/1970 00:00:00 GMT
        Date x4 = new Date(1000L * 60L * 60L * 5L); // 5 horas após o Epoch

        // 🔹 Convertendo texto (String) em Date
        Date y1 = sdf1.parse("25/06/2018"); // só data (hora = 00:00)
        Date y2 = sdf2.parse("25/06/2018 15:42:07"); // data + hora
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // formato ISO 8601

        // 🔹 Impressões "cruas" (usam toString → mostram no fuso local da máquina)
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        System.out.println("-------------");

        // 🔹 Formatando datas com sdf2 (no fuso local)
        System.out.println("x1 (local): " + sdf2.format(x1));
        System.out.println("x2 (local): " + sdf2.format(x2));
        System.out.println("x3 (local): " + sdf2.format(x3));
        System.out.println("x4 (local): " + sdf2.format(x4));
        System.out.println("y1 (local): " + sdf2.format(y1));
        System.out.println("y2 (local): " + sdf2.format(y2));
        System.out.println("y3 (local): " + sdf2.format(y3));

        System.out.println("-------------");

        // 🔹 Formatando datas com sdf3 (forçando GMT → diferente do fuso local)
        System.out.println("x1 (GMT): " + sdf3.format(x1));
        System.out.println("x2 (GMT): " + sdf3.format(x2));
        System.out.println("x3 (GMT): " + sdf3.format(x3));
        System.out.println("x4 (GMT): " + sdf3.format(x4));
        System.out.println("y1 (GMT): " + sdf3.format(y1));
        System.out.println("y2 (GMT): " + sdf3.format(y2));
        System.out.println("y3 (GMT): " + sdf3.format(y3));
    }
}
