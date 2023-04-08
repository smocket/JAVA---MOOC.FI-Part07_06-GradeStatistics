import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class gradeCalculator {
    private Scanner scanner;
    private ArrayList<Integer> gradesList;
    
    public gradeCalculator(Scanner scanner) {
        this.scanner = scanner;
        gradesList = new ArrayList<>();
    }
    
    public void add(int number) {
        this.gradesList.add(number);
    }
    
    public double averageOfPoints() {
        int suma = 0;
        for(int i = 0; i < gradesList.size(); i++) {
            suma += gradesList.get(i);
        }
        return 1.0 * suma / gradesList.size();
    }
    
    public double pointsAveragePassing() {
        int suma = 0;
        int passingCounter = 0;
        for(int i = 0; i < gradesList.size(); i++) {
            if(gradesList.get(i) >= 50) {
                suma += gradesList.get(i);
                passingCounter++;
            }
        }
        return 1.0 * suma / passingCounter;
    }
    
    public double passPercentage() {
        int passingGrades = 0;
        for(int i = 0; i < gradesList.size(); i++) {
            if(gradesList.get(i) >= 50) {
                passingGrades++;
            }
        }
        return (1.0 * passingGrades * 100) / gradesList.size();
    }
    
    public String gradeDistribution() {
        String cinci = "5: ";
        String patru = "4: ";
        String trei = "3: ";
        String doi = "2: ";
        String unu = "1: ";
        String zero = "0: ";
        
        for(int i = 0; i < gradesList.size(); i++) {
            if(gradesList.get(i) >= 90) {
                cinci += "*";
            } else if(gradesList.get(i) >= 80) {
                patru += "*";
            } else if(gradesList.get(i) >= 70) {
                trei += "*";
            } else if(gradesList.get(i) >= 60) {
                doi += "*";
            } else if(gradesList.get(i) >= 50) {
                unu += "*";
            } else {
                zero += "*";
            }
        }
        
        return cinci + "\n" +
                patru + "\n" +
                trei + "\n" + 
                doi + "\n" +
                unu + "\n" +
                zero + "\n";
    }
    
    public String toString() {
        return "";
    }
}
