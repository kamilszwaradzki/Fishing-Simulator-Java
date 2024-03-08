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
public class EuropeanCisco extends Fish {
    public EuropeanCisco() {
        optionsProvider = new CarpOptionsProvider();
    }
    @Override
    public void show() {
        System.out.println("Wybrales Sielawe");
        System.out.println("Wymiary: minimalne - 10 cm Nominalne - 15-30 cm Maksymalne - 45 cm");
        System.out.println("Wymiar ochronny: do 18 cm");
        System.out.println("Waga: minimalna - 0,5 kg Nominalna - 1-1,5 kg Maksymalna - 2 kg");
        System.out.println("Okres ochronny: 1.X - 31.XII");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
    
}
