package splitwise;

public class SplitwiseApp {

    public static void main(String[] args){

        System.out.println("=== Splitwise Console ===");
        System.out.println("Track shared expenses with friends.");
        System.out.println("More features coming in the next lessons.");

        String payerName="viswa";
        double totalAmount = 500.0;

        int numFriends =3;
        double perPersonShare = totalAmount/numFriends;


        System.out.println(payerName);
        System.out.println(totalAmount);
        System.out.println(numFriends);
        System.out.println(perPersonShare);

    }

}