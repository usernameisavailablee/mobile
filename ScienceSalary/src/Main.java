import Classes.Engeneer;
import Classes.JuniorResearcher;
import Classes.Scientist;
import Classes.SeniorResearcher;

public class Main {
    public static void main(String[] args) {

        Scientist[] arr = new Scientist[9];

        arr[0] = new Engeneer(12,120000);
        arr[1] = new Engeneer(12,120000);
        arr[2] = new Engeneer(12,120000);
        arr[3] = new Engeneer(12,120000);
        arr[4] = new JuniorResearcher(2,140000);
        arr[5] = new JuniorResearcher(3,140000);
        arr[6] = new SeniorResearcher(17,150000);
        arr[7] = new SeniorResearcher(14,150000);
        
        System.out.print(arr[0].toString());
        System.out.print(arr[0].allowance());




    }
}