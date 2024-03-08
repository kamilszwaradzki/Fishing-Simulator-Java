/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.fish;

import com.code4alleu.fishingsimulator.fish.impl.RuddOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CommonRudd extends Fish {
    public CommonRudd() {
        optionsProvider = new RuddOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Wzdrege");
        System.out.println("Wymiary: minimalne - 10 cm Nominalne - 20-30 cm Maksymalne - 45 cm");
        System.out.println("Wymiar Ochronny: do 15 cm");
        System.out.println("Waga: minimalna - 5 kg Nominalna - 5-10 kg Maksymalna - 12 kg");
        System.out.println("Okres Ochronny: 01.I - 30.IV");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
