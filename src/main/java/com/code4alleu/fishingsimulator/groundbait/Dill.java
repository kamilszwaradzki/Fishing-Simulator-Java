/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.groundbait;

import java.util.Scanner;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class Dill extends GroundBait {
    @Override
    public void show(Scanner scan) {
        System.out.print("Ile chcesz uzyc zanety(w gramach)? ");
        System.out.println("Musisz dac " + calculate(scan) + " gram");
    }

    @Override
    public double calculate(Scanner scan) {
        double groundbait = scan.nextDouble();
        return groundbait * 0.02;
    }
}
