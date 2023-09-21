package Classes;

public abstract class Scientist{
    protected double seniority, salary;
    public  Scientist(double seniority,double salary){
        this.seniority = seniority;
        this.salary = salary;
    }
    public double allowance (){
        double calculated_allowance = 1;
        return  calculated_allowance;
    }
    public void recruit (){
        return;
    }

    public void fire (){
        return;
    }
    public void  move_to_posicion(){

    }

    public void calculate_salary(){

    }

    public void get_salary(){
        
    }

    public double getSeniority() {
        return this.seniority;
    }
    public void setSeniority(int newValue) {
        if (newValue >= 0) {
            seniority = newValue;
        }
    }

    public String toString() {
        return "{" + "salary='" + this.salary + '\''+ "seniority='" + this.seniority + '}';
    }

}
