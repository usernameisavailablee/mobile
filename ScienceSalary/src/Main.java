import Classes.Engeneer;
import Classes.Scientist;

public class Main {
    public static void main(String[] args) {

        Scientist[] arr = new Scientist[9];

        Scientist person1 = new Engeneer(12,120000);
        Scientist person2 = new Engeneer(12,120000);
        Scientist person3 = new Engeneer(12,120000);
        Scientist person4 = new Engeneer(12,120000);
        Scientist person5 = new Engeneer(2,140000);
        Scientist person6 = new Engeneer(3,140000);
        Scientist person7 = new Engeneer(17,150000);
        Scientist person8 = new Engeneer(14,150000);

        arr[0] = person1;
        arr[1] = person2;
        arr[2] = person3;
        arr[3] = person4;
        arr[4] = person5;
        arr[5] = person6;
        arr[6] = person7;
        arr[7] = person8;
        


        System.out.print(person1.toString());
        System.out.print(person1.allowance());




    }
}