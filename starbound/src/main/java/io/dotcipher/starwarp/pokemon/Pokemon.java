package io.dotcipher.starwarp.pokemon;

public class Pokemon {
    protected String name;
    protected final int id;

    public Pokemon( String s, int id){
        name = s;
        this.id = id;
    }

    public String getName(){
        return name;
    }

}
