package com.mario.model;

import com.mario.interf.MarioState;
import com.mario.states.MarioGrande;
import com.mario.states.MarioPequeno;

public class Mario {
    protected MarioState estado;

    public Mario() {
        this.estado = new MarioPequeno();
    }

    public void comeCogumelo() {
        estado = estado.comeCogumelo();
        mostraEstado();
    }

    public void comeFlor() {
        estado = estado.comeFlor();
        mostraEstado();
    }

    public void comeEstrela() {
        estado = estado.comeEstrela();
        mostraEstado();
    }

    public void comPena() {
        estado = estado.comePena();
        mostraEstado();
    }

    public void tomaDano() {
        estado = estado.tomaDano();
        mostraEstado();
    }

    public void mostraEstado() {
        System.out.println(estado.mostraEstado());
    }
}
