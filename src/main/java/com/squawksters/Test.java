package com.squawksters;

import com.birdbrain.Finch;

public class Test{
    public static void main (String[] args){
        Finch bird = new Finch();

        //ADD CODE
        for(int i = 0; i<4; i++){
        bird.setMove("F", 20, 100);
        bird.setBeak(80, 1, 40);
        bird.setTurn("R", 90, 100);
        bird.setBeak(0, 0, 0);
        }



        bird.stop();
        bird.disconnect();
    }
}