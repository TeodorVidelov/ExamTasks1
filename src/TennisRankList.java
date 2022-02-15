import java.util.Scanner;
public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfTournaments = Integer.parseInt(scanner.nextLine());
        int  startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int countW = 0;

        for (int i = 0; i < countOfTournaments; i++) {
            String reachedStageOfTournament = scanner.nextLine();

            if ("W".equals(reachedStageOfTournament)) {
                points += 2000;
                countW++;
            }
            else if ("F".equals(reachedStageOfTournament)){
                points += 1200;
            }
            else if ("SF".equals(reachedStageOfTournament)){
                points += 720;
            }
        }
        System.out.printf("Final points: %d\n",points + startPoints);
        System.out.printf("Average points: %d\n",points / countOfTournaments);
        System.out.printf("%.2f%%",(countW * 1.0 / countOfTournaments) * 100);
    }
}