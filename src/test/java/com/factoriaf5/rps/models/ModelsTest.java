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
    public void isARock(){
        Rock object = new Rock();
        String result = object.getName();
        assertEquals("Rock", result);
    }
    
    @Test
    public void create_paper(){
        Object paper = new Paper();
        assertTrue(paper instanceof Paper);
        assertTrue("Paper", true);
    }

    @Test
    public void isAPaper(){
        Paper object = new Paper();
        String result = object.getName();
        assertEquals("Paper", result);
    }
    
    @Test
    public void create_scissors(){
        Object scissors = new Scissors();
        assertTrue(scissors instanceof Scissors);
        assertTrue("Scissors", true);
    }
    
    @Test
    public void isAScissor(){
        Scissors object = new Scissors();
        String result = object.getName();
        assertEquals("Scissors", result);
    }
}
