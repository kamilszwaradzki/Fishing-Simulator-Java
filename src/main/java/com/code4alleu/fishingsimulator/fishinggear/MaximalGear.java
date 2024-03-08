/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear;

import com.code4alleu.fishingsimulator.fishinggear.impl.MaximalGearFloat;
import com.code4alleu.fishingsimulator.fishinggear.impl.MaximalGearGround;
import com.code4alleu.fishingsimulator.fishinggear.impl.MaximalGearLiveBait;
import com.code4alleu.fishingsimulator.fishinggear.impl.MaximalGearSpinning;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.locations.Location;
import com.code4alleu.fishingsimulator.fish.Fish;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MaximalGear extends FishingGear {
    public MaximalGear() {
        floatFishingGearDisplay = new MaximalGearFloat();
        groundFishingGearDisplay = new MaximalGearGround();
        liveBaitFishingGearDisplay = new MaximalGearLiveBait();
        spinningFishingGearDisplay = new MaximalGearSpinning();
    }

    @Override
    public void show(FishingMethod fishingmethod, Location location, Fish fish) {
        if (fishingmethod == null || location == null || fish == null) {
            return;
        }
        System.out.println("");
        System.out.println("Wybrales najlepszy sprzet");
        System.out.println("");
        this.executeShowGear(fishingmethod, location, fish);
    }
}
