package de.sitzplaner;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    public void run(){
        Map<Integer, Person> personen = DataInitializer.erstellePersonen();
        List<Sitz> sitze = DataInitializer.erstellePlaetze();

    }

}
