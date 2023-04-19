package main.car;

public class Bmw extends Car{

    @Override
    public String accelerator() {
        return "Bmw accelerator";
    }

    @Override
    public String brake() {
        return "Bmw brake";
    }

    @Override
    public String clutch() {
        return "Bmw clutch";
    }
}
