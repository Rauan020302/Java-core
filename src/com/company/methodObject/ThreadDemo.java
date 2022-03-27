package com.company.methodObject;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadInteraction interaction = new ThreadInteraction();

        new Request(interaction);
        new Response(interaction);
    }
}
