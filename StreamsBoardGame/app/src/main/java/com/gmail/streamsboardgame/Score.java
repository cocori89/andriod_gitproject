package com.gmail.streamsboardgame;

import java.util.ArrayList;


//점수를 판단하는 계산기
public class Score {
    ArrayList<Integer> normalScoreList;

    public Score() {// 생성자
        //객체 생성과 동시에 점수 기분표를 만들어준다.
        //일반
        normalScoreList = new ArrayList<Integer>();
        normalScoreList.add(1,0);
        normalScoreList.add(2,1);
        normalScoreList.add(3,3);
        normalScoreList.add(4,5);
        normalScoreList.add(5,7);
        normalScoreList.add(6,9);
        normalScoreList.add(7,11);
        normalScoreList.add(8,15);
        normalScoreList.add(9,20);
        normalScoreList.add(10,25);
        normalScoreList.add(11,30);
        normalScoreList.add(12,35);
        normalScoreList.add(13,40);
        normalScoreList.add(14,50);
        normalScoreList.add(15,60);
        normalScoreList.add(16,70);
        normalScoreList.add(17,85);
        normalScoreList.add(18,100);
        normalScoreList.add(19,150);
        normalScoreList.add(20,300);
        //상급자 : 상급자라면 나중에 파라미터 값을 방아서  4=3 , 12 = 20 , 17= 50  번을 바꿔 줄것
    }


    /*일반 모드 점수 결과*/
    int getNormalScore() {
        int resultScore = 0;//점수 결과


        return resultScore;
    }


}
