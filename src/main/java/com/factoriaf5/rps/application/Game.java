package com.factoriaf5.rps.application;

public class Game {
    
    public String play(String playerOne, String playerTwo){

        String winner = this.checkWinner(playerOne, playerTwo);

        return winner;
    }
    
    public String checkWinner(String objectOne, String objectTwo){
        
        if(objectOne == "Rock" && objectTwo == "Scissors" || objectOne == "Scissors" && objectTwo == "Rock"){
            return "Rock wins";
        }

        if(objectOne == "Scissors" && objectTwo == "Paper" || objectOne == "Paper" && objectTwo == "Scissors"){
            return "Scissors wins";
        }
        
        if(objectOne == "Paper" && objectTwo == "Rock" || objectOne == "Rock" && objectTwo == "Paper"){
            return "Paper wins";
        }

        return "Draw";
    }
}
