/*
An array of buildings is facing the sun. The heights of each building from West to East is given in an integer array.
You have to tell which buildings will be able to see the sunset.
Write a program that prints how many buildings and which buildings will be able to see the Sunset
given the Array of building heights:[3, 2, 4, 7, 6, 9].
The output should look something like this:4 --> [3, 4, 7, 9]
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void outputStaticBuildings() {
        int max = 0;

        ArrayList<Integer> buildings = new ArrayList<Integer>();
        buildings.add(3);
        buildings.add(2);
        buildings.add(4);
        buildings.add(7);
        buildings.add(6);
        buildings.add(9);
        System.out.println("All buildings: " + buildings); //Print all buildings

        ArrayList<Integer> sunsetBuildings = new ArrayList<Integer>();
        for (int i = 0; i < buildings.size(); i++) {
            int currentBuilding = buildings.get(i);
            if (currentBuilding > max) {
                sunsetBuildings.add(currentBuilding);
                max = currentBuilding;
            }
        }
        System.out.println("Buildings that can see the sunset: " + sunsetBuildings.size() + " --> " + sunsetBuildings);
    }

    public static void outputUserBuildings() {                          // Extra credit
        Scanner myScan = new Scanner(System.in);
        int max = 0;

        ArrayList<Integer> buildings = new ArrayList<Integer>();        // All the buildings
        System.out.print("How many buildings do you want?: ");
        int buildingHeight = myScan.nextInt();
        for (int i = 0; i < buildingHeight; i++) {
            System.out.print("Enter building height: ");
            buildings.add(myScan.nextInt());
        }

        System.out.println("All buildings: " + buildings.size() + " ---> " + buildings);

        ArrayList<Integer> sunsetBuildings = new ArrayList<Integer>();
        for (int i = 0; i < buildings.size(); i++) {
            int currentBuilding = buildings.get(i);
            if (currentBuilding > max) {
                sunsetBuildings.add(currentBuilding);
                max = currentBuilding;
            }
        }
        System.out.println("Buildings that can see the sunset: " + sunsetBuildings.size() + " ---> " + sunsetBuildings);
    }

    public static void main(String[] args) {
        System.out.println("Sunset Hills Challenge");
        outputUserBuildings();
    }
}