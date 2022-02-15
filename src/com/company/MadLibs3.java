package com.company;

import java.util.Random;

public class MadLibs3 {

    public static void main(String[] args) {
        String[] noun = {"Teacher", "Trampoline", "Phoenix", "Phone", "Museum"};
        String[] adjective = {"new", "blue", "sparkly", "tall", "wealthy"};
        String[] verb = {"resist", "bounced", "fell", "hiked", "sang"};

        Random random = new Random(System.currentTimeMillis());

        System.out.println("This is a story about a " + noun[random.nextInt(5)]);
        System.out.println("They loved to go to the " + noun[random.nextInt(5)]);
        System.out.println("One day they came across a " + adjective[random.nextInt(5)] + " " + noun[random.nextInt(5)] + ".");
        System.out.println("It " + verb[random.nextInt(5)] + " them because it was so " + adjective[random.nextInt(5)] + ".");
        System.out.println("They decided to " + verb[random.nextInt(5)] + " it home.");
        System.out.println("They displayed it on their " + adjective[random.nextInt(5)] + " " + noun[random.nextInt(5)]);
        System.out.println("The next day, their " + adjective[random.nextInt(5)] + " friend came by and saw their " + adjective[random.nextInt(5)] + " display.");
        System.out.println("Their friend " + verb[random.nextInt(5)] + " their item and it " + verb[random.nextInt(5)] + ".");
        System.out.println("Their friend was " + verb[random.nextInt(5)] + " and decided to buy them a new " + noun[random.nextInt(5)]);
    }
}
