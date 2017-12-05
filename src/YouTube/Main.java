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

        /*System.out.println("Here is everything in hand: ");
        System.out.println(deck1.showHand());
        System.out.println();*/


        //shuffle a deck
        deck1.shuffle();
        /*
        System.out.println("Here is everything in hand: ");
        System.out.println(deck1.showHand());
*/

        //Create our playing hands
        Hand h1,h2,h3,dealer;
        h1 = new Hand();
        h2 = new Hand();
        h3 = new Hand();
        dealer = new Hand();

        Hand[] hands ={h1,h2,h3};

        //Deal cards to our hands
        deck1.deal(hands, 2);

        //Deal two cards to dealer
        deck1.deal(dealer,2);

        for(Card c: dealer.cards)
        {
            c.flipCard();
            System.out.println(c);
        }

        for(int i=0;i<hands.length;i++)
        {
            hands[i].flipCards();
            System.out.println("Hand"+(i+1)+"'s cards are:");
            System.out.println(hands[i].showHand());
        }


        //Flip the dealer's first card

        dealer.cards.get(0).flipCard();

        //Flip the dealer's cards
        System.out.println("Dealer's cards are:");
        System.out.println("\n Dealer's Cards:\n"+ dealer.showHand());






    }
}
