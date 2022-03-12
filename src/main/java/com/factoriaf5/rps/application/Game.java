package com.factoriaf5.rps.application;

public class Game {
    
    public String play(String playerOne, String playerTwo){
        
        if(playerOne == "Rock" && playerTwo == "Scissors" || playerOne == "Scissors" && playerTwo == "Rock"){
            return "Rock wins";
        }

        return "Draw";
    }
}
