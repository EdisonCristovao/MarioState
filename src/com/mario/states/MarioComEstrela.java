package com.mario.states;

import com.mario.interf.MarioState;

public class MarioComEstrela implements MarioState {
    @Override
    public MarioState comeCogumelo() {
        System.out.println("Mario Comeu Cogumelo e vai fica Grande!");
        return new MarioGrande();
    }

    @Override
    public MarioState comeFlor() {
        System.out.println("Mario Comeu Flor e vai solta bolinhas!");
        return new MarioDeFogo();
    }

    @Override
    public MarioState comeEstrela() {
        System.out.println("Mario Comeu Estrela e está MAIS IMORRIVELLll AINDA!");
        return new MarioComEstrela();
    }

    @Override
    public MarioState comePena() {
        System.out.println("Mario Comeu a Pena e agora pode VOAARRR!");
        return new MarioComPena();
    }

    @Override
    public MarioState tomaDano() {
        System.out.println("Mario nao toma dano FIooooo");
        return new MarioComEstrela();
    }

    @Override
    public String mostraEstado() {
        return "Mario Com Estrela";
    }
}
