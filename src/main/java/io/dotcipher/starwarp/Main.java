package io.dotcipher.starwarp;

import io.dotcipher.starwarp.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        System.out.println("But along with great challenge comes great growth");
        Pokemon pokemon = new Pokemon("Greninja", 5);
        System.out.println("Go " + pokemon.getName() + "!");
        System.out.println("Use Water Shuriken!");

        System.out.println("Honor the faith that others have placed upon you");
    }
}