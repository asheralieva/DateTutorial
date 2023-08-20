import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws ParseException {
        /*
        Задача 2.
        Задана определенная дата экзамена: например, 18.04.2022.
        С консоли вводится дата в виде String в таком же формате(dd.MM.yyyy)(System.IN).
        Требуется сравнить дату экзамена и введенную дату.
        Если дни равны, вывести ответ: "Экзамен сегодня";
        Если введенная дата раньше, вывести: "До экзамена осталось " + кол-во  оставшихся дней.
        Если дата позже, то вывести: "Экзамен был " + кол-во прошедших дней  + " назад."
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате(dd.MM.yyyy)");
        String dayOfExam = sc.next();

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date examDate = formatter.parse("18.04.2022");
        Date inputDate = formatter.parse(dayOfExam);

        if(examDate.equals(inputDate)){
            System.out.println("Экзамен сегодня");
        } else if (inputDate.before(examDate)) {
            long difference = (examDate.getTime()-inputDate.getTime()) /  (24 * 60 * 60 * 1000);
            System.out.println("До экзамена осталось " + difference);
        }else{
            long difference2 = (inputDate.getTime()-examDate.getTime()) /  (24 * 60 * 60 * 1000);
            System.out.println("Экзамен был " + difference2  + " дня(ей) назад.");
        }


    }
}
