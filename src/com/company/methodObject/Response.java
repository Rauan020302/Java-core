package com.company.methodObject;

public class Response implements Runnable{
    ThreadInteraction interaction;
    String[] response =
            {
                    "Aeroflot 1816, Dnipro Radar, go ahead",
                    "Aeroflot 1816, descend to altitude 6,000 feet"
            };

    public Response(ThreadInteraction interaction) {
        this.interaction = interaction;
        new Thread(this, "Response").start();
    }

    @Override
    public void run() {
        for (String s : response) {
            interaction.Response(s);
        }
    }
}
