package YouTube;
import java.lang.*;
public class Card
{
//    Create our suit (enum type)
    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    //constructor

    public Card(Suit suit,Rank rank)
    {
        this.suit=suit;
        this.rank=rank;
        isFaceUp = false;
    }

    //public Methods
    public String getSuit()
    {
        return suit.printSuit();
    }

    public int getRank()
    {
        return rank.getRank();
    }

    public String printRank()
    {
        //get rank as a string (primary for Aces)
        return rank.printRank();
    }
    public String toString()
    {
        String str = "";
        if(isFaceUp)
        {

            str += rank.printRank()+" of "+suit.printSuit();

        }
        else
        {
            str ="The cards are face down.";
        }
        return str;
    }

    public void flipCard()
    {
       isFaceUp = true;
    }


}
