package com.factoriaf5.rps.models;

public class Rock {
    
    public String name = "Rock";
    public Boolean wins = true;
    public Boolean losses = true;
    public Boolean draws = true;

    public Rock() {
    }

    public Rock(String name) {
        this.name = name;
    }

    public void winsTo(Boolean wins){
        this.wins = wins;
    }

    public void lossesTo(Boolean losses){
        this.losses = losses;
    }

    public void drawsTo(Boolean draws){
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public Boolean getWins() {
        return wins;
    }

    public Boolean getLosses() {
        return losses;
    }
    
    public Boolean getDraws(){
        return draws;
    }
}
