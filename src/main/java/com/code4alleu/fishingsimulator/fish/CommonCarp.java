/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fish;

import com.code4alleu.fishingsimulator.fish.impl.CarpOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CommonCarp extends Fish {
    public CommonCarp() {
        optionsProvider = new CarpOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Karpia");
        System.out.println("Wymiary: minimalne - 25 cm Nominalne - 25-75 cm Maksymalne - 120 cm");
        System.out.println("Wymiar Ochronny: do 30 cm (nie dotyczy rzek)");
        System.out.println("Waga: minimalna - 1-2 kg Nominalna - 5 kg Maksymalna - 35 kg");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
    
}
