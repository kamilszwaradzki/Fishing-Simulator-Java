/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear;

import com.code4alleu.fishingsimulator.fishinggear.impl.NominalGearFloat;
import com.code4alleu.fishingsimulator.fishinggear.impl.NominalGearGround;
import com.code4alleu.fishingsimulator.fishinggear.impl.NominalGearLiveBait;
import com.code4alleu.fishingsimulator.fishinggear.impl.NominalGearSpinning;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.locations.Location;
import com.code4alleu.fishingsimulator.fish.Fish;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class NominalGear extends FishingGear {
    public NominalGear() {
        floatFishingGearDisplay = new NominalGearFloat();
        groundFishingGearDisplay = new NominalGearGround();
        liveBaitFishingGearDisplay = new NominalGearLiveBait();
        spinningFishingGearDisplay = new NominalGearSpinning();
    }

    @Override
    public void show(FishingMethod fishingmethod, Location location, Fish fish) {
        if (fishingmethod == null || location == null || fish == null) {
            return;
        }
        System.out.println("");
        System.out.println("Wybrales nominalny sprzet");
        System.out.println("");
        this.executeShowGear(fishingmethod, location, fish);
    }
}
