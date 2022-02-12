import java.util.Scanner;
public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stageOfChampionship = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        boolean photoWithTrophy = scanner.nextLine().equals("Y");

        double ticketPrice = 0;

        switch (stageOfChampionship){
            case "Quarter final":
                if ("Standard".equals(typeOfTicket)){
                    ticketPrice = 55.50;
                }
                else if ("Premium".equals(typeOfTicket)){
                    ticketPrice = 105.20;
                }
                else if ("VIP".equals(typeOfTicket)){
                    ticketPrice = 118.90;
                }
                break;
            case "Semi final":
                if ("Standard".equals(typeOfTicket)){
                    ticketPrice = 75.88;
                }
                else if ("Premium".equals(typeOfTicket)){
                    ticketPrice = 125.22;
                }
                else if ("VIP".equals(typeOfTicket)){
                    ticketPrice = 300.40;
                }
                break;
            case "Final":
                if ("Standard".equals(typeOfTicket)){
                    ticketPrice = 110.10;
                }
                else if ("Premium".equals(typeOfTicket)){
                    ticketPrice = 160.66;
                }
                else if ("VIP".equals(typeOfTicket)){
                    ticketPrice = 400.00;
                }
                break;
        }
        double sum = ticketPrice * countTickets;
            if (sum > 4000){
                sum *= 0.75;
                photoWithTrophy = false;
            }
            else if (sum > 2500){
                sum *= 0.90;
            }
            if (photoWithTrophy){
                sum += (countTickets * 40);
            }
        System.out.printf("%.2f",sum);
    }
}