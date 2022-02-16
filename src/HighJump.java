import java.util.Scanner;
public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scanner.nextLine());

        int startHeight = targetHeight - 30;
        int countJumps = 0;
        boolean isFailed = false;

        while (startHeight <= targetHeight){
            for (int i = 1; i <= 3; i++) {

                int jump = Integer.parseInt(scanner.nextLine());
                countJumps++;

                if (jump > startHeight) {
                    startHeight += 5;
                    break;
                }
                if (i == 3){
                    System.out.printf("Tihomir failed at %dcm after %d jumps.",startHeight,countJumps);
                    isFailed = true;
                }
            }
            if (isFailed){
                break;
            }
        }
        if (!isFailed){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",targetHeight,countJumps);
        }
    }
}