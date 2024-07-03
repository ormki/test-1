package com.devgame.rockapperscissor.game.choice;

import java.util.Set;

public interface Choice {

    //todo:: change to enum choictype [imp] understand enum means
    Set<Class<? extends Choice>> canBeat();
}
