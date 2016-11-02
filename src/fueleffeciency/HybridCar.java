/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

/**
 * Hybrid car subclass
 * @author rodec8600
 */
public class HybridCar extends Vehicle {

    /**
     * Prints the distance the hybrid car can travel
     * PRE: a fuel amount
     * POST: displays the distance it can travel
     */
    public String getDistance(double fuelAmount) {
        double distance = fuelAmount / 3.8 * 100;
        String output = "Hybrid Car:\t" + kilometreage.format(distance);
        return output;
    }
}
