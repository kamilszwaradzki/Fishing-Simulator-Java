/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.groundbait;

import com.code4alleu.fishingsimulator.interfaces.OptionsProvider;
import java.util.Scanner;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public abstract class GroundBait {
    OptionsProvider optionsProvider;

    public abstract void show(Scanner scan);
    
    public abstract double calculate(Scanner scan);

    public void executeShowAvailableOptions() {
        optionsProvider.showAvailableOptions();
    }
}
