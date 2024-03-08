/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.code4alleu.fishingsimulator;

import com.code4alleu.fishingsimulator.drawings.FloatDrawing;
import com.code4alleu.fishingsimulator.fishinggear.MaximalGear;
import com.code4alleu.fishingsimulator.fishinggear.MinimalGear;
import com.code4alleu.fishingsimulator.fishinggear.NominalGear;
import com.code4alleu.fishingsimulator.fishingmethods.FloatFishing;
import com.code4alleu.fishingsimulator.fishingmethods.GroundFishing;
import com.code4alleu.fishingsimulator.menu.MenuManager;
import com.code4alleu.fishingsimulator.player.Player;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */


public class FishingSimulator implements KeyListener {
    private static boolean isFishing = true;

    public static void main(String[] args) throws IOException, InterruptedException {
        MenuManager menu = new MenuManager();
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int choice,
            weather;
        boolean isPlay = true;
        while (isPlay) {
            //System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            menu.displayMenu();
            choice = scan.nextInt();
            switch(choice) {
                case 1, 2, 3, 4 -> {
                    player.setLake(menu.handleLakeChoice(choice - 1));
                    if( player.getLake() == null ) {
                        continue;
                    }
                    player.getLake().show();
                    choice = scan.nextInt();
                    player.setLocation(menu.handleLocationChoice(choice - 1));
                    if( player.getLocation() == null ) {
                        continue;
                    }
                    player.getLocation().show();
                    choice = scan.nextInt();
                    player.setFish(menu.handleFishChoice(choice - 1, player.getLocation()));
                    if( player.getFish() == null ) {
                        continue;
                    }
                    player.getFish().show();
                    choice = scan.nextInt();
                    player.setFishingMethod(menu.handleFishingMethodChoice(choice - 1, player.getFish()));
                    if( player.getFishingMethod() == null ) {
                        continue;
                    }
                    player.getFishingMethod().show();
                    choice = scan.nextInt();
                    player.setFishingGear(menu.handleFishingGearChoice(choice - 1));
                    if( player.getFishingGear() == null ) {
                        continue;
                    }
                    player.getFishingGear().show(player.getFishingMethod(), player.getLocation(), player.getFish());
                }
                case 5 -> {
                    //System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                    menu.displayGroundBaitMenu();
                    choice = scan.nextInt();
                    player.setGroundBait(menu.handleGroundBaitChoice(choice - 1));
                    player.getGroundBait().show(scan);
                }
                case 6 -> { // Lowienie ryb(wersja beta)
                    // loadFromFile();
                    if ( player.getFishingMethod() == null ) {
                        continue;
                    } else if( player.getFishingMethod() instanceof GroundFishing ) {
                        weather = rand.nextInt(2);
                        switch(weather) {
                            case 0, 1 ->
                            {
//                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                if (weather == 1) {
                                    System.out.println("Slonecznie, woda jest ciepla.");
                                    System.out.println("Nic tylko sie opalac :D");
                                    System.out.println("...");
                                    System.out.println("Albo isc na rybki :D");
                                } else {
                                    System.out.println("Pochmurno,woda niezbyt ciepla :(");
                                }
                                System.in.read();
//                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                getRandomizedFish((weather == 1) ? rand.nextInt(0, 19) : rand.nextInt(0, 39), player);
                                System.in.read();
                            }
                        }
                    } else if ( player.getFishingMethod() instanceof FloatFishing ) {
                        weather = rand.nextInt(2);
                        switch(weather) {
                            case 0, 1 ->
                            {
//                                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                                if (weather == 1) {
                                    System.out.println("Slonecznie, woda jest ciepla.");
                                    System.out.println("Nic tylko sie opalac :D");
                                    System.out.println("...");
                                    System.out.println("Albo isc na rybki :D");
                                } else {
                                    System.out.println("Pochmurno,woda niezbyt ciepla :(");
                                }
                                System.in.read();
                                // Setting the Frame and Labels
                                Frame f = new Frame("Fishing animation");
                                f.addWindowListener(new WindowAdapter() {
                                    @Override
                                    public void windowClosing(WindowEvent we) {
                                        f.dispose();
                                    }
                                });
                                f.setLayout(new FlowLayout());
                                f.setSize(500, 500);
                                JTextArea jta = new JTextArea();
                                jta.setEditable(false);
                                f.add(jta);
                                f.setVisible(true);

                                // Creating and adding the key listener
                                FishingSimulator k = new FishingSimulator();
                                f.addKeyListener(k);
                                FloatDrawing fd = new FloatDrawing();
                                int pic = 0,
                                    r = 0;
                                isFishing = true;
                                while(isFishing) {
                                    pic = rand.nextInt(0,8);
                                    jta.setText(fd.draw(pic));
                                    r = pic > 3 ? (pic > 4 ? (pic > 5 ? (pic > 6 ? rand.nextInt(1,2) : rand.nextInt(1,3) ) : rand.nextInt(1,4) ) : rand.nextInt(1,5) ) : (rand.nextInt(1,6));
                                    sleep(1000);
                                }
                                if (r == 1) {
                                    jta.setText(getRandomizedFish((weather == 1) ? rand.nextInt(0, 19) : rand.nextInt(0, 39), player));
                                } else if (r >= 2) {
                                    jta.setText("Przykro mi niestety ale nic nie ma na haczyku :(");
                                }
                            }

                        }
                    }
                }
                case 7 -> { // clear choices in file from menu
                }
                case 8 -> {
                    isPlay = false;
                }
                default -> {
                }
            }
        }
        scan.close();
    }

    /**
     *
     * @param fishRandRange
     * @param currentPlayer
     * @return String
     */
    public static String getRandomizedFish(int fishRandRange, Player currentPlayer) {
        double fishweight = 0.0;
        Random rand = new Random();

        switch (fishRandRange) {
            case 1 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 6.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 10.0);
                    }
                }
                return "Zlapales Leszcza " + fishweight + " kilogramowego !!";
            }
            case 2 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 6.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 10.0);
                    }
                }
                return "Zlapales Lina " + fishweight + " kilogramowego !!";
            }
            case 3 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 15.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 30.0);
                    }
                }
                return "Zlapales Karpia " + fishweight + " kilogramowego !!";
            }
            case 4 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 3.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 5.0);
                    }
                }
                return "Zlapales Okonia " + fishweight + " kilogramowego !!";
            }
            case 5 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear ||
                            currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 2.0);
                    }
                }
                return "Zlapales Plotke " + fishweight + " kilogramowa !!";
            }
            case 6 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear ||
                            currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 2.0);
                    }
                }
                return "Zlapales Sielawe " + fishweight + " kilogramowa !!";
            }
            case 7 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 6.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 10.0);
                    }
                }
                return "Zlapales Sieje " + fishweight + " kilogramowa !!";
            }
            case 8 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 6.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 10.0);
                    }
                }
                return "Zlapales Mietusa " + fishweight + " kilogramowego !!";
            }
            case 9 -> {
                if(currentPlayer.getFishingMethod() instanceof GroundFishing ||
                        currentPlayer.getFishingMethod() instanceof FloatFishing) {
                    if (currentPlayer.getFishingGear() instanceof MinimalGear ||
                            currentPlayer.getFishingGear() instanceof NominalGear) {
                        fishweight = rand.nextDouble(0.0, 1.0);
                    } else if (currentPlayer.getFishingGear() instanceof MaximalGear) {
                        fishweight = rand.nextDouble(0.0, 2.0);
                    }
                }
                return "Zlapales Wzdrege " + fishweight + " kilogramowa !!";
            }
            default -> {
                return "Niestety nic nie zlapales :(";
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("The key Typed was: " + e.getKeyChar());
        isFishing = false;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.isActionKey())
          System.exit(0);
        System.out.println("The key Pressed was: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("The key Released was: " + e.getKeyChar());
    }
}
