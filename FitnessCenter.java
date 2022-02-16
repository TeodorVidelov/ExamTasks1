import java.util.Scanner;
public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countVisitors = Integer.parseInt(scanner.nextLine());

        int countBack = 0;
        int countChest = 0;
        int countLegs = 0;
        int countAbs = 0;
        int countProteinShake = 0;
        int countProteinBar = 0;

        for (int i = 0; i < countVisitors; i++) {
            String typeWorkout = scanner.nextLine();
            if ("Back".equals(typeWorkout)){
                countBack++;
            }
            else if("Chest".equals(typeWorkout)){
                countChest++;
            }
            else if("Legs".equals(typeWorkout)){
                countLegs++;
            }
            else if ("Abs".equals(typeWorkout)){
                countAbs++;
            }
            else if ("Protein shake".equals(typeWorkout)){
                countProteinShake++;
            }
            else if ("Protein bar".equals(typeWorkout)){
                countProteinBar++;
            }
        }
        int countWorkout = countBack + countChest + countLegs + countAbs;
        int countProtein = countProteinBar + countProteinShake;
        System.out.printf("%d - back\n",countBack);
        System.out.printf("%d - chest\n",countChest);
        System.out.printf("%d - legs\n",countLegs);
        System.out.printf("%d - abs\n",countAbs);
        System.out.printf("%d - protein shake\n",countProteinShake);
        System.out.printf("%d - protein bar\n",countProteinBar);
        System.out.printf("%.2f%% - work out\n",(countWorkout * 1.0 / countVisitors) * 100);
        System.out.printf("%.2f%% - protein",(countProtein * 1.0 / countVisitors) * 100);
    }
}