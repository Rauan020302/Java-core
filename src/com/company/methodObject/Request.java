package com.company.methodObject;

public class Request implements Runnable{
    ThreadInteraction interaction;
    String[] request = {
            "Dnipro Radar, Aeroflot 1816",
            "Request descent, Aeroflot 1816",
            "Descending to altitude 6,000 feet"
    };

    public Request(ThreadInteraction interaction) {
        this.interaction = interaction;
        new Thread(this,"Request").start();
    }

    @Override
    public void run() {
        for (String s : request) {
            interaction.Request(s);

        }
    }
}
