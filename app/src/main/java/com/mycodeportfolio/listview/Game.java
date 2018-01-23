package com.mycodeportfolio.listview;

public class Game {

    private int rank;
    private String gameName;
    private String category;

    public Game(int rank, String gameName, String category){
        this.rank = rank;
        this.gameName = gameName;
        this.category = category;
    }


    public int getRank() {
        return this.rank;
    }

    public String getGameName() {
        return this.gameName;
    }

    public String getCategory() {
        return this.category;
    }
}
