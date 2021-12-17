package com.minaryanshofa.costumlistview;

public class hero {
    int image;
    String name, team;
    public hero(int image, String name, String team) {
        this.image = image;
        this.name = name;
        this.team = team;
    }
    public int getImage() {
        return image;
    }
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
}
