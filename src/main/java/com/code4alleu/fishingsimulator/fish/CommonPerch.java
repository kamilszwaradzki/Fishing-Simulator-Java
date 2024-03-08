/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fish;

import com.code4alleu.fishingsimulator.fish.impl.PerchOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CommonPerch extends Fish {
    public CommonPerch() {
        optionsProvider = new PerchOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Okonia");
        System.out.println("Wymiary: minimalne - 15 cm Nominalne - 25-30 cm Maksymalne - 50 cm");
        System.out.println("Wymiar Ochronny: do 18cm");
        System.out.println("Waga: minimalna - 0,5 kg Nominalna - 1-1,5 kg Maksymalna - 2 kg");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
