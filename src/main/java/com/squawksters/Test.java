package com.squawksters;

import com.birdbrain.Finch;

public class Test{
    public static void main (String[] args){
        Finch bird = new Finch();

        //ADD CODE
        for(int i = 0; i<4; i++){
            bird.playSong();
        bird.setMove("F", 20, 100);
        bird.setBeak(80, 1, 40);
        bird.setTurn("R", 90, 100);
        bird.setBeak(0, 0, 0);
        }

public void playSong(){
        //c
            bird.playNote(60, 0.5);
            bird.pause(0.45);
            bird.playNote(60, 0.5);
            bird.pause(0.45);
            //G
            bird.playNote(67, 0.5);
            bird.pause(0.45);
            bird.playNote(67, 0.5);
            bird.pause(0.5);
            //A
            bird.playNote(69, 0.5);
            bird.pause(0.45);
            bird.playNote(69, 0.5);
            bird.pause(0.5);
            //G
            bird.playNote(67, 0.5);
            bird.pause(0.8);
            //F
            bird.playNote(65, 0.5);
            bird.pause(0.45);
            bird.playNote(65, 0.5);
            bird.pause(0.5);
            //E
            bird.playNote(64, 0.5);
            bird.pause(0.45);
            bird.playNote(64, 0.5);
            bird.pause(0.5);
            //D
            bird.playNote(62, 0.5);
            bird.pause(0.45);
            bird.playNote(62, 0.5);
            bird.pause(0.5);
            //C
            bird.playNote(60, 0.5);
            bird.pause(0.6);
            //G
            bird.playNote(67, 0.5);
            bird.pause(0.45);
            bird.playNote(67, 0.5);
            bird.pause(0.5);
            //F
            bird.playNote(65, 0.5);
            bird.pause(0.45);
            bird.playNote(65, 0.5);
            bird.pause(0.5);
            //E
            bird.playNote(64, 0.5);
            bird.pause(0.45);
            bird.playNote(64, 0.5);
            bird.pause(0.5);
            //D
            bird.playNote(62, 0.5);
            bird.pause(0.8);
            //G
            bird.playNote(67, 0.5);
            bird.pause(0.45);
            bird.playNote(67, 0.5);
            bird.pause(0.5);
            //F
            bird.playNote(65, 0.5);
            bird.pause(0.45);
            bird.playNote(65, 0.5);
            bird.pause(0.5);
            //E
            bird.playNote(64, 0.5);
            bird.pause(0.45);
            bird.playNote(64, 0.5);
            bird.pause(0.5);
            //D
            bird.playNote(62, 0.5);
            bird.pause(0.6);
            //C
            bird.playNote(60, 0.5);
            bird.pause(0.45);
            bird.playNote(60, 0.5);
            bird.pause(0.5);
            //G
            bird.playNote(67, 0.5);
            bird.pause(0.45); 
            bird.playNote(67, 0.5);
            bird.pause(0.5);
            //A
            bird.playNote(69, 0.5);
            bird.pause(0.45); 
            bird.playNote(69, 0.5);
            bird.pause(0.5);
            //G
            bird.playNote(67, 0.5);
            bird.pause(0.7); 
            //F
            bird.playNote(65, 0.5);
            bird.pause(0.45); 
            bird.playNote(65, 0.5);
            bird.pause(0.5);
            //E
            bird.playNote(64, 0.5);
            bird.pause(0.45); 
            bird.playNote(64, 0.5);
            bird.pause(0.5);
            //D
            bird.playNote(62, 0.5);
            bird.pause(0.45); 
            bird.playNote(62, 0.5);
            bird.pause(0.5);
            //C
            bird.playNote(60, 0.5);
            bird.pause(0.45); 
}

        



        bird.stop();
        bird.disconnect();
    }
}