/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

/**
 * Motorcycle subclass
 * @author rodec8600
 */
public class Motorcycle extends Vehicle {

    /**
     * Prints the distance the motorcycle can travel
     * PRE: a fuel amount
     * POST: displays the distance it can travel
     */
    public String getDistance(double fuelAmount) {
        double distance = fuelAmount / 6.3 * 100;
        String output = "Motorcycle:\t" + kilometreage.format(distance);
        return output;
    }
}
