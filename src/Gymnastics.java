import java.util.Scanner;
public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String discipline = scanner.nextLine();

        double difficulty = 0;
        double execution = 0;

        if ("Russia".equals(country)){
            if ("ribbon".equals(discipline)){
                difficulty = 9.100;
                execution = 9.400;
            }
            else if ("hoop".equals(discipline)){
                difficulty = 9.300;
                execution = 9.800;
            }
            else if ("rope".equals(discipline)){
                difficulty = 9.600;
                execution = 9.000;
            }
        }
        else if ("Bulgaria".equals(country)){
            if ("ribbon".equals(discipline)){
                difficulty = 9.600;
                execution = 9.400;
            }
            else if ("hoop".equals(discipline)){
                difficulty = 9.550;
                execution = 9.750;
            }
            else if ("rope".equals(discipline)){
                difficulty = 9.500;
                execution = 9.400;
            }
        }
        else if ("Italy".equals(country)){
            if ("ribbon".equals(discipline)){
                difficulty = 9.200;
                execution = 9.500;
            }
            else if ("hoop".equals(discipline)){
                difficulty = 9.450;
                execution = 9.350;
            }
            else if ("rope".equals(discipline)){
                difficulty = 9.700;
                execution = 9.150;
            }
        }
        double maxGrade = 20;

        System.out.printf("The team of %s get %.3f on %s.\n",country,difficulty + execution,discipline);
        System.out.printf("%.2f%%",((maxGrade - difficulty - execution) / maxGrade) * 100);
    }
}