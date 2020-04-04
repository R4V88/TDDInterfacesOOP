package model;

import api.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Jadę rowerem, wiec musze pedałować");
    }

    @Override
    public void stop() {
        System.out.println("Hamuję rowerem, muszę używać hamulca tylnego, który jest przy mojej prawej dłoni.");
    }
}
