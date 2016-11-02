/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

/**
 * To determine distance of car
 * 31/10/2016
 * @author rodec8600
 */
public class FuelEffeciency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creates objects for vehicles
        Truck ainsley = new Truck();
        System.out.println(ainsley.getDistance(50));
        Car spicyMeat = new Car();
        System.out.println(spicyMeat.getDistance(50));
        HybridCar p45 = new HybridCar();
        System.out.println(p45.getDistance(50));
        Motorcycle nicolasCage = new Motorcycle();
        System.out.println(nicolasCage.getDistance(50));
    }

}
