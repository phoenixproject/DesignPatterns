/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.ifes.foobar.motor.factorymethod;

import br.ifes.foobar.motor.model.BoxVan;
import br.ifes.foobar.motor.model.Pickup;
import br.ifes.foobar.motor.model.StandardEngine;
import br.ifes.foobar.motor.model.TurboEngine;
import br.ifes.foobar.motor.model.Vehicle;

public class VanFactory extends VehicleFactory {

    protected Vehicle selectVehicle(DrivingStyle style) {
        if  ((style == DrivingStyle.ECONOMICAL) ||
             (style == DrivingStyle.MIDRANGE))   {
            return new Pickup(new StandardEngine(2200));
        
        } else {
            return new BoxVan(new TurboEngine(2500));
        }
    }
    
}
