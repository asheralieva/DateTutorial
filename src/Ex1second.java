import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex1second {
    public static void main(String[] args) {
        /*
         Задача 1. Даны две даты в виде String:
         String start_date = "09/24/2021";
         String end_date = "10/17/2021";
         Найти кол-во дней между этими датами. Результат вывести типом int.
         */

        String start_date = "09/24/2021";
        String end_date = "10/17/2021";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/y");

        LocalDate localDate = LocalDate.parse(start_date, formatter);
        LocalDate localDate1 = LocalDate.parse(end_date,formatter);

        long difference = localDate.getDayOfMonth() - localDate1.getDayOfMonth();
        int differenceInDays = (int) (difference / (1000 * 60 * 60 * 24));

        System.out.println("Difference in days: " + difference);
    }
}
