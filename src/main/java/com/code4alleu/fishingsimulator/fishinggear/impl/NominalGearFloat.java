/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear.impl;

import com.code4alleu.fishingsimulator.fish.CommonCarp;
import com.code4alleu.fishingsimulator.fish.Fish;
import com.code4alleu.fishingsimulator.fishinggear.interfaces.FloatFishingGearDisplay;
import com.code4alleu.fishingsimulator.locations.BoatFishing;
import com.code4alleu.fishingsimulator.locations.DockFishing;
import com.code4alleu.fishingsimulator.locations.Location;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class NominalGearFloat implements FloatFishingGearDisplay {

    @Override
    public void showFloatGear(Location location, Fish fish) {
        if (fish instanceof CommonCarp) {
            if (location instanceof BoatFishing ||
                location instanceof DockFishing) {
                System.out.println("Wedka: Mikado Ultraviolet Heavy Feeder 360cm / 120g");
            } else {
                System.out.println("Wedka: Jaxon Extera Tele Carp (50-120)");
            }
            System.out.println("Kolowrotek: Okuma Axeon V2 (60)");
            System.out.println("Zylka: Dragon Millenium Karp 0,35");
            System.out.println("Haczyki: A1 G-Carp Specialist Teflon Coating nr 6");
        } else {
            if (location instanceof BoatFishing ||
                location instanceof DockFishing) {
                System.out.println("Wedka: JAXON EXTERA FEEDER 3,90 m 70-130g");
            } else {
                System.out.println("Wedka: JAXON EXTERA TELE FEEDER 3,90 m 40-80g");
            }
            System.out.println("Kolowrotek: OKUMA Inspira FD35");
            System.out.println("Zylka: Mikado Sensei Feeder 150m 0.30 mm");
            System.out.println("Haczyki: Mikado Sensual Feeder 9109 nr 6-10");
        }
    }
}
