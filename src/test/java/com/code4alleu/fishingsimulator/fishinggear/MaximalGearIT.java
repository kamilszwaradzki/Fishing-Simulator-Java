/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishinggear;

import com.code4alleu.fishingsimulator.fish.Burbot;
import com.code4alleu.fishingsimulator.fish.CommonCarp;
import com.code4alleu.fishingsimulator.fish.Fish;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.fishingmethods.FloatFishing;
import com.code4alleu.fishingsimulator.locations.BoatFishing;
import com.code4alleu.fishingsimulator.locations.IceFishing;
import com.code4alleu.fishingsimulator.locations.Location;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MaximalGearIT {
    
    public MaximalGearIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of show method, of class MaximalGear.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        FishingMethod fishingmethod = new FloatFishing();
        Location location = new BoatFishing();
        Fish fish = new CommonCarp();
        MaximalGear instance = new MaximalGear();
        instance.show(fishingmethod, location, fish);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
