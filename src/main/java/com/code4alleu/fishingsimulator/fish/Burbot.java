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
public class Burbot extends Fish {
    public Burbot() {
        optionsProvider = new PerchOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Mietusa");
        System.out.println("Wymiary: minimalne - 20 cm Nominalne - 30-60 cm Maksymalne - 120 cm");
        System.out.println("Wymiar Ochronny: do 25 cm");
        System.out.println("Waga: minimalna - 5 kg Nominalna - 15-20 kg Maksymalna - 30 kg");
        System.out.println("Okres ochronny: 1.12 - 29.2");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
