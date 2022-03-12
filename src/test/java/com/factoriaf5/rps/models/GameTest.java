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

    @Test
    public void rock_wins_scissors_reverse(){
        Game game = new Game();
        Scissors playerOne = new Scissors();
        Rock playerTwo = new Rock();

        String result = game.play(playerOne.getName(), playerTwo.getName());

        assertEquals("Rock wins", result);
    }

    @Test
    public void scissors_wins_paper(){
        Game game = new Game();
        Scissors playerOne = new Scissors();
        Paper playerTwo = new Paper();

        String result = game.play(playerOne.getName(), playerTwo.getName());

        assertEquals("Scissors wins", result);
    }

    @Test
    public void scissors_wins_paper_reverse(){
        Game game = new Game();
        Paper playerOne = new Paper();
        Scissors playerTwo = new Scissors();

        String result = game.play(playerOne.getName(), playerTwo.getName());

        assertEquals("Scissors wins", result);
    }

    @Test
    public void paper_wins_rocks(){
        Game game = new Game();
        Paper playerOne = new Paper();
        Rock playerTwo = new Rock();

        String result = game.play(playerOne.getName(), playerTwo.getName());

        assertEquals("Paper wins", result);
    }

    @Test
    public void paper_wins_rocks_reverse(){
        Game game = new Game();
        Rock playerOne = new Rock();
        Paper playerTwo = new Paper();

        String result = game.play(playerOne.getName(), playerTwo.getName());

        assertEquals("Paper wins", result);
    }
}
