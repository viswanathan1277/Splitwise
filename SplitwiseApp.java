package splitwise;
import java.util.ArrayList;
import java.util.Scanner;

public class SplitwiseApp {


    public static void addFriend(Scanner input, ArrayList<Friend> friends) {

        System.out.print("Friend name :");
        String friendName = input.nextLine();

        friends.add(new Friend(friendName));

        System.out.println("Added  " + friendName + ".");
    }
        public static void main (String[]args){
        Scanner input=new Scanner(System.in);

        ArrayList<Friend>friends=new ArrayList<>();
            boolean running = true;

            while (running) {


                System.out.println("1.Record Expense");
                System.out.println("2.Add Friend");
                System.out.println("3.List Friend");
                System.out.println("0.Quit");
                System.out.println("Choice :");
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {

                    case 1 -> {

                        if (friends.isEmpty()) {
                            System.out.println("No friend yet , add friends first");
                        } else {
                            System.out.print("who paid ? :");
                            String payerName = input.nextLine();

                            System.out.print("Total amount ? :");
                            double totalAmount = input.nextDouble();
                            input.nextLine();

                            int numFriends = friends.size();
                            double perPersonShare = totalAmount / numFriends;

                            String expenseLine = "%s paid :₹%.2f ".formatted(payerName, totalAmount);
                            String shareLine = "Each person pays: %.2f ".formatted(perPersonShare);


                            System.out.println(expenseLine);
                            System.out.println(shareLine);
                        }

                    }

                    case 0 -> {
                        running = false;
                        System.out.println("Goodbye!!");


                    }

                    case 2 -> addFriend(input, friends);

                    case 3 -> {
                        if (friends.isEmpty()) {
                            System.out.println("No friend yet");
                        } else {
                            System.out.println("Friends who were added");
                            for (Friend friend : friends) {
                                System.out.println("- " + friend.getName());
                            }
                        }
                    }

                    default -> {
                        System.out.println("Invalid Choice");
                        System.out.println("Try again");

                    }


                }

            }
        }
    }


