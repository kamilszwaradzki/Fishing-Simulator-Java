/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fish.impl;

import com.code4alleu.fishingsimulator.interfaces.OptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CarpOptionsProvider implements OptionsProvider {
    @Override
    public void showAvailableOptions() {
        System.out.println("[1] - Grunt");
        System.out.println("[2] - Splawik");
        System.out.println("[3] - Powrot do menu");
        System.out.println("");
        System.out.println("Wybierz Metode:");
    }
}
