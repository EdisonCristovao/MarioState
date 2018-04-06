package com.mario.states;

import com.mario.interf.MarioState;

public class MarioPequeno implements MarioState {

    @Override
    public MarioState comeCogumelo() {
        System.out.println("Mario Comeu Cogumelo e fico grande");
        return new MarioGrande();
    }

    @Override
    public MarioState comeFlor() {
        System.out.println("Mario Comeu Flor e vai solta bolinhas!");
        return new MarioDeFogo();
    }

    @Override
    public MarioState comeEstrela() {
        System.out.println("Mario Comeu Estrela e está IMORRIVELLll!");
        return new MarioComEstrela();
    }

    @Override
    public MarioState comePena() {
        System.out.println("Mario Comeu a Pena e agora pode VOAARRR!");
        return new MarioComPena();
    }

    @Override
    public MarioState tomaDano() {
        System.out.println("Mario Tomou Dano e morreu");
        return new MarioMorto();
    }

    @Override
    public String mostraEstado() {
        return "Mario Esta Pequeno";
    }
}
