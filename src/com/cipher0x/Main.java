package com.cipher0x;

import javax.swing.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        int interruptMinutes = 1;
        final MakeSound speakers = new MakeSound();
        final String bellSoundFile = "/home/eric/Downloads/bell-ringing-05.wav";

        while (true) {
            Thread.sleep (interruptMinutes*60*1000);

            Thread playSoundThread = new Thread () {
                public void run () {
                    speakers.playSound(bellSoundFile);
                }
            };

            playSoundThread.start();
            JOptionPane.showMessageDialog(null, "Get up and Stretch !!!");
        }
    }
}

