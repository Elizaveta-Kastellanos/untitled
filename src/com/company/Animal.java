package com.company;

public class Animal extends AAnimal{
    String name;
    double countFood;
    public Animal(int id,String title, Biome biome, boolean water, double square, String food,
                  TypeAnimal typeAnimal, String name, double countFood) {
        super(id,title, biome, water, square, food, typeAnimal);
        this.name = name;
        this.countFood = countFood;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCountFood(){
        return countFood;
    }
    public void setCountFood(double countFood){
        this.countFood = countFood;
    }
}
