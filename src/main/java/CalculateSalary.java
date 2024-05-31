import java.util.function.Predicate;

public class CalculateSalary {
//ghhvvhjhjv
    public boolean calculate(double salary) {

        int percentage = 8;
        salary -= (salary * percentage) / 100;

        Predicate<Double> predicate = p-> p > 950;

        return predicate.test(salary);

    }

}
