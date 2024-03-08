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
public class MinimalGearSpinning implements SpinningFishingGearDisplay {
    @Override
    public void showSpinningGear(Location location) {
        if (location instanceof BoatFishing || location instanceof DockFishing) {
            System.out.println("Wedka: Shimano Vengeance 240 MH 15-40g");
            System.out.println("Kolowrotek: Dragon Express RD540i");
        } else {
            System.out.println("Wedka: Shimano Vengeance 270 M 10-30g");
            System.out.println("Kolowrotek: Dragon Elite Pro FD540i");
        }
        System.out.println("Zylka: Elite Pike 0,35mm 150m");
    }
}
