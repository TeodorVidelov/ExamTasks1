import java.util.Scanner;
public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        double startPoints = 301;
        int countBadShots = 0;
        int countGoodShots = 0;

        while (startPoints != 0){
            String field = scanner.nextLine();

            if ("Retire".equals(field)){
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());

                if ("Double".equals(field)){
                    points *= 2;
                }
                else if ("Triple".equals(field)){
                    points *= 3;
                }

                if (startPoints - points >= 0) {
                    startPoints -= points;
                    countGoodShots++;
                }
                else {
                    countBadShots++;
                }
            }
        if (startPoints == 0){
            System.out.printf("%s won the leg with %d shots.",playerName,countGoodShots);
        }

        else {
            System.out.printf("%s retired after %d unsuccessful shots.",playerName,countBadShots);
        }
    }
}