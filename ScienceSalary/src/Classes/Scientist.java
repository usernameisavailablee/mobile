package Classes;

public abstract class Scientist implements ScientistIf{
    protected double seniority, salary;
    public  Scientist(double seniority,double salary){
        this.seniority = seniority;
        this.salary = salary;
    }
    public double allowance (){
        return 1;
    }
    public void recruit (){
        return;
    }

    public void fire (){
        return;
    }
    public void move_to_position() {

    }

    public void calculate_salary(){

    }

    public void get_salary(){

    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
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