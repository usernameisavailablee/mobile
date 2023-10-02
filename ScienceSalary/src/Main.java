import Classes.Engineer;
import Classes.JuniorResearcher;
import Classes.Scientist;
import Classes.SeniorResearcher;

public class Main {
    public static void main(String[] args) {

        Scientist[] arr = new Scientist[9];

        arr[0] = new Engineer(12,120000);
        arr[1] = new Engineer(12,120000);
        arr[2] = new Engineer(12,120000);
        arr[3] = new Engineer(12,120000);
        arr[4] = new JuniorResearcher(2,140000);
        arr[5] = new JuniorResearcher(3,140000);
        arr[6] = new SeniorResearcher(17,150000);
        arr[7] = new SeniorResearcher(14,150000);

        // преобразование в  строку
//        System.out.println(arr[0].toString());
        //расчёт надбавки
        System.out.println(arr[0].allowance());
//        //равны?
//        boolean a = arr[0].equals(arr[0]);
//        System.out.println(a);






    }
}