package com.factoriaf5.rps.models;
import com.factoriaf5.rps.application.Game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void rock_wins_scissors(){
        Game game = new Game();
        Rock playerOne = new Rock();
        Scissors playerTwo = new Scissors();

        String result = game.play(playerOne.getName(), playerTwo.getName());

        assertEquals("Rock wins", result);
    }
}
