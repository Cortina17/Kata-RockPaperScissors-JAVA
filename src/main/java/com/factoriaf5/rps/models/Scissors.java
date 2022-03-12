package com.factoriaf5.rps.models;

public class Scissors {
    
    private String name = "Scissors";
    private Boolean wins = true;
    private Boolean losses = true;
    private Boolean draws = true;

    public Scissors() {
    }

    public Scissors(String name) {
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
