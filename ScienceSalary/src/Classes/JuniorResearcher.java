package Classes;

public class JuniorResearcher implements Scientist{
    private double seniority;
    private double salary;

    public JuniorResearcher(double seniority,double salary){

    }
    @Override
    public double allowance() {
        return salary*(1+seniority*0.2);
    }

    @Override
    public void recruit() {

    }

    @Override
    public void fire() {

    }

    @Override
    public void move_to_position() {

    }

    @Override
    public void calculate_salary() {

    }

    @Override
    public void get_salary() {

    }

    @Override
    public double getSeniority() {
        return 0;
    }

    @Override
    public void setSeniority(int newValue) {

    }
}
