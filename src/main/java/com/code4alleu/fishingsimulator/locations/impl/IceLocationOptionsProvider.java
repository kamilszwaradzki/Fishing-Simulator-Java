/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.locations.impl;

import com.code4alleu.fishingsimulator.interfaces.OptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class IceLocationOptionsProvider implements OptionsProvider {

    @Override
    public void showAvailableOptions() {
        System.out.println("[1] - Leszcz");
        System.out.println("[2] - Okon");
        System.out.println("[3] - Ploc");
        System.out.println("[4] - Sielawa");
        System.out.println("[5] - Sieja");
        System.out.println("[6] - Szczupak");
        System.out.println("[7] - Mietus");
        System.out.println("[8] - Wzdrega");
        System.out.println("[9] - Powrot do menu");
        System.out.println("");
        System.out.println("Wybierz Rybe:");
    }
    
}
