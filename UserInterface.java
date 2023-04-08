import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private gradeCalculator calculator;
    
    public UserInterface(Scanner scanner, gradeCalculator calculator) {
        this.scanner = scanner;
        this.calculator = calculator;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            } else if (number <= 0 || number >= 100) {
                continue;
            }
            calculator.add(number);
        }
        
        System.out.println("Point average (all): " + calculator.averageOfPoints());
        System.out.println("Point average (passing): " + calculator.pointsAveragePassing());
        System.out.println("Pass percentage: " + calculator.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println(calculator.gradeDistribution());
    }
}
