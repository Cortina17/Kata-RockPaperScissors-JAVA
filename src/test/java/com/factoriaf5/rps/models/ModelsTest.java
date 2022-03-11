package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelsTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }

    @Test
    public void create_rock(){
        Object rock = new Rock();
        assertTrue(rock instanceof Rock);
        assertTrue("Rock", true);
    }
}
