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
public class CommonRoach extends Fish {
    public CommonRoach() {
        optionsProvider = new CarpOptionsProvider();
    }

    @Override
    public void show() {
        System.out.println("Wybrales Ploc");
        System.out.println("Wymiary: minimalne - 15 cm Nominalne - 25-30 cm Maksymalne - 50 cm");
        System.out.println("Waga: minimalna - 0,5 kg Nominalna - 1-1,5 kg Maksymalna - 2 kg");
        System.out.println("");
        this.executeShowAvailableOptions();
    }
}
