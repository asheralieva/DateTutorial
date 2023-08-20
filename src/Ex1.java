import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {
    public static void main(String[] args) throws ParseException {
        //сравнить с нау
        /*
         Задача 1. Даны две даты в виде String:
         String start_date = "09/24/2021";
         String end_date = "10/17/2021";
         Найти кол-во дней между этими датами. Результат вывести типом int.
         */
        String start_date = "09/24/2021";
        String end_date = "10/17/2021";
        SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/y");

        Date startDate = formatter.parse(start_date);
        Date endDate = formatter.parse(end_date);

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(startDate);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(endDate);

        long differenceInMillis = cal1.getTimeInMillis() - cal2.getTimeInMillis();
        int differenceInDays = (int) (differenceInMillis / (1000 * 60 * 60 * 24));

        System.out.println("Difference in days: " + differenceInDays);




    }
}
