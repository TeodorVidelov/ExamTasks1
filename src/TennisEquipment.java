import java.util.Scanner;
public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfOneTennisRocket = Double.parseDouble(scanner.nextLine());
        int countTennisRockets = Integer.parseInt(scanner.nextLine());
        int countTrainers = Integer.parseInt(scanner.nextLine());

        double priceOfTrainers = priceOfOneTennisRocket * 1 / 6;
        double sumTennisRockets = priceOfOneTennisRocket * countTennisRockets;
        double sumTrainers = priceOfTrainers * countTrainers;
        double sumOfOtherEquipment = (sumTennisRockets + sumTrainers) * 0.2;
        double totalSum = sumTrainers + sumTennisRockets + sumOfOtherEquipment;

        double payedFromTennisPlayer = totalSum * 1 / 8;
        double payedFromSponsors = totalSum * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f\n",Math.floor(payedFromTennisPlayer));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(payedFromSponsors));
    }
}