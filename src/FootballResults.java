import java.util.Scanner;
public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resultFromFirstMatch = scanner.nextLine();
        String resultFromSecondMatch = scanner.nextLine();
        String resultFromThirdMatch = scanner.nextLine();

        int firstResult1 = resultFromFirstMatch.charAt(0);
        int secondResult1 = resultFromFirstMatch.charAt(2);

        int won = 0;
        int lost = 0;
        int drawn = 0;

        if (firstResult1 > secondResult1){
            won++;
        }
        else if (firstResult1 == secondResult1){
            drawn++;
        }
        else {
            lost++;
        }

        int firstResult2 = resultFromSecondMatch.charAt(0);
        int secondResult2 = resultFromSecondMatch.charAt(2);

        if (firstResult2 > secondResult2){
            won++;
        }
        else if (firstResult2 == secondResult2){
            drawn++;
        }
        else {
            lost++;
        }
        int firstResult3 = resultFromThirdMatch.charAt(0);
        int secondResult3 = resultFromThirdMatch.charAt(2);

        if (firstResult3 > secondResult3){
            won++;
        }
        else if (firstResult3 == secondResult3){
            drawn++;
        }
        else {
            lost++;
        }
        System.out.printf("Team won %d games.\n", won);
        System.out.printf("Team lost %d games.\n", lost);
        System.out.printf("Drawn games: %d",drawn);
    }
}