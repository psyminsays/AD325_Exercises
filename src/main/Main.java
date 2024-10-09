package main;

public class Main {
    public static void main(String[] args) {
        // Create a new main.Cup instance
        Cup myCup = new Cup("Water", 75.0);

        // Display initial state
        System.out.println("Initial liquid type: " + myCup.getLiquidType());
        System.out.println("Initial percent full: " + myCup.getPercentFull() + "%");

        // Change the liquid type and percent full
        myCup.setLiquidType("Juice");
        myCup.setPercentFull(50.0);

        // Display the updated state

        System.out.println("Updated liquid type: " + myCup.getLiquidType());
        System.out.println("Updated percent full: " + myCup.getPercentFull() + "%");
    }
}
