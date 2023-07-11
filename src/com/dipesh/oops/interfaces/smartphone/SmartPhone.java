package com.dipesh.oops.interfaces.smartphone;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    @Override
    public void capture() {
        System.out.println("We can click photos");
    }

    @Override
    public void record() {
        System.out.println("We can record videos");
    }

    @Override
    public void play() {
        System.out.println("Music played");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}
