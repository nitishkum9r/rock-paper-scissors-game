import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        try (// 0 for rock
                // 1 for paper
                // 2 scissors
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 0 for rock , 1 for paper and 2 for scissor");
            int UserInput = sc.nextInt();

            Random random = new Random();
            int ComputerInput = random.nextInt(3);

            if (UserInput == ComputerInput) {
                System.out.println("Draw");
            } else if (UserInput == 0 && ComputerInput == 2 || UserInput == 1 && ComputerInput == 0
                    || UserInput == 2 && ComputerInput == 1) {
                System.out.println("You win");
            } else {
                System.out.println("computer won");
            }

            if(ComputerInput==0){
                System.out.println("computer choise: Rock");
            }
            else if(ComputerInput==1){
                System.out.println("computer choise: paper");
            }
            else if(ComputerInput==2){
                System.out.println("computer choise: scissors");
            }
        }
    }
}
