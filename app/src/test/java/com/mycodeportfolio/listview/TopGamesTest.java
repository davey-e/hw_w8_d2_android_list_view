package com.mycodeportfolio.listview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopGamesTest {

    @Test
    public void canGetList(){
        TopGames topGames = new TopGames();
        assertEquals(10, topGames.getSize());
    }
}
