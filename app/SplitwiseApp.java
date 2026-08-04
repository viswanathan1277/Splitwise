/**
 * Contains the console application and menu logic.
 */
package splitwise.app;

import splitwise.model.ExpenseLine;
import splitwise.model.Friend;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Console application for managing friends and expenses in Splitwise.
 */
public class SplitwiseApp {

    /**
     * Reads a friend's name and adds the friend to the list.
     *
     * @param input scanner used to read input
     * @param friends list of friends
     */
    public static void addFriend(Scanner input, ArrayList<Friend> friends) {

        System.out.print("Friend name :");
        String friendName = input.nextLine();
        Friend friend = new Friend(friendName);

        friends.add(friend);

        System.out.println(FriendDisplay.addedMessage(friend));
    }

    private static class FriendDisplay {


        static String addedMessage(Friend friend)
        {
            return "Added %s (id %d).".formatted(friend.getName(), friend.getId());
        }

        static String DisplayFriendList(Friend friend)
    {
            return "Id:%d %s".formatted(friend.getId(),friend.getName());
    }
    }

    /**
     * Starts the Splitwise application.
     *
     * @param args command line arguments
     */
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
                            double amount = input.nextDouble();
                            input.nextLine();

                            ExpenseLine line = new ExpenseLine(payerName,amount);

                            int numFriends = friends.size();
                            double perPersonShare = line.amount()/ numFriends;

                            String expenseLine = "%s paid :₹%.2f ".formatted(line.payerName(),line.amount());
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
                                System.out.println(SplitwiseApp.FriendDisplay.DisplayFriendList(friend));
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



