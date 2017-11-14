package com.gmail.streamsboardgame;

import java.util.Random;

/**
 * Created by USER on 2017-11-14.
 */
/*넘버 타일 변수*/
public class NumberTile {
    /*원래들어가 숫자 타일*/
    final int[] ORIGINAL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

    /*실제 게임에 이용될 숫자 타일*/
    int[] numberTile = new int[40];

    /*게임시 시작되면 타일을 섞어준다.*/
    public void mixTile() {
        int tepm;
        Random random = new Random();
        /*일단 그대로 복사 해준다. */
        for (int i = 0; i < ORIGINAL.length; i++) {
            numberTile[i] = ORIGINAL[i];
        }
        /*섞어준다.*/
        for (int i = 0; i < numberTile.length; i++) {
            int ranIndex;
            ranIndex = random.nextInt(40);
            tepm = numberTile[ranIndex];
            numberTile[ranIndex] = numberTile[i];
            numberTile[i] = tepm;
        }
    }

    public int[] getNumberTile() {
        return numberTile;
    }

    public void setNumberTile(int[] numberTile) {
        this.numberTile = numberTile;
    }
}
