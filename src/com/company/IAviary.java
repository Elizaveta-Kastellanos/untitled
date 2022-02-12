package com.company;

import java.util.ArrayList;
import java.util.List;

public interface IAviary {
    public int GetId();
    public void SetId(int id);
    public double GetArea();
    public void SetArea(double area);
    public boolean GetWater();
    public void SetWater(boolean water);
    public int GetCount();
    public void SetCount(int count);
    public boolean GetFilling();
    public void SetFilling(boolean filling);
    public Biome getBiome();
    public void setBiome(Biome biome);
    public ArrayList<Animal> getAnimal();
    public void setAnimal(ArrayList<Animal> animal);
}
