package com.devgame.rockapperscissor.game;

import com.devgame.rockapperscissor.io.IOInteraction;
import com.devgame.rockapperscissor.game.player.Player;

import java.util.List;

public abstract class Game {

    protected List<Player> players;
    protected IOInteraction ioInteraction;
    public Game(List<Player> players) {
        this.players = players;
    }

    public Game(List<Player> players, IOInteraction ioInteraction) {
        this.players = players;
        this.ioInteraction = ioInteraction;
    }

    public abstract String getWinner();
}
