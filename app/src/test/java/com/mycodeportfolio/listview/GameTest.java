package com.mycodeportfolio.listview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game(1, "Monopoly", "Board Game");
    }

    @Test
    public void hasRank(){
        assertEquals(1, game.getRank());
    }

    @Test
    public void hasGameName(){
        assertEquals("Monopoly", game.getGameName());
    }

    @Test
    public void hasCategory(){
        assertEquals("Board Game", game.getCategory());
    }
}
