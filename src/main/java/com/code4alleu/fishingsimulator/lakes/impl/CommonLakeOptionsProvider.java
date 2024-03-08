/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.lakes.impl;

import com.code4alleu.fishingsimulator.interfaces.OptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class CommonLakeOptionsProvider implements OptionsProvider {
    @Override
    public void showAvailableOptions() {
        System.out.println("                       Jest mozliwosc lapania w nocy !!");
        System.out.println("");
        System.out.println("[1] - Z Brzegu");
        System.out.println("[2] - Z Pomostu");
        System.out.println("[3] - Z Lodzi");
        System.out.println("[4] - Pod Lodem");
        System.out.println("[5] - Powrot do menu");
        System.out.println("");
        System.out.println("Wybierz Miejsce:");
    }
    
}
