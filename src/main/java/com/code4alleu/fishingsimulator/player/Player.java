/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.player;

import com.code4alleu.fishingsimulator.fish.Fish;
import com.code4alleu.fishingsimulator.fishinggear.FishingGear;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.groundbait.GroundBait;
import com.code4alleu.fishingsimulator.lakes.Lake;
import com.code4alleu.fishingsimulator.locations.Location;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class Player {
    private Lake lake;
    private Location location;
    private Fish fish;
    private FishingMethod fishingMethod;
    private FishingGear fishingGear;
    private GroundBait groundBait;
    
        // Getter i setter dla zmiennej 'lake'
    public Lake getLake() {
        return lake;
    }

    public void setLake(Lake lake) {
        this.lake = lake;
    }

    // Getter i setter dla zmiennej 'location'
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // Getter i setter dla zmiennej 'fish'
    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    // Getter i setter dla zmiennej 'fishingMethod'
    public FishingMethod getFishingMethod() {
        return fishingMethod;
    }

    public void setFishingMethod(FishingMethod fishingMethod) {
        this.fishingMethod = fishingMethod;
    }

    // Getter i setter dla zmiennej 'fishingGear'
    public FishingGear getFishingGear() {
        return fishingGear;
    }

    public void setFishingGear(FishingGear fishingGear) {
        this.fishingGear = fishingGear;
    }

    // Getter i setter dla zmiennej 'groundBait'
    public GroundBait getGroundBait() {
        return groundBait;
    }

    public void setGroundBait(GroundBait groundBait) {
        this.groundBait = groundBait;
    }
}
