/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueleffeciency;

import java.text.DecimalFormat;

/**
 * Abstract vehicle superclass!
 * @author rodec8600
 */
public abstract class Vehicle {

    //creates the kilometreage decimal format
    DecimalFormat kilometreage = new DecimalFormat("##.00 km");

    //abstract method for displaying distance
    public abstract String getDistance(double fuelAmount);
}
