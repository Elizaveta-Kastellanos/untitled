package com.company;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animal = new ArrayList<>();
    private ArrayList<Aviary> aviary = new ArrayList<>();
    public ArrayList<Animal> AddAndGiveMeAnimalsList(Animal animal){
        this.animal.add(animal);
        return this.animal;
    }
    public ArrayList<Aviary> AddAndGiveMeAviaryList(Aviary aviary){
        this.aviary.add(aviary);
        return this.aviary;
    }
    public void InfoAviary(){
        AviaryProcessor ap = new AviaryProcessor();
        ap.InfoAviary();

    }

}
