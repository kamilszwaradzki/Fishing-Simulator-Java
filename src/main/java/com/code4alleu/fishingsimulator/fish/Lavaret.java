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
public class Lavaret extends Fish {
    public Lavaret() {
        optionsProvider = new CarpOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Sieje");
        System.out.println("Wymiary: minimalne - 25 cm Nominalne - 30-50 cm Maksymalne - 60 cm");
        System.out.println("Wymiar ochronny: do 35 cm");
        System.out.println("Waga: minimalna - 0,5 kg Nominalna - 1,5-2 kg Maksymalna - 2,5 kg");
        System.out.println("Okres Ochronny: 1.X - 31.XII");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
