package com.mario;

import com.mario.interf.MarioState;
import com.mario.model.Mario;
import com.mario.states.MarioPequeno;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.comeCogumelo();
        mario.tomaDano();
        mario.comeFlor();
        mario.comeFlor();
        mario.tomaDano();
        mario.tomaDano();
        mario.tomaDano();
        mario.comeFlor();
        mario.tomaDano();

    }
}
