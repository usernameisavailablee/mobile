package Classes;

public interface Scientist {
    double allowance();
    void recruit();
    void fire();
    void move_to_position();
    void calculate_salary();
    void get_salary();
    boolean equals(Object obj);
    double getSeniority();
    void setSeniority(int newValue);
    String toString();
}
