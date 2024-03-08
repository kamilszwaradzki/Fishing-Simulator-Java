/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.drawings;

import com.code4alleu.fishingsimulator.drawings.interfaces.Drawing;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class FloatDrawing implements Drawing {

    private final String water_surface = new String(new char[80]).replace('\0', '~');
    private final String air_above_surface = new String(new char[80]).replace('\0', ' ');
    private final String newline = System.getProperty("line.separator");
    private final String spaces_117 = new String(new char[117]).replace('\0', ' ');
    private final String spaces_116 = new String(new char[116]).replace('\0', ' ');
    private final String spaces_115 = new String(new char[115]).replace('\0', ' ');
    private final String spaces_114 = new String(new char[114]).replace('\0', ' ');
    private final String spaces_112 = new String(new char[112]).replace('\0', ' ');
    private final String spaces_110 = new String(new char[110]).replace('\0', ' ');
    private final String spaces_108 = new String(new char[108]).replace('\0', ' ');

    @Override
    public String draw(int choice) {
        return switch(choice) {
            case 0 -> firstFigure();
            case 1 -> secondFigure();
            case 2 -> thirdFigure();
            case 3 -> fourthFigure();
            case 4 -> fifthFigure();
            case 5 -> sixthFigure();
            case 6 -> seventhFigure();
            case 7 -> eightFigure();
            default -> "";
        };
    }
    String firstFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            spaces_116 + "|",
            spaces_116 + "|",
            spaces_114 + "/=\\",
            spaces_112 + "/===\\",
            spaces_110 + "/=====\\",
            spaces_108 + "(=======)",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\=====/~~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String secondFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            spaces_116 + "|",
            spaces_116 + "|",
            spaces_114 + "/=\\",
            spaces_112 + "/===\\",
            spaces_110 + "/=====\\",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~(=======)~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String thirdFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            spaces_116 + "|",
            spaces_116 + "|",
            spaces_114 + "/=\\",
            spaces_112 + "/===\\",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/=====\\~~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String fourthFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            spaces_117 + "|",
            spaces_117 + "|",
            spaces_115 + "/=\\",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/===\\~~~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String fifthFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            spaces_117 + "|",
            spaces_117 + "|",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/=\\~~~~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String sixthFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            spaces_117 + "|",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String seventhFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~",
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
    String eightFigure()
    {
        return String.join(newline,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            air_above_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface,
            water_surface
        );
    }
}
