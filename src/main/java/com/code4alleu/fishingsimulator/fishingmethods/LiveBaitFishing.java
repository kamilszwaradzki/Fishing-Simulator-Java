/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishingmethods;

import com.code4alleu.fishingsimulator.fishingmethods.impl.CommonMethodOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class LiveBaitFishing extends FishingMethod {
    public LiveBaitFishing() {
        optionsProvider = new CommonMethodOptionsProvider();
    }

    @Override
    public void show() {
        this.executeShowAvailableOptions();
    }
}
