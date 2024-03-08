/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear.impl;

import com.code4alleu.fishingsimulator.fish.CommonCarp;
import com.code4alleu.fishingsimulator.fish.Fish;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.FloatFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.GroundFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.LiveBaitFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.SpinningFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.fishingmethods.FloatFishing;
import com.code4alleu.fishingsimulator.fishingmethods.GroundFishing;
import com.code4alleu.fishingsimulator.fishingmethods.LiveBaitFishing;
import com.code4alleu.fishingsimulator.fishingmethods.SpinningFishing;
import com.code4alleu.fishingsimulator.locations.BoatFishing;
import com.code4alleu.fishingsimulator.locations.DockFishing;
import com.code4alleu.fishingsimulator.locations.Location;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MaximalGearFloat implements FloatFishingGearDisplay {
    @Override
    public void showFloatGear(Location location, Fish fish) {
        if (fish instanceof CommonCarp) {
            if (location instanceof BoatFishing ||
                location instanceof DockFishing) {
                System.out.println("Wedka: DAIWA WINDCAST FEEDER 390/120G");
            } else {
                System.out.println("Wedka: Jaxon Monolith XT Tele Carp (3,50 lbs)");
            }
            System.out.println("Kolowrotek: Okuma Trio Rex DSS-10-63-760");
            System.out.println("Zylka: K-Karp Sinking Plus 198-16-350");
            System.out.println("Haczyki: K-Karp Haczyki TF 6");
        } else {
            if (location instanceof BoatFishing ||
                location instanceof DockFishing) {
                System.out.println("Wedka: KONGER IMPACT FEEDER 390/150");
            } else {
                System.out.println("Wedka: KONGER IMPACT TELE FEEDER 390/80");
            }
            System.out.println("Kolowrotek: Okuma Axeon V2 60");
            System.out.println("Zylka: Mikado Sensei Feeder 150m 0.30 mm");
            System.out.println("Haczyki: Mikado Sensual Feeder 9109 nr 6-10");
        }
    }
}
