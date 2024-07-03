package com.devgame.rockapperscissor.models;

import com.devgame.rockapperscissor.interfaces.IOInteraction;

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
