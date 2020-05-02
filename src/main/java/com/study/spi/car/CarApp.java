package com.study.spi.car;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CarApp {
    public static void main(String[] args) {
        System.out.println(MyCar.name);
        ServiceLoader<MyCar> serviceLoader = ServiceLoader.load(MyCar.class);
        Iterator<MyCar> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            MyCar myCar = iterator.next();
            System.out.println(myCar.getTopSpeed());
        }
    }
}
