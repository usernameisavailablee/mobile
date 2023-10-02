package Classes;

public class Engineer extends Scientist{
    public Engineer(double seniority,double salary){
        super(seniority,salary);
    }

    @Override
    public double allowance() {
        return salary*(1+seniority*0.1);
    }



}