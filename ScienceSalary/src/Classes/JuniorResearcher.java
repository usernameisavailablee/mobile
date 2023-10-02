package Classes;

public class JuniorResearcher extends Scientist{
    public JuniorResearcher(double seniority,double salary){
        super(seniority,salary);
    }
    @Override
    public double allowance() {
        return salary*(1+seniority*0.2);
    }
}