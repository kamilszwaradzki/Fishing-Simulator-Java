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
public class CommonLocationOptionsProvider implements OptionsProvider {

    @Override
    public void showAvailableOptions() {
        System.out.println("[1] - Leszcz");
        System.out.println("[2] - Lin");
        System.out.println("[3] - Karp");
        System.out.println("[4] - Okon");
        System.out.println("[5] - Ploc");
        System.out.println("[6] - Sielawa");
        System.out.println("[7] - Sieja");
        System.out.println("[8] - Szczupak");
        System.out.println("[9] - Mietus");
        System.out.println("[10] - Wzdrega");
        System.out.println("[11] - Powrot do menu");
        System.out.println("");
        System.out.println("Wybierz Rybe:");
    }
    
}
