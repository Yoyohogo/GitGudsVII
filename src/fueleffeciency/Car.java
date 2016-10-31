/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

/**
 * Car subclass
 * @author rodec8600
 */
public class Car extends Vehicle {

    /**
     * Prints the distance the car can travel
     * PRE: a fuel amount
     * POST: displays the distance it can travel
     */
    public String getDistance(double fuelAmount) {
        double distance = fuelAmount / 9.4 * 100;
        String output = "Car:\t" + kilometreage.format(distance);
        return output;
    }
}
