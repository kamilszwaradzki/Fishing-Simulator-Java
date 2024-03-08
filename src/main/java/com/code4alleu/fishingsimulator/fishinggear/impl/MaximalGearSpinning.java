/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear.impl;

import com.code4alleu.fishingsimulator.fishinggear.interfaces.SpinningFishingGearDisplay;
import com.code4alleu.fishingsimulator.locations.BoatFishing;
import com.code4alleu.fishingsimulator.locations.DockFishing;
import com.code4alleu.fishingsimulator.locations.Location;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MaximalGearSpinning implements SpinningFishingGearDisplay {
    @Override
    public void showSpinningGear(Location location) {
        if (location instanceof BoatFishing || location instanceof DockFishing) {
            System.out.println("Wedka: Dragon Guide Select Monster 2,30m 14-42g");
            System.out.println("Kolowrotek: Ryobi Zauber 3000");
        } else {
            System.out.println("Wedka: Okuma Black Rock 2,75m 10-35g");
            System.out.println("Kolowrotek: Okuma Ceratate 3000");
        }
        System.out.println("Zylka: Elite Pike 0,35mm 150m");
    }
}
