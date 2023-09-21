// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(7, 11, 2014);
        MyDate date2 = new MyDate(7, 11, 2014);
        if (date1 == date2)
            System.out.println("date2 is identical date2");
        else
            System.out.println("date1 is not identical date2");

        if (date1.equals(date2))
            System.out.println("date1 is equals date2");
        else
            System.out.println("date1 id not equals date2");

        System.out.println("set date2 = date1");
        ;
        date2 = date1;
        if (date1 == date2)
            System.out.println("date2 is identical date2");
        else
            System.out.println("date1 is not identical date2");

    }
}