package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MadLibs3 {

    public static void main(String[] args) {
        /* old code:
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
    } */
//
        //
        //
        //
        //

        /* changing Array to ArrayList example:
        List<String> noun = new ArrayList<>();
        noun.add("Teacher");
        noun.add("Trampoline");
        noun.add("Phoenix");
        noun.add("phone");
        noun.add("Museum");

        List<String> adjective = new ArrayList<>();
        adjective.add("new");
        adjective.add("blue");
        adjective.add("sparkly");
        adjective.add("tall");
        adjective.add("wealthy");

        List<String> verb = new ArrayList<>();
        verb.add("resit");
        verb.add("bounced");
        verb.add("fell");
        verb.add("hiked");
        verb.add("sang");

        Random random = new Random(System.currentTimeMillis());

        System.out.println("This is a story about a " + noun.get(random.nextInt(5)));
        System.out.println("They loved to go to the " + noun.get(random.nextInt(5)));
        System.out.println("One day they came across a " + adjective.get(random.nextInt(5)) + " " + noun.get(random.nextInt(5)) + ".");
        System.out.println("It " + verb.get(random.nextInt(5)) + " them because it was so " + adjective.get(random.nextInt(5)) + ".");
        System.out.println("They decided to " + verb.get(random.nextInt(5)) + " it home.");
        System.out.println("They displayed it on their " + adjective.get(random.nextInt(5)) + " " + noun.get(random.nextInt(5)));
        System.out.println("The next day, their " + adjective.get(random.nextInt(5)) + " friend came by and saw their " + adjective.get(random.nextInt(5)) + " display.");
        System.out.println("Their friend " + verb.get(random.nextInt(5)) + " their item and it " + verb.get(random.nextInt(5)) + ".");
        System.out.println("Their friend was " + verb.get(random.nextInt(5)) + " and decided to buy them a new " + noun.get(random.nextInt(5)));

*/

        //example getting userInput:
        int indexMax = 5;
        List<String> nouns = new ArrayList();
        List<String> adjectives = new ArrayList();
        List<String> verbs = new ArrayList();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 5 Nouns ");
        for (int i = 0; i < indexMax; i++) {
            nouns.add(userInput.next());
        }
        System.out.println("Please enter 5 Adjectives ");
        for (int i = 0; i < indexMax; i++) {
            adjectives.add(userInput.next());
        }
        System.out.println("Please enter 5 Verbs ");
        for (int i = 0; i < indexMax; i++) {
            verbs.add(userInput.next());
        }

        Random newRandom = new Random(System.currentTimeMillis());

        System.out.println("This is a story about a " + nouns.get(newRandom.nextInt(5)));
        System.out.println("They loved to go to the " + nouns.get(newRandom.nextInt(5)));
        System.out.println("One day they came across a " + adjectives.get(newRandom.nextInt(5)) + " " + nouns.get(newRandom.nextInt(5)) + ".");
        System.out.println("It " + verbs.get(newRandom.nextInt(5)) + " them because it was so " + adjectives.get(newRandom.nextInt(5)) + ".");
        System.out.println("They decided to " + verbs.get(newRandom.nextInt(5)) + " it home.");
        System.out.println("They displayed it on their " + adjectives.get(newRandom.nextInt(5)) + " " + nouns.get(newRandom.nextInt(5)));
        System.out.println("The next day, their " + adjectives.get(newRandom.nextInt(5)) + " friend came by and saw their " + adjectives.get(newRandom.nextInt(5)) + " display.");
        System.out.println("Their friend " + verbs.get(newRandom.nextInt(5)) + " their item and it " + verbs.get(newRandom.nextInt(5)) + ".");
        System.out.println("Their friend was " + verbs.get(newRandom.nextInt(5)) + " and decided to buy them a new " + nouns.get(newRandom.nextInt(5)));

    }
}
