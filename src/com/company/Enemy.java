package com.company;

public class Enemy {
    int live = 100;
    boolean gegnerlebt;


    public int enemyGotHit (int hit) {
        this.live -= hit;
        return this.live;
    }
}
