/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.locations;

import com.code4alleu.fishingsimulator.locations.impl.CommonLocationOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class BoatFishing extends Location {
    public BoatFishing() {
        optionsProvider = new CommonLocationOptionsProvider();
    }

    @Override
    public void show() {
        this.executeShowAvailableOptions();
    }
}
