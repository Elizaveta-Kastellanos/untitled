package com.company;

import java.util.ArrayList;
import java.util.List;

public class AviaryProcessor {
    private int count = 0;
    private ArrayList animal = new ArrayList<Animal>();
    public void CreateAviary( double area, boolean water,boolean filling,
                          int count, int id,Biome biome){
        Aviary aviary = new Aviary(area, water,filling,count,id,biome);
        try{
            System.out.println("Вольер успешно создан");
        }
        catch(Exception ex){
            throw new ArithmeticException("Вольер создать не удалось");
        }
    }
    public void ConditionCheck(Animal animal, Aviary aviary) { //проверка условий
        //либо работать здесь и создать приватный лист , где и буду накапливать, либо создавать репозиторий
        if(animal.getBiome() == aviary.getBiome() && animal.getWater() == aviary.GetWater()){
            System.out.println("Животное успешно помещено в вольер");
            TypeAnimal type0 = TypeAnimal.Predator;
            TypeAnimal type1 = TypeAnimal.Herbivore;
            if(count > 1 && count <= 5 && animal.getTypeAnimal() == type0 || animal.getTypeAnimal() == type1){
                System.out.println("Животное успешно добавлено в вольер");
            }
            else
                System.out.println("Животное не возможно подселить");
        }


    }
    public void AddAnimalInAviary(Animal animal,Aviary aviary){
        //добавление животного в вольер - filling заполнение, count
        //count - колличество животных
        //я бы сделала этот метод виртуальным
        // и возвращала бы там где мне это нужно от сюда все - может кортежем или через ref
        //хотя , я сделаю ниже info и там верну то что мне нужно
        ConditionCheck(animal,aviary);
        List<Animal> animals = new ArrayList<>();
        this.animal.add(animal);
        if(animals.add(animal)){
            aviary.SetFilling(true);
            count++;

        }
    }

    public void InfoAviary(){
        System.out.println("Колличество животных в вольере " + count);
    }
}
