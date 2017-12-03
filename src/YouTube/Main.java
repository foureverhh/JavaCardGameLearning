package YouTube;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        /**
         *
        Card c1 = new Card(Suit.HEARTS, Rank.ACE),
             c2 = new Card (Suit.HEARTS, Rank.JACK);



        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();

        //create a hand
        Hand h1 = new Hand();
        Hand h2 = new Hand();

        h1.add(c1);
        h1.add(c2);
        System.out.println(h1.showHand());

        h1.give(c1,h2);
        System.out.println("Now card in h1 is : "+h1.showHand()+"and card in h2 is: "+h2.showHand());

         */

        //create a deck

        Deck deck1 = new Deck();
        deck1.populate();
        System.out.println("Here is everything in hand: ");
        System.out.println(deck1.showHand());
        System.out.println();

        deck1.shuffle();
        System.out.println("Here is everything in hand: ");
        System.out.println(deck1.showHand());

        System.out.println(deck1.cards.size());



    }
}
