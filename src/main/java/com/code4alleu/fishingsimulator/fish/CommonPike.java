/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fish;

import com.code4alleu.fishingsimulator.fish.impl.PikeOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CommonPike extends Fish {
    public CommonPike() {
        optionsProvider = new PikeOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Szczupaka");
        System.out.println("Wymiary: minimalne - 70 cm Nominalne - 110 cm Maksymalne - 150 cm");
        System.out.println("Wymiar Ochronny: do 50 cm");
        System.out.println("Waga: minimalna - 5 kg Nominalna - 5-10 kg Maksymalna - 12 kg");
        System.out.println("Okres Ochronny: 01.I - 30.IV");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
    
}
