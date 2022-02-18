import java.util.Scanner;
public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();

        int countWin = 0;
        int countLost = 0;
        int sumMatches = 0;

        while (!"End of tournaments".equals(tournamentName)){
            int countMatches = Integer.parseInt(scanner.nextLine());
            sumMatches += countMatches;
            for (int i = 1; i <= countMatches; i++) {
                int hostTeam = Integer.parseInt(scanner.nextLine());
                int guestTeam = Integer.parseInt(scanner.nextLine());

                int diff = Math.abs(hostTeam - guestTeam);
                if (hostTeam > guestTeam){
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n",i,tournamentName,diff);
                }
                else {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n",i,tournamentName,diff);
                }
            }

            tournamentName = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win\n",(countWin * 1.0 / sumMatches) * 100);
        System.out.printf("%.2f%% matches lost",(countLost * 1.0 / sumMatches)* 100);
    }
}