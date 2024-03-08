/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear;

import com.code4alleu.fishingsimulator.fishinggear.interfaces.FloatFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.GroundFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.LiveBaitFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.SpinningFishingGearDisplay;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.fishingmethods.FloatFishing;
import com.code4alleu.fishingsimulator.fishingmethods.GroundFishing;
import com.code4alleu.fishingsimulator.fishingmethods.LiveBaitFishing;
import com.code4alleu.fishingsimulator.fishingmethods.SpinningFishing;
import com.code4alleu.fishingsimulator.locations.Location;
import com.code4alleu.fishingsimulator.fish.Fish;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public abstract class FishingGear {
    FloatFishingGearDisplay floatFishingGearDisplay;
    GroundFishingGearDisplay groundFishingGearDisplay;
    LiveBaitFishingGearDisplay liveBaitFishingGearDisplay;
    SpinningFishingGearDisplay spinningFishingGearDisplay;

    public abstract void show(FishingMethod fishingmethod, Location location, Fish fish);

    public void executeShowGear(FishingMethod fishingmethod, Location location, Fish fish) {
        if (fishingmethod instanceof FloatFishing) {
            floatFishingGearDisplay.showFloatGear(location, fish);
        } else if (fishingmethod instanceof GroundFishing) {
            groundFishingGearDisplay.showGroundGear(location, fish);
        } else if (fishingmethod instanceof LiveBaitFishing) {
            liveBaitFishingGearDisplay.showLiveBaitGear(location);
        } else if(fishingmethod instanceof SpinningFishing) {
            spinningFishingGearDisplay.showSpinningGear(location);
        }
        System.out.println("");
        System.out.println("Nacisnij dowolny klawisz");
    }
}
