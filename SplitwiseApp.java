package splitwise;
import java.util.Scanner;
public class SplitwiseApp {

    public static void main(String[] args) {

        System.out.println("=== Splitwise Console ===");
        System.out.println("Track shared expenses with friends.");
        System.out.println("More features coming in the next lessons.");
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {


            System.out.println("1.Record Expense");
            System.out.println("0.Quit");
            System.out.println("Choice :");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {

                case 1: {


                    System.out.print("who paid ? :");
                    String payerName = input.nextLine();

                    System.out.print("Total amount ? :");
                    double totalAmount = input.nextDouble();

                    int numFriends = 3;
                    double perPersonShare = totalAmount / numFriends;

                    String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
                    String shareLine = "Each person pays: %.2f".formatted(perPersonShare);


                    System.out.println(expenseLine);
                    System.out.println(shareLine);
                    break;
                }

                case 0 :
                {
                    running=false;
                    System.out.println("Goodbye!!");



                }

                default:
                {
                    System.out.println("Invalid Choice");
                    System.out.println("Try again");
                }




            }

        }
    }
}


