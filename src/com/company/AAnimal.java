package com.company;

public abstract class AAnimal {
    int id;
    private String title;
    private Biome biome;
    private boolean water;
    private double square;
    private String food;
    private TypeAnimal typeAnimal;
public AAnimal(int id,String title, Biome biome, boolean water,
               double square,String food, TypeAnimal typeAnimal){
    this.id = id;
    this.title = title;
    this.biome = biome;
    this.water = water;
    this.square = square;
    this.food = food;
    this.typeAnimal = typeAnimal;
}




public String getTitle(){
    return title;
}
public void setTitle(String title){
    this.title = title;
}
public Biome getBiome(){
    return biome;
}
public void setBiome(Biome biome){
    this.biome = biome;
}
public boolean getWater(){
    return water;
}
public void setWater(boolean water){
    this.water = water;
}
public double getSquare(){
    return square;
}

    public void setSquare(double square) {
        this.square = square;
    }
    public String getFood(){
    return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public TypeAnimal getTypeAnimal(){
    return typeAnimal;
    }
    public void setTypeAnimal(TypeAnimal typeAnimal){
    this.typeAnimal = typeAnimal;
    }
}
