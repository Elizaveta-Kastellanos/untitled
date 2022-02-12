package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "Лев";
        String eat = "Мясо";
        TypeAnimal type = TypeAnimal.Predator;
        boolean water = true;
        double area = 200.1;
        double humidity = 65;
        double temperature = 25;
        int id = 1;
        //Animal Lion = new Animal(name,eat,type,water,area,temperature, humidity,id );
        AnimalProcessor ap = new AnimalProcessor();
        ap.AddAnimal(name,eat,type,water,area,temperature, humidity,id );
        System.out.println("Введите название животного:");
        Scanner name1 = new Scanner(System.in);
       String nameAnimal = name1.next();
        System.out.println("Введите чем кормить животное:");
        Scanner eat1 = new Scanner(System.in);
        String eatAnimal = eat1.next();
        System.out.println("Введите тип животного из представленных:" + TypeAnimal.Predator + "или" + TypeAnimal.Herbivore);
        Scanner type1 = new Scanner(System.in);
        //TypeAnimal typeAnimal = (TypeAnimal)type1.next();




    }
}
