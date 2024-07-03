/*
package org.games;

import org.games.interfaceImpl.SinglePlayerGame;
import org.games.models.Game;
import org.games.models.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.Arrays;

public class GameTest {
    private Game game;
    private Player player1;
    private Player player2;

    @BeforeEach
    void setUp() {
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new SinglePlayerGame(Arrays.asList(player1, player2));
    }

    @Test
    void testGetWinner_RockBeatsScissors() {
        when(player1.getChoice()).thenReturn(new Rock());
        when(player2.getChoice()).thenReturn(new Scissor());
        Player winner = game.getWinner();
        Assertions.assertEquals(player1, winner);
    }

    @Test
    void testGetWinner_PaperBeatsRock() {
        when(player1.getChoice()).thenReturn(new Paper());
        when(player2.getChoice()).thenReturn(new Rock());
        Player winner = game.getWinner();
        Assertions.assertEquals(player1, winner);
    }

    @Test
    void testGetWinner_ScissorBeatsPaper() throws Exception {
        when(player1.getChoice()).thenReturn(new Paper());
        when(player2.getChoice()).thenReturn(new Scissor());
        Player winner = game.getWinner();
        Assertions.assertEquals(player2, winner);
    }


    //todo:: [imp] explore overiding of exception and access modifier
    @Test
    void testGetWinner_Tie() {
        when(player1.getChoice()).thenReturn(new Paper());
        when(player2.getChoice()).thenReturn(new Paper());
        Player winner = game.getWinner();
        Assertions.assertNull(winner);

        when(player1.getChoice()).thenReturn(new Rock());
        when(player2.getChoice()).thenReturn(new Rock());
        winner = game.getWinner();
        Assertions.assertNull(winner);

        when(player1.getChoice()).thenReturn(new Scissor());
        when(player2.getChoice()).thenReturn(new Scissor());
        winner = game.getWinner();
        Assertions.assertNull(winner);
    }
}
*/
