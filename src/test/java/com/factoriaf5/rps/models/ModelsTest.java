package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelsTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }

    @Test
    public void createNewRock(){
        Object rock = new Rock();
        Object paper = new Paper();
        assertNotSame(paper, rock);
    }
    
    @Test
    public void createNewPaper(){
        Object paper = new Paper();
        Object rock = new Rock();
        assertNotSame(rock, paper);
    }
}
