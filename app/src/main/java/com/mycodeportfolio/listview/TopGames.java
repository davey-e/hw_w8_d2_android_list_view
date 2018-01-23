package com.mycodeportfolio.listview;

import java.util.ArrayList;

public class TopGames {

    private ArrayList<Game> topGames;
    private int size;

    public TopGames(){
        topGames = new ArrayList<>();
        topGames.add(new Game(1, "Monopoly", "Board Game"));
        topGames.add(new Game(2, "Game of Life Junior", "Board Game"));
        topGames.add(new Game(3, "Monopoly Junior", "Board Game"));
        topGames.add(new Game(4, "Uno", "Card Game"));
        topGames.add(new Game(5, "Yahtzee", "Dice Game"));
        topGames.add(new Game(6, "Snakes and Ladders", "Board Game"));
        topGames.add(new Game(7, "Uno Junior", "Card Game"));
        topGames.add(new Game(8, "Top Trumps", "Card Game"));
        topGames.add(new Game(9, "Snap", "Card Game"));
        topGames.add(new Game(10, "Dobble", "Card Game"));
    }


    public int getSize() {
        return topGames.size();
    }

    public ArrayList<Game> getList() {
        return new ArrayList<>(topGames);
    }
}
