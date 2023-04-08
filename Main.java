
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gradeCalculator calculator = new gradeCalculator(scanner);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
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
