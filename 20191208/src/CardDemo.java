import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card {
    public String suit;
    public int rank;

    public Card(String suit,int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';*/
        return String.format("[%s %d]", suit, rank);
    }
}

public class CardDemo {
    private static final String[] suits = {"♥","♠","♦","♣"};

    private List<Card> buyPuke() {
        List<Card> deck = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13 ; j++) {
                String suit = suits[i];
                //int rank = j;

                Card card = new Card(suit,j);
                deck.add(card);
            }
        }
        return deck;
    }

    private void swap(List<Card> deck,int start,int end) {
        Card tmp = deck.get(start);
        deck.set(start,deck.get(end));
        deck.set(end,tmp);
    }

    public void shuffle(List<Card> deck) {
        Random random = new Random();
        //Random random = new Random(20191224);
        for (int i = deck.size() - 1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(deck,i,index);
        }
    }

    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> list = cardDemo.buyPuke();
        System.out.println(list);
        System.out.println("洗牌：");
        cardDemo.shuffle(list);
        System.out.println(list);
        System.out.println("发牌： ");

        List<List<Card>> hands = new ArrayList<>();
        List<Card> human1 = new ArrayList<>();
        List<Card> human2 = new ArrayList<>();
        List<Card> human3 = new ArrayList<>();

        hands.add(human1);
        hands.add(human2);
        hands.add(human3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Card catchCard = list.remove(0);
                hands.get(i).add(catchCard);
                //hands.get(j).add(list.remove(0));
            }
        }
        System.out.println("第一个人的牌： ");
        System.out.println(human1);
        System.out.println("第二个人的牌： ");
        System.out.println(human2);
        System.out.println("第三个人的牌： ");
        System.out.println(human3);
        System.out.println("剩下的牌：");
        System.out.println(list);
    }



}



















