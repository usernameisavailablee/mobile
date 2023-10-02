package Classes;

public class SeniorResearcher extends Scientist{
    public SeniorResearcher(double seniority,double salary){
        super(seniority,salary);
    }
    @Override
    public double allowance() {
        return salary*(1+seniority*0.3);
    }
}