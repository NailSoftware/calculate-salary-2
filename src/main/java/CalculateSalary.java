import java.util.function.Predicate;

public class CalculateSalary {

    public boolean calculate(double salary) {

        int percentage = 8;
        salary -= (salary * percentage) / 100;

        Predicate<Double> predicate = p-> p > 950; // 950 yox 1000 yaz

        return predicate.test(salary);

    }

}
