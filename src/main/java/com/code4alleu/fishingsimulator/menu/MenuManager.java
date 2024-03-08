/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code4alleu.fishingsimulator.menu;

import com.code4alleu.fishingsimulator.enums.fishEnum;
import com.code4alleu.fishingsimulator.enums.gearEnum;
import com.code4alleu.fishingsimulator.enums.groundBaitEnum;
import com.code4alleu.fishingsimulator.enums.locationEnum;
import com.code4alleu.fishingsimulator.enums.lakeEnum;
import com.code4alleu.fishingsimulator.enums.methodEnum;
import com.code4alleu.fishingsimulator.fish.Burbot;
import com.code4alleu.fishingsimulator.fish.CommonBream;
import com.code4alleu.fishingsimulator.fish.CommonCarp;
import com.code4alleu.fishingsimulator.fish.CommonPerch;
import com.code4alleu.fishingsimulator.fish.CommonPike;
import com.code4alleu.fishingsimulator.fish.CommonRoach;
import com.code4alleu.fishingsimulator.fish.CommonRudd;
import com.code4alleu.fishingsimulator.fish.EuropeanCisco;
import com.code4alleu.fishingsimulator.fish.Fish;
import com.code4alleu.fishingsimulator.fish.Lavaret;
import com.code4alleu.fishingsimulator.fish.Tench;
import com.code4alleu.fishingsimulator.fishinggear.FishingGear;
import com.code4alleu.fishingsimulator.fishinggear.MaximalGear;
import com.code4alleu.fishingsimulator.fishinggear.MinimalGear;
import com.code4alleu.fishingsimulator.fishinggear.NominalGear;
import com.code4alleu.fishingsimulator.fishingmethods.FishingMethod;
import com.code4alleu.fishingsimulator.fishingmethods.FloatFishing;
import com.code4alleu.fishingsimulator.fishingmethods.GroundFishing;
import com.code4alleu.fishingsimulator.fishingmethods.LiveBaitFishing;
import com.code4alleu.fishingsimulator.fishingmethods.SpinningFishing;
import com.code4alleu.fishingsimulator.groundbait.Asticot;
import com.code4alleu.fishingsimulator.groundbait.Blood;
import com.code4alleu.fishingsimulator.groundbait.BoneMeal;
import com.code4alleu.fishingsimulator.groundbait.CopraMolasse;
import com.code4alleu.fishingsimulator.groundbait.Dill;
import com.code4alleu.fishingsimulator.groundbait.Grist;
import com.code4alleu.fishingsimulator.groundbait.GroundBait;
import com.code4alleu.fishingsimulator.groundbait.MeatMeal;
import com.code4alleu.fishingsimulator.groundbait.Peanut;
import com.code4alleu.fishingsimulator.groundbait.RapeSeed;
import com.code4alleu.fishingsimulator.groundbait.Rye;
import com.code4alleu.fishingsimulator.groundbait.Wheat;
import com.code4alleu.fishingsimulator.groundbait.WheatBran;
import com.code4alleu.fishingsimulator.lakes.GimLake;
import com.code4alleu.fishingsimulator.lakes.Lake;
import com.code4alleu.fishingsimulator.lakes.LanskLake;
import com.code4alleu.fishingsimulator.lakes.SekLake;
import com.code4alleu.fishingsimulator.lakes.ZalesieLake;
import com.code4alleu.fishingsimulator.locations.BoatFishing;
import com.code4alleu.fishingsimulator.locations.DockFishing;
import com.code4alleu.fishingsimulator.locations.IceFishing;
import com.code4alleu.fishingsimulator.locations.Location;
import com.code4alleu.fishingsimulator.locations.ShoreFishing;

/**
 *
 * @author Kamil Szwaradzki <kamil.szwaradzki at your.org>
 */
public class MenuManager {

    /**
     *
     */
    public void displayMenu() {
        System.out.println("		 Witamy w Poradniku dla Poczatkujacych Wedkarzy \n");
        System.out.println("W celu unikniecia zerwan przez zaczepy doradza sie kupno wytrzymalszej zylki \n");
        System.out.println("Przy zakupie zylek patrz na ich jakosc !!! \n");
        System.out.println("==== MENU ====");
        System.out.println("Wybierz Jezioro: \n");
        System.out.println("[1] - Lanskie");
        System.out.println("[2] - Sek");
        System.out.println("[3] - Zalesie");
        System.out.println("[4] - Gim \n");
        System.out.println("Oblicz zanete:");
        System.out.println("[5] - Na ryby biale/drapiezne\n");
        System.out.println("[6] - Lowienie ryb(wersja beta)");
        System.out.println("[7] - Czyszczenie wyboru \n");
        System.out.println("[8] - Wyjscie \n");
        System.out.print("Wybierz Opcje: ");
    }

    /**
     *
     */
    public void displayGroundBaitMenu() {
        System.out.println("Oblicz zanete na ryby biale:");
        System.out.println("[1] - Otreby");
        System.out.println("[2] - Arachid");
        System.out.println("[3] - Sruta");
        System.out.println("[4] - Zyto");
        System.out.println("[5] - Pszenica");
        System.out.println("[6] - Kopra melasowana");
        System.out.println("[7] - Rzepak");
        System.out.println("[8] - Koper");
        System.out.println("[9] - Pinka/Ochotka");
        System.out.println("Oblicz zanete ryby drapiezne:");
        System.out.println("[10] - Krew");
        System.out.println("[11] - Maczka miesna");
        System.out.println("[12] - Maczka kostna");
        System.out.println("[13] - Wroc do menu");
        System.out.println("");
        System.out.print("Wybierz Zanete: ");
    }

    /**
     *
     * @param choice
     * @return Lake
     */
    public Lake handleLakeChoice(int choice) {
        if (choice < 0 || choice > 3) return null;
        lakeEnum myLake = lakeEnum.values()[choice];
        return switch (myLake) {
            case LANSK -> new LanskLake();
            case SEK -> new SekLake();
            case ZALESIE -> new ZalesieLake();
            case GIM -> new GimLake();
        };
    }

    /**
     *
     * @param choice
     * @return Location
     */
    public Location handleLocationChoice(int choice) {
        if (choice < 0 || choice > 3) return null;
        locationEnum myLocation = locationEnum.values()[choice];
        return switch (myLocation) {
            case SHORE -> new ShoreFishing();
            case DOCK -> new DockFishing();
            case BOAT -> new BoatFishing();
            case ICE -> new IceFishing();
        };
    }

    /**
     *
     * @param choice
     * @param selectedLocation
     * @return Fish
     */
    public Fish handleFishChoice(int choice, Location selectedLocation) {
        if (choice < 0 || choice > 9) return null;
        fishEnum myFish = fishEnum.values()[choice];
        if (selectedLocation instanceof IceFishing) {
            return switch (myFish) {
                case FIRST_FISH -> new CommonBream();
                case SECOND_FISH -> new CommonPerch();
                case THIRD_FISH -> new CommonRoach();
                case FOURTH_FISH -> new EuropeanCisco();
                case FIFTH_FISH -> new Lavaret();
                case SIXTH_FISH -> new CommonPike();
                case SEVENTH_FISH -> new Burbot();
                case EIGHT_FISH -> new CommonRudd();
                default -> null;
            };
        } else {
            return switch (myFish) {
                case FIRST_FISH -> new CommonBream();
                case SECOND_FISH -> new Tench();
                case THIRD_FISH -> new CommonCarp();
                case FOURTH_FISH -> new CommonPerch();
                case FIFTH_FISH -> new CommonRoach();
                case SIXTH_FISH -> new EuropeanCisco();
                case SEVENTH_FISH -> new Lavaret();
                case EIGHT_FISH -> new CommonPike();
                case NINTH_FISH -> new Burbot();
                case TENTH_FISH -> new CommonRudd();
            };
        }
    }

    /**
     *
     * @param choice
     * @param selectedFish
     * @return FishingMethod
     */
    public FishingMethod handleFishingMethodChoice(int choice, Fish selectedFish) {
        if (choice < 0 || choice > 2) return null;
        methodEnum myMethod = methodEnum.values()[choice];
        if (selectedFish instanceof CommonPerch ||
            selectedFish instanceof Burbot) {
            return switch (myMethod) {
                case FIRST_METHOD -> new SpinningFishing();
                case SECOND_METHOD -> new FloatFishing();
                default -> null;
            };
        } else if (selectedFish instanceof CommonPike) {
            return switch (myMethod) {
                case FIRST_METHOD -> new SpinningFishing();
                case SECOND_METHOD -> new LiveBaitFishing();
                default -> null;
            };
        } else if (selectedFish instanceof CommonRudd) {
            return switch (myMethod) {
                case FIRST_METHOD -> new GroundFishing();
                case SECOND_METHOD -> new FloatFishing();
                case THIRD_METHOD -> new SpinningFishing();
            };
        } else {
            return switch (myMethod) {
                case FIRST_METHOD -> new GroundFishing();
                case SECOND_METHOD -> new FloatFishing();
                default -> null;
            };
        }
    }

    /**
     *
     * @param choice
     * @return FishingGear
     */
    public FishingGear handleFishingGearChoice(int choice) {
        if (choice < 0 || choice > 3) return null;
        gearEnum myGear = gearEnum.values()[choice];
        return switch (myGear) {
            case MINIMAL -> new MinimalGear();
            case NOMINAL -> new NominalGear();
            case MAXIMAL -> new MaximalGear();
        };
    }

    /**
     *
     * @param choice
     * @return GroundBait
     */
    public GroundBait handleGroundBaitChoice(int choice) {
        if (choice < 0 || choice > 11) return null;
        groundBaitEnum myGroundBait = groundBaitEnum.values()[choice];
        return switch (myGroundBait) {
            case WHEATBRAN -> new WheatBran();
            case PEANUT -> new Peanut();
            case GRIST -> new Grist();
            case RYE -> new Rye();
            case WHEAT -> new Wheat();
            case COPRAMOLASSE -> new CopraMolasse();
            case RAPESEED -> new RapeSeed();
            case DILL -> new Dill();
            case ASTICOT -> new Asticot();
            case BLOOD -> new Blood();
            case MEATMEAL -> new MeatMeal();
            case BONEMEAL -> new BoneMeal();
        };
    }
}
