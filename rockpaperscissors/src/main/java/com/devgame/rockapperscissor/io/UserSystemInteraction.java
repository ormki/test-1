package com.devgame.rockapperscissor.io;

import com.devgame.rockapperscissor.io.IOInteraction;

import java.util.Scanner;

public class UserSystemInteraction implements IOInteraction {
    @Override
    public void printHeadingUnderline(String input) {
        System.out.println("-------------------------------------------------");
        System.out.println(input);
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void print(String input) {
        System.out.println(input);
    }

    @Override
    public void printNewLine() {
        System.out.println();
    }

    @Override
    public String getUserInput() {
        return new Scanner(System.in).next().toUpperCase();
    }
}
