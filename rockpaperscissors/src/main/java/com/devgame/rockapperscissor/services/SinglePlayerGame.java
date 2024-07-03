package com.devgame.rockapperscissor.services;

import com.devgame.rockapperscissor.constants.AppConstants;
import com.devgame.rockapperscissor.exceptions.InvalidChoiceException;
import com.devgame.rockapperscissor.interfaces.Choice;
import com.devgame.rockapperscissor.models.Game;
import com.devgame.rockapperscissor.models.Player;
import com.devgame.rockapperscissor.interfaces.IOInteraction;

import java.util.List;

public class SinglePlayerGame extends Game {

    private IOInteraction ioInteraction;

    public SinglePlayerGame(List<Player> players, IOInteraction ioInteraction) {
        super(players);
        this.ioInteraction = ioInteraction;
    }

    @Override
    public String getWinner() {
        // two players since it is Single Player game is designed for 2 players
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        int counterOfRetry = 0;
        while (AppConstants.CHOICE_RETRY > counterOfRetry) {
            try {
                player1.makeChoice();
                player2.makeChoice();
                break;
            } catch (InvalidChoiceException invalidExe) {
                this.ioInteraction.print(String.format(invalidExe.getMessage()));
            } catch (Exception e) {
                this.ioInteraction.print(e.getMessage());
            }
            counterOfRetry++;
        }

        if (counterOfRetry >= AppConstants.CHOICE_RETRY) {
            throw new RuntimeException("Maximum retry limit is exceed for selecting incorrect choice value. Please restart game.");
        }

        //todo:: change entire logic
        Choice player1Choice = player1.getChoice();
        Choice player2Choice = player2.getChoice();

        if (player1Choice == player2Choice) {
            return "it is a tie."; //means tie
        } else if (player1Choice.canBeat().contains(player2Choice.getClass())) {
            return player1.getName();
        } else {
            return player2.getName();
        }

    }
}
