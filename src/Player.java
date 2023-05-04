import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    protected String name;
    protected int playersNumber = 4;
    private final ArrayList<Card> cardsInHand = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private String winner;
    private boolean gameOver;

    public Player(String name, int playersNumber) {
        this.name = name;
        this.playersNumber = playersNumber;
        gameOver = false;
    }

    //karte zu hand
    public void giveCard(Card card) {
        cardsInHand.add(card);
    }


    //karte auf dem tisch legen
    public Card playerDropCard() {
        int choice = input.nextInt();   //kann wählen welche karte(wievielte) vom reihe(1-7)
        if (choice > 0 || choice < cardsInHand.size()) {
            return cardsInHand.remove(choice - 1);
        }
        return null;
    }

//    public boolean sayUno() {
//        boolean uno = false;
//        if (cards.size() ==1) {
//            uno = true;
//        } return uno;
//    }

//    public String winner() {
//        for (Player p : players) {
//            if (p.cardsInHand.size() == 0) {
//                winner = p.getName();
//                gameOver = true;
//            }
//        } return winner;
//    }

    public int countMyCards() {   //wie viel karte habe ich
        return cardsInHand.size();
    }
    public String showMyCards() {
        String myCards = "";
        int i = 1;
        for (Card shoMyCards : cardsInHand) {
            myCards += i+ " -> " + shoMyCards.toString() + "\n";
            i++;
        } return myCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }




    @Override
    public String toString() {
        return "Player"+playersNumber +": "+ name + " Karten in Hand: "+cardsInHand + "\n";
    }
}
