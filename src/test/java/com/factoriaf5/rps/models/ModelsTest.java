package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelsTest {

    @Test
    public void create_rock(){
        Object rock = new Rock();
        assertTrue(rock instanceof Rock);
        assertTrue("Rock", true);
    }
    
    @Test
    public void create_paper(){
        Object paper = new Paper();
        assertTrue(paper instanceof Paper);
        assertTrue("Paper", true);
    }

    @Test
    public void create_scissors(){
        Object scissors = new Scissors();
        assertTrue(scissors instanceof Scissors);
        assertTrue("Scissors", true);
    }

}
