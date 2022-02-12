package com.company;

import java.util.ArrayList;

public class Aviary implements IAviary {

    private double area;
    private boolean water;
    private boolean filling;
    private int count;
    private int id;
    private Biome biome;
    private ArrayList<Animal> animal = new ArrayList<>();

    //public Aviary(){}//пока ненужно

    public Aviary(double area, boolean water,boolean filling,
                  int count, int id, Biome biome){

    this.area = area;
    this.water = water;
    this.filling = filling;
    this.count = count;
    this.id = id;
    this.biome = biome;
    }

    @Override
    public int GetId() {
        return id;
    }

    @Override
    public void SetId(int id) {
        this.id = id;

    }

    @Override
    public double GetArea(){
        return area;
    }
    @Override
    public void SetArea(double area){
        this.area = area;
    }
    @Override
     public boolean GetWater(){
        return water;
     }
    @Override
     public void SetWater(boolean water){
        this.water = water;
     }

    @Override
    public int GetCount() {
        return count;
    }

    @Override
    public void SetCount(int count) {
        this.count = count;
    }

    @Override
    public boolean GetFilling() {
        return filling;
    }

    @Override
    public void SetFilling(boolean filling) {
        this.filling = filling;
    }
    @Override
    public Biome getBiome(){
       return biome;
    }
    @Override
    public void setBiome(Biome biome){
        this.biome = biome;
    }
    @Override
    public void setAnimal(Animal animal){
        //this.animal = animal;
        this.animal.add(animal);//!!ошибка и как мне накопить в этом листе конкретного вольера животинку
        // не понимаю
    }
    @Override
    public ArrayList<Animal> getAnimal(){
        return animal;
    }
}
