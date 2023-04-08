import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gradeCalculator calculator = new gradeCalculator(scanner);
        UserInterface ui = new UserInterface(scanner, calculator);
        
        ui.start();
    }
}
