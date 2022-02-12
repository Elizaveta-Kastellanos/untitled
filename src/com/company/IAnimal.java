package com.company;

public interface IAnimal {
    public int GetId();
    public void SetId(int id);
    public String GetName();
    public void SetName(String name);
    public String GetEat();
    public void SetEat(String eat);
    public TypeAnimal GetTypeAnimal();
    public void SetTypeAnimal(TypeAnimal typeAnimal);
    public boolean GetWater();
    public void SetWater(boolean water);
    public double GetTemperature();
    public void SetTemperature(double temperature);
    public double GetArea();
    public void SetArea(double area);
    public double GetHumidity();
    public void SetHumidity(double humidity);

}