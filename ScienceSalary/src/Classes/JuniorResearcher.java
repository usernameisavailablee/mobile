package Classes;

public class JuniorResearcher extends Scientist{
    public JuniorResearcher(double seniority,double salary){
        super(seniority,salary);
    }
    @Override
    public double allowance() {
        double calculated_allowance = salary*(1+seniority*0.2);
        return calculated_allowance;
    }
}
