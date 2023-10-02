package Classes;

import Classes.Scientist;

public class Engineer implements Scientist {

    private double seniority;
    private double salary;

    public Engineer(double seniority, double salary) {
        this.seniority = seniority;
        this.salary = salary;
    }

    @Override
    public double allowance() {
        // Ваша реализация для метода allowance()
        return salary * (1 + seniority * 0.1);
    }

    @Override
    public void recruit() {
        // Ваша реализация для метода recruit()
    }

    @Override
    public void fire() {
        // Ваша реализация для метода fire()
    }

    @Override
    public void move_to_position() {
    }

    @Override
    public void calculate_salary() {
    }

    @Override
    public void get_salary() {
        // Ваша реализация для метода get_salary()
    }

    @Override
    public boolean equals(Object obj) {
        // Ваша реализация для метода equals()
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override
    public double getSeniority() {
        // Ваша реализация для метода getSeniority()
        return seniority;
    }

    @Override
    public void setSeniority(int newValue) {
        // Ваша реализация для метода setSeniority()
        if (newValue >= 0) {
            seniority = newValue;
        }
    }

    @Override
    public String toString() {
        // Ваша реализация для метода toString()
        return "{" + "salary='" + salary + '\'' + "seniority='" + seniority + '}';
    }
}


//
//    public void get_salary(){
//
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        else return false;
//    }
//
//    public double getSeniority() {
//        return this.seniority;
//    }
//    public void setSeniority(int newValue) {
//        if (newValue >= 0) {
//            seniority = newValue;
//        }
//    }
//
//    public String toString() {
//        return "{" + "salary='" + this.salary + '\''+ "seniority='" + this.seniority + '}';
//    }
//
