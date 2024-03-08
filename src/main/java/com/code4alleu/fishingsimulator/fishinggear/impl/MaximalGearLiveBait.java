/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear.impl;

import com.code4alleu.fishingsimulator.fishinggear.interfaces.LiveBaitFishingGearDisplay;
import com.code4alleu.fishingsimulator.locations.BoatFishing;
import com.code4alleu.fishingsimulator.locations.DockFishing;
import com.code4alleu.fishingsimulator.locations.Location;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MaximalGearLiveBait implements LiveBaitFishingGearDisplay {
    @Override
    public void showLiveBaitGear(Location location) {
        if (location instanceof BoatFishing || location instanceof DockFishing) {
            System.out.println("Wedka: DAIWA WINDCAST FEEDER 390/120G");
        } else {
            System.out.println("Wedka: Jaxon Monolith XT Tele Carp (3,50 lbs)");
        }
        System.out.println("Kolowrotek: Okuma Trio Rex DSS-10-63-760");
        System.out.println("Zylka: Elite Pike 0,35mm 150m");
        System.out.println("Haczyki: Sensual Double seria HS11040 Mikado");
    }
}
