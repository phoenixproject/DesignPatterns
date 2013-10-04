/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.ifes.foobar.motor.decorator;

public class SatNavVehicle extends AbstractVehicleOption {
    
    public SatNavVehicle(Vehicle vehicle) {
        super(vehicle);
    }
    
    public int getPrice() {
        return decoratedVehicle.getPrice() + 1500;
    }
    
    public void setDestination(String destination) {
        // code to set the destination...
    }
    
}
