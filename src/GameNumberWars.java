    import java.util.Scanner;
    public class GameNumberWars {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nameOfFirstPlayer = scanner.nextLine();
            String nameOfSecondPlayer = scanner.nextLine();
            String firstPlayerCard = scanner.nextLine();

            int firstPlayerPoints = 0;
            int secondPlayerPoints = 0;

            while (!"End of game".equals(firstPlayerCard)){
                String secondPlayerCard = scanner.nextLine();
                int firstCard = Integer.parseInt(firstPlayerCard);
                int secondCard = Integer.parseInt(secondPlayerCard);

                if (firstCard > secondCard){
                    firstPlayerPoints += firstCard - secondCard;
                }
                else if (firstCard < secondCard) {
                    secondPlayerPoints += secondCard - firstCard;
                }
                else {
                    System.out.println("Number wars!");
                    firstCard = Integer.parseInt(scanner.nextLine());
                    secondCard = Integer.parseInt(scanner.nextLine());
                    if (firstCard > secondCard){
                        System.out.printf("%s is winner with %d points",nameOfFirstPlayer,firstPlayerPoints);
                        break;
                    }
                    else {
                        System.out.printf("%s is winner with %d points", nameOfSecondPlayer,secondPlayerPoints);
                        break;
                    }
                }
                firstPlayerCard = scanner.nextLine();
            }
            if ("End of game".equals(firstPlayerCard)){
                System.out.printf("%s has %d points\n",nameOfFirstPlayer,firstPlayerPoints);
                System.out.printf("%s has %d points",nameOfSecondPlayer,secondPlayerPoints);
            }
        }
    }