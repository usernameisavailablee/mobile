package Classes;

public class SeniorResearcher implements Scientist{
    private double seniority;
    private double salary;
    public SeniorResearcher(double seniority,double salary){

    }
    @Override
    public double allowance() {
        return salary*(1+seniority*0.3);
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
