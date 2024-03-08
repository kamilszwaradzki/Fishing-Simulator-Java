/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.lakes;

import com.code4alleu.fishingsimulator.lakes.impl.CommonLakeOptionsProvider;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class GimLake extends Lake {
    public GimLake() {
        optionsProvider = new CommonLakeOptionsProvider();
    }

    @Override
    public void show() {
        this.executeShowAvailableOptions();
    }
}
