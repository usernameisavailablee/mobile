package Classes;

public class Engeneer extends Scientist{
    public Engeneer(double seniority,double salary){
        super(seniority,salary);
    }

    @Override
    public double allowance() {
        double calculated_allowance = salary*(1+seniority*0.1);
        return calculated_allowance;
    }


}
