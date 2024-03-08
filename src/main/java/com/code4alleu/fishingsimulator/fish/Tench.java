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
public class Tench extends Fish {
    public Tench() {
        optionsProvider = new CarpOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Lina");
        System.out.println("Wymiary: minimalne - 20 cm Nominalne - 20-30 cm Maksymalne - 60 cm");
        System.out.println("Wymiary ochronne - do 25 cm");
        System.out.println("Waga: minimalna - 0,6 kg Nominalna - 0,6-4 kg Maksymalna - 7,7 kg");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
