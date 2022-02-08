import java.util.Scanner;
public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxForYear = Integer.parseInt(scanner.nextLine());

        double priceOfTrainers = taxForYear * 0.60;
        double priceOfClothes = priceOfTrainers * 0.80;
        double priceOfBasketballBall = priceOfClothes * 1 / 4;
        double priceOfAccessories = priceOfBasketballBall * 1 / 5;

        double totalSum = taxForYear + priceOfTrainers + priceOfClothes + priceOfBasketballBall +priceOfAccessories;
        System.out.printf("%.2f",totalSum);
    }
}