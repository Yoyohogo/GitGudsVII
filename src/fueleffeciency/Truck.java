/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

/**
 * Truck subclass
 * @author rodec8600
 */
public class Truck extends Vehicle {

    /**
     * Prints the distance the truck can travel
     * PRE: a fuel amount
     * POST: displays the distance it can travel
     */
    public String getDistance(double fuelAmount) {
        double distance = fuelAmount / 14.1 * 100;
        String output = "Truck:\t" + kilometreage.format(distance);
        return output;
    }
}
