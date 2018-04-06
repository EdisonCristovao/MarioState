package com.mario.states;

import com.mario.interf.MarioState;

public class MarioMorto implements MarioState {
    @Override
    public MarioState comeCogumelo() {
        System.out.println("Mario ta morto, como ele comeu, tais tolo ?? ");
        return new MarioMorto();
    }

    @Override
    public MarioState comeFlor() {
        System.out.println("Mario ta morto, como ele comeu, tais tolo ?? ");
        return new MarioMorto();
    }

    @Override
    public MarioState comeEstrela() {
        System.out.println("Mario ta morto, como ele comeu, tais tolo ?? ");
        return new MarioMorto();
    }

    @Override
    public MarioState comePena() {
        System.out.println("Mario ta morto, como ele comeu, tais tolo ?? ");
        return new MarioMorto();
    }

    @Override
    public MarioState tomaDano() {
        System.out.println("Nao basta ta morto, tem que apanha denovo... ");
        return new MarioMorto();
    }

    @Override
    public String mostraEstado() {
        return "Mario morto";
    }
}
