package YouTube;

import java.util.*;

public class Hand {

    protected ArrayList<Card> cards;



    //constructor
    public Hand()
    {
        cards = new ArrayList<Card>();
    }

    public void clear()
    {
        cards.clear();
    }

    public void add(Card card)
    {
        cards.add(card);
    }

    public String showHand()
    {
        String str ="";
        for(Card c:cards)
        {
            str += c.toString()+"\n";
        }
        return str;
    }

    public boolean give(Card card,Hand otherHand)
    {
        if(!cards.contains(card))
        {
            return false;
        }
        else
        {
            cards.remove(card);
            otherHand.add(card);
            return true;
        }

    }



    //Return the total points of a hand
    public int getTotal()
    {
        int totalPoints = 0;
        boolean hasAce = false;
        //Get total points (any Aces by default will be worth 1)

        for(int i = 0; i<cards.size();i++)
        {
            totalPoints += cards.get(i).getRank();
            //Check to see if the card is an Ace
            if(cards.get(i).printRank()=="Ace")
            {
                hasAce= true;
            }
            //Make Ace worth 11 if total points <=11

            if(hasAce&&totalPoints<=11)
            {
                totalPoints+=10;// Add 10 more to Ace

            }
        }
        return totalPoints;
    }


}
