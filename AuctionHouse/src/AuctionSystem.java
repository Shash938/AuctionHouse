import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class AuctionSystem {

    private List<Bid> bids = new ArrayList<>();
    private Random random = new Random();

    public void placeBid(String name, double amount) {

        int randomBid = random.nextInt(200) + (int) amount;

        System.out.println("Your bid: ₹" + amount);
        System.out.println("System generated bid: ₹" + randomBid);

        if (randomBid > amount)
            System.out.println("System outbid you!");
        else
            System.out.println("You are winning!");

        bids.add(new Bid(name, amount));
    }

    public void showHighestBid() {

        bids.stream()
                .max(Comparator.comparing(Bid::getAmount))
                .ifPresent(b -> System.out.println("Highest Bid: " + b));
    }

    public void showSortedBids() {

        bids.stream()
                .sorted(Comparator.comparing(Bid::getAmount))
                .forEach(System.out::println);
    }

    public void countBids() {

        long count = bids.stream().count();
        System.out.println("Total bids: " + count);
    }
}