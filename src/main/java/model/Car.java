package model;

import api.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Jadę samochodem, więc dodaję gazu i się nie męczę!");
    }

    @Override
    public void stop() {
        System.out.println("Hamuję samochodem naciskając środkowy pedał!");
    }
}
