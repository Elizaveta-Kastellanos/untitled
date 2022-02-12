package com.company;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class AnimalProcessor {
    public void CreateAnimal(int id,String title, Biome biome, boolean water, double square, String food,
                          TypeAnimal typeAnimal, String name, double countFood){
        Animal animal = new Animal(id, title,biome,water,square,food,typeAnimal,name,countFood);
        try{
            System.out.println("Животное успешно созданно");
        }
        catch(Exception ex) {
            throw new ArithmeticException("Животное создать не удалось(");
        }
    }
}
