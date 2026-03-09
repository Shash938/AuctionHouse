import java.util.Scanner;
// javac *.java
java Main
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GenericManager<Property> manager = new GenericManager<>();
        AuctionSystem auction = new AuctionSystem();
        PropertyOperations<Property> ops = new PropertyOperations<>();

        manager.add(new House(1, "Luxury Villa", 200000, 5));
        manager.add(new Land(2, "Farm Land", 50000, 1000));

        int choice;

        do {

            System.out.println("\n=== AUCTION SYSTEM ===");
            System.out.println("1 View Properties");
            System.out.println("2 Place Bid");
            System.out.println("3 Show Highest Bid");
            System.out.println("4 Lambda Demo");
            System.out.println("5 Stream Demo");
            System.out.println("0 Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    manager.getAll().forEach(Property::display);
                    break;

                case 2:

                    System.out.println("Enter bidder name:");
                    String name = sc.next();

                    System.out.println("Enter bid amount:");
                    double bid = sc.nextDouble();

                    auction.placeBid(name, bid);
                    break;

                case 3:

                    auction.showHighestBid();
                    break;

                case 4:

                    lambdaDemo();
                    break;

                case 5:

                    auction.showSortedBids();
                    auction.countBids();
                    break;
            }

        } while (choice != 0);

    }

    static void lambdaDemo() {

        ArithmeticOperation add = (a, b) -> a + b;

        ArithmeticOperation multiply = (a, b) -> {
            return a * b;
        };

        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));

        StringOperation reverse =
                s -> new StringBuilder(s).reverse().toString();

        System.out.println("Reverse: " + reverse.process("Auction"));

        NumberCheck even = n -> n % 2 == 0;

        System.out.println("Is 10 even? " + even.check(10));

        NumberCheck prime = n -> {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
            return true;
        };

        System.out.println("Is 7 prime? " + prime.check(7));
    }
}