package com.gmail.streamsboardgame;

import java.util.ArrayList;
import java.util.HashMap;


//점수를 판단하는 계산기
public class Score {
    HashMap<Integer,Integer> normalScoreMap;

    public Score() {// 생성자
        //객체 생성과 동시에 점수 기분표를 만들어준다.
        //일반
        normalScoreMap = new HashMap<Integer,Integer>();
        normalScoreMap.put(0,0);
        normalScoreMap.put(1,0);
        normalScoreMap.put(2,1);
        normalScoreMap.put(3,3);
        normalScoreMap.put(4,5);
        normalScoreMap.put(5,7);
        normalScoreMap.put(6,9);
        normalScoreMap.put(7,11);
        normalScoreMap.put(8,15);
        normalScoreMap.put(9,20);
        normalScoreMap.put(10,25);
        normalScoreMap.put(11,30);
        normalScoreMap.put(12,35);
        normalScoreMap.put(13,40);
        normalScoreMap.put(14,50);
        normalScoreMap.put(15,60);
        normalScoreMap.put(16,70);
        normalScoreMap.put(17,85);
        normalScoreMap.put(18,100);
        normalScoreMap.put(19,150);
        normalScoreMap.put(20,300);
        //상급자 : 상급자라면 나중에 파라미터 값을 방아서  4=3 , 12 = 20 , 17= 50  번을 바꿔 줄것
    }


    /*일반 모드 점수 결과*/
    int getNormalScore(Integer[] resultNumber) {
        Integer resultScore = 0;//점수 결과
        int SNum=0;
        for(int i = 1 ;  i<resultNumber.length;i++){
            if(resultNumber[i-1]<resultNumber[i]){
                SNum++;
            }else {
                resultScore =resultScore+ normalScoreMap.get(SNum);
                SNum=0;
            }
        }
        return resultScore;
    }


}
