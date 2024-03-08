/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.lakes;

import com.code4alleu.fishingsimulator.interfaces.OptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public abstract class Lake {
    OptionsProvider optionsProvider;

    public abstract void show();

    public void executeShowAvailableOptions() {
        optionsProvider.showAvailableOptions();
    }
}
