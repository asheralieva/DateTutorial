import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formater.format(date));


        LocalDateTime localDateTime = LocalDateTime.now();



        LocalDate localDate = LocalDate.now();

        System.out.println(localDateTime);
        System.out.println(localDate);

//        calendar.add(Calendar.HOUR, 2);
//        calendar.add(Calendar.MINUTE, 2);
//
//        calendar.add(Calendar.DAY_OF_WEEK,3);

      //  System.out.println(calendar.getTime());



//
//        Thread.sleep(2000);
//        System.out.println("Date - "+date);
//
//        Date date1 = new Date();
//        System.out.println("Date1 - "+date1);
//        boolean resultAfter = date.after(date1);
//        boolean resultBefore = date.before(date1);
//
//        System.out.println(resultAfter);
//        System.out.println(resultBefore);
//
//        String dateString = "";

    }
}
