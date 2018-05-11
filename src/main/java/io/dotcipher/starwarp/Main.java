package io.dotcipher.starwarp;

import pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        System.out.println("But along with great challenge comes great growth");
        Pokemon pokemon = new Pokemon("Greninja", 5);
        System.out.println("Go " + pokemon.getName() + "!");
        System.out.println("Use Water Shuriken!");
    }
}