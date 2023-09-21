package Classes;

public abstract class Scientist{
    protected double seniority, salary;
    public  Scientist(double seniority,double salary){
        this.seniority = seniority;
        this.salary = salary;
    }
    public double allowance (){
        double calculated_allowance = 0;
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

    public String toString() {
        return "{" + "salary='" + this.salary + '\''+ "seniority='" + this.seniority + '}';
    }

}
