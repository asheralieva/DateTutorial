import javax.print.attribute.Size2DSyntax;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Ex2second {
    public static void main(String[] args) {
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

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String examDate = "18.04.2022";

        LocalDate localDate = LocalDate.parse(examDate, formatter);
        LocalDate inputDate = LocalDate.parse(dayOfExam,formatter);

        if(localDate.equals(inputDate)){
            System.out.println("Экзамен сегодня");
        } else if (inputDate.isBefore(localDate)) {
            long difference = localDate.getDayOfMonth()-inputDate.getDayOfMonth();
            System.out.println("До экзамена осталось " + difference);
        }else{
            long difference2 = inputDate.getDayOfMonth()-localDate.getDayOfMonth();
            System.out.println("Экзамен был " + difference2  + " дня(ей) назад.");
        }
    }
}
