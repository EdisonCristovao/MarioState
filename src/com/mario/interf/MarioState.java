package com.mario.interf;

public interface MarioState {

    public MarioState comeCogumelo();
    public MarioState comeFlor();
    public MarioState comeEstrela();
    public MarioState comePena();
    public MarioState tomaDano();

    public String mostraEstado();
}
