package com.company;

public class User {
    String name;
    int live = 100;
    int score;
    int waffe;

    public int userGotHit (int hit) {
        this.live -= hit;
        return this.live;
    }
}
