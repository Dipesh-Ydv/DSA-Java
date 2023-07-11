package com.dipesh.oops.interfaces.smartphone;

public class Main {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.call();
        samsung.sms();
        samsung.capture();
        samsung.record();
        samsung.play();
        samsung.pause();
        samsung.stop();

        // We can use references of the interfaces to the object that implements that interface
        Phone p = samsung;
        p.call();
        p.sms();
        ICamera c = samsung;
        c.capture();
        c.record();
    }
}
