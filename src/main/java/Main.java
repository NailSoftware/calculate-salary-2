public class Main {
    public static void main(String[] args) {

        var calculateSalary = new CalculateSalary();

        if (calculateSalary.calculate(1200)) {
            System.out.println("higher than 950");
        }else {
            System.out.println("less and equal than 950");
        }

    }
}
