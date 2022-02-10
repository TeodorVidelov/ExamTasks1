import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesControl = Integer.parseInt(scanner.nextLine());
        int secondsControl = Integer.parseInt(scanner.nextLine());
        double lengthOfTrack = Double.parseDouble(scanner.nextLine());
        int secondsToPassing100Meters = Integer.parseInt(scanner.nextLine());

        double totalSeconds = minutesControl * 60 + secondsControl;
        double slowingTimes = lengthOfTrack / 120;
        double totalSlowingTime = slowingTimes * 2.5;
        double timeOfRacer = (lengthOfTrack / 100) * secondsToPassing100Meters - totalSlowingTime;

        if (totalSeconds >= timeOfRacer){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",Math.abs(timeOfRacer));
        }
        else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",Math.abs(timeOfRacer - totalSeconds));
        }
    }
}