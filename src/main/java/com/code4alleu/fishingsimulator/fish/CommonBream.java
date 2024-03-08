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
public class CommonBream extends Fish {
    public CommonBream() {
        optionsProvider = new CarpOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Leszcza");
        System.out.println("Wymiary: minimalne - 30 cm Nominalne - 30-50 cm Maksymalne - 75 cm");
        System.out.println("Waga: minimalna - 0,6 kg Nominalna - 0,6-4 kg Maksymalna - 7 kg");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
