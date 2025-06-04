package com.squawksters;

import com.birdbrain.Finch;

public class TwinkleBird extends Finch {
    public void playNoteAndPause(int note, double beats) {
        playNote(note, beats);
        pause(beats + 0.1);
    }
}
