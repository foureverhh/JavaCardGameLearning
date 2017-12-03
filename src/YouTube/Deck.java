package YouTube;

import java.util.*;

public class Deck extends Hand {

    Random rand = new Random();



    public Deck()
    {
        super();
    }

    public void populate()
    {
        /*
        * FOR Suit in Suits for(Suit s:Suit.value())
        *       FOR Rank in Ranks
        *           SET card to Card with Rank & suit
        *           CALL cards.add with card
        *       END FOR
        * END
        */
        for(Suit suit:Suit.values()){
            for(Rank rank:Rank.values()){
                Card card = new Card(suit,rank);
                this.add(card);  //Add all cards into a hand
            }
        }
    }


    public void shuffle()
    {
        for(int i = cards.size()-1; i>0;i--)
        {
            //swap a random card between the beginning
            //and last card of the loop
            System.out.println(i);

            int pick = rand.nextInt(i);                                   //??
            Card randomCard = cards.get(pick);                            //??
            Card lastCard = cards.get(i);

            cards.set(i,randomCard);//??
            cards.set(pick,lastCard);//??

            System.out.println("The "+i+" is "+ randomCard.toString());

            //challenge A:try to condense this to a 3 line of code
            //challenge B:try to cut the deck, split the deck at a random place. Then take the top half and swap the botton half.
        }
    }


}
