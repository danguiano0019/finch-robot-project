package com.squawksters;

import com.birdbrain.Finch;

public class Test{
    public static void main (String[] args){
        // Finch bird = new Finch();
        TwinkleBird bird = new TwinkleBird();


 //C

bird.playNoteAndPause(60, 0.5);
bird.playNoteAndPause(60, 0.5);
//G
bird.playNoteAndPause(67, 0.5);
bird.playNoteAndPause(67, 0.5);
//A
bird.playNoteAndPause(69, 0.5);
bird.playNoteAndPause(69, 0.5);
//G
bird.playNoteAndPause(67, 0.7);
//F
bird.playNoteAndPause(65, 0.5);
bird.playNoteAndPause(65, 0.5);
// E
bird.playNoteAndPause(64, 0.5);
bird.playNoteAndPause(64, 0.5);
//D
bird.playNoteAndPause(62, 0.5);
bird.playNoteAndPause(62, 0.5);
//C
bird.playNoteAndPause(60, 0.7);
//G
bird.playNoteAndPause(67, 0.5);
bird.playNoteAndPause(67, 0.5);
// F
bird.playNoteAndPause(65, 0.5);
bird.playNoteAndPause(65, 0.5);
// E
bird.playNoteAndPause(64, 0.5);
bird.playNoteAndPause(64, 0.5);
//D
bird.playNoteAndPause(62, 0.7);
//G
bird.playNoteAndPause(67, 0.5);
bird.playNoteAndPause(67, 0.5);
//F
bird.playNoteAndPause(65, 0.5);
bird.playNoteAndPause(65, 0.5);
//E
bird.playNoteAndPause(64, 0.5);
bird.playNoteAndPause(64, 0.5);
//D
bird.playNoteAndPause(62, 0.7);
//C
bird.playNoteAndPause(60, 0.5);
bird.playNoteAndPause(60, 0.5);
//G 
bird.playNoteAndPause(67, 0.5);
bird.playNoteAndPause(67, 0.5);
//A
bird.playNoteAndPause(69, 0.5);
bird.playNoteAndPause(69, 0.5);
//G
bird.playNoteAndPause(67, 0.7);
//F
bird.playNoteAndPause(65, 0.5);
bird.playNoteAndPause(65, 0.5);
//E
bird.playNoteAndPause(64, 0.5);
bird.playNoteAndPause(64, 0.5);
//D
bird.playNoteAndPause(62, 0.5);
bird.playNoteAndPause(62, 0.5);
//C
bird.playNoteAndPause(60, 0.7);

        for(int i = 0; i<4; i++){
        bird.setMove("F", 20, 100);
        bird.setBeak(80, 1, 40);
        bird.setTurn("R", 90, 100);
        bird.setBeak(0, 0, 0);
        }

        for(int i = 0; i<4; i++){
            bird.setTurn("R", 60, 100);
            bird.setBeak(80, 1, 40);
            bird.setMove("F", 15, 100);
            bird.setBeak(0, 0, 20);
            bird.setTurn("L", 120, 100);
            bird.setBeak(0, 10, 0);
            bird.setMove("F", 15, 100);
            bird.setBeak(5, 0, 10);
            bird.setTurn("R", 60, 100);
            }

            bird.print("SQUAWKSTERS");

        bird.stop();
        bird.disconnect();
    }
}