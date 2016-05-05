package com.derek.banas.patterns.abstractfactory.ex1.impl.boss;

// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

import com.derek.banas.patterns.abstractfactory.ex1.ESEngine;
import com.derek.banas.patterns.abstractfactory.ex1.ESWeapon;
import com.derek.banas.patterns.abstractfactory.ex1.EnemyShipFactory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship

    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }

    // Defines the engine object to associate with the ship

    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO
    }

}
