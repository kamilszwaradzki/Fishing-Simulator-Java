/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear;

import com.code4alleu.fishingsimulator.fishinggear.impl.MinimalGearFloat;
import com.code4alleu.fishingsimulator.fishinggear.impl.MinimalGearGround;
import com.code4alleu.fishingsimulator.fishinggear.impl.MinimalGearLiveBait;
import com.code4alleu.fishingsimulator.fishinggear.impl.MinimalGearSpinning;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.locations.Location;
import com.code4alleu.fishingsimulator.fish.Fish;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MinimalGear extends FishingGear {
    public MinimalGear() {
        floatFishingGearDisplay = new MinimalGearFloat();
        groundFishingGearDisplay = new MinimalGearGround();
        liveBaitFishingGearDisplay = new MinimalGearLiveBait();
        spinningFishingGearDisplay = new MinimalGearSpinning();
    }

    @Override
    public void show(FishingMethod fishingmethod, Location location, Fish fish) {
        if (fishingmethod == null || location == null || fish == null) {
            return;
        }
        System.out.println("");
        System.out.println("Wybrales minimalny sprzet");
        System.out.println("");
        this.executeShowGear(fishingmethod, location, fish);
    }
}
