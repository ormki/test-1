package com.devgame.rockapperscissor;

import com.devgame.rockapperscissor.constant.AppConstants;
import com.devgame.rockapperscissor.io.UserSystemInteraction;
import com.devgame.rockapperscissor.game.SinglePlayerGame;
import com.devgame.rockapperscissor.player.Computer;
import com.devgame.rockapperscissor.player.Human;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args)  {
        UserSystemInteraction printIO = new UserSystemInteraction();
        int nTimes = 0;
        int counter = 0;
        while (AppConstants.GAME_RETRY > counter) {
            try {
                printIO.printHeadingUnderline("Enter how many times you want play games!");
                nTimes = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                printIO.print(String.format("Input is incorrect, please pass a number above zero.", nTimes));
            }
            counter++;
        }

        if (counter >= AppConstants.GAME_RETRY) {
            printIO.printNewLine();
            printIO.printHeadingUnderline("Number of retry crosses maximum limit. Please start game after sometime.");
            return;
        }

        SinglePlayerGame game = new SinglePlayerGame(List.of(new Human("Man", printIO) , new Computer("System", printIO)), printIO);
        try {
            for (int i = 0; i < nTimes; i++) {
                printIO.print(String.format("The winner is %s", game.getWinner()));
                printIO.printNewLine();
            }
            printIO.printHeadingUnderline("Game is over.");
        } catch (RuntimeException e) {
            printIO.printHeadingUnderline(e.getMessage());
        }
    }

}