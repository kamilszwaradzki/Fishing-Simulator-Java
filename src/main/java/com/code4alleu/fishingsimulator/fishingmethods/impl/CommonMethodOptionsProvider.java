/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fishingmethods.impl;

import com.code4alleu.fishingsimulator.interfaces.OptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CommonMethodOptionsProvider implements OptionsProvider {

    @Override
    public void showAvailableOptions() {
        System.out.println("[1] - Minimalny");
        System.out.println("[2] - Nominalny");
        System.out.println("[3] - Najlepszy");
        System.out.println("[4] - Powrot do menu");
        System.out.println("");
        System.out.println("Wybierz Sprzet:");
    }
}
