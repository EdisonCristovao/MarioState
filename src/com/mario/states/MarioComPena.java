package com.mario.states;

import com.mario.interf.MarioState;

public class MarioComPena implements MarioState {
    @Override
    public MarioState comeCogumelo() {
        System.out.println("Mario Comeu Cogumelo e perdeu a peninha");
        return new MarioGrande();
    }

    @Override
    public MarioState comeFlor() {
        System.out.println("Mario Comeu Flor e perdeu a peninha!");
        return new MarioDeFogo();
    }

    @Override
    public MarioState comeEstrela() {
        System.out.println("Mario Comeu Estrela e está IMORRIVELLll!");
        return new MarioComEstrela();
    }

    @Override
    public MarioState comePena() {
        System.out.println("Mario Comeu a Pena e agora tem 2 peninha !");
        return new MarioComPena();
    }

    @Override
    public MarioState tomaDano() {
        System.out.println("Mario Tomou Dano!");
        return new MarioGrande();
    }

    @Override
    public String mostraEstado() {
        return "Mario Com Peninha";
    }
}
