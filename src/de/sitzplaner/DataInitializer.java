package de.sitzplaner;

import java.util.*;
import java.util.stream.Collectors;

import static de.sitzplaner.PositionsVorliebe.*;
import static de.sitzplaner.ReihenVorliebe.*;

public class DataInitializer {

    public static Map<Integer, Person> erstellePersonen() {
        Map<Integer, Person> personenMap = initPersonen();
        initBevorzugteNachbarn(personenMap);
        initBevorzugungen(personenMap);

        return personenMap;
    }

    private static Map<Integer, Person> initPersonen() {
        Map<Integer, Person> personenMap = new HashMap<>();
        for (int i = 1; i < 25; i++) {
            personenMap.put(i, new Person(i));
        }
        return personenMap;
    }

    private static void initBevorzugungen(Map<Integer, Person> personenMap) {
        personenMap.get(1).setPositionsVorliebe(hinten);
        personenMap.get(2).setReihenVorliebe(Fenster);
        personenMap.get(3).setReihenVorliebe(Gang);
        personenMap.get(3).setPositionsVorliebe(mittig);
        personenMap.get(4).setReihenVorliebe(Wand);
        personenMap.get(4).setPositionsVorliebe(vorne);
        personenMap.get(5).setReihenVorliebe(Fenster);
        personenMap.get(5).setPositionsVorliebe(hinten);
        personenMap.get(6).setReihenVorliebe(Gang);
        personenMap.get(7).setReihenVorliebe(Fenster);
        personenMap.get(7).setPositionsVorliebe(hinten);
        personenMap.get(8).setPositionsVorliebe(vorne);
        personenMap.get(9).setReihenVorliebe(Fenster);
        personenMap.get(10).setPositionsVorliebe(hinten);
        personenMap.get(11).setReihenVorliebe(Gang);
        personenMap.get(12).setReihenVorliebe(Wand);
        personenMap.get(12).setPositionsVorliebe(vorne);
        personenMap.get(13).setReihenVorliebe(Fenster);
        personenMap.get(14).setReihenVorliebe(Wand);
        personenMap.get(14).setPositionsVorliebe(vorne);
        personenMap.get(15).setPositionsVorliebe(hinten);
        personenMap.get(16).setReihenVorliebe(Gang);
        personenMap.get(16).setPositionsVorliebe(vorne);
        personenMap.get(17).setReihenVorliebe(Gang);
        personenMap.get(17).setPositionsVorliebe(vorne);
        personenMap.get(18).setReihenVorliebe(Gang);
        personenMap.get(18).setPositionsVorliebe(mittig);
        personenMap.get(19).setReihenVorliebe(Gang);
        personenMap.get(19).setPositionsVorliebe(vorne);
        personenMap.get(20).setReihenVorliebe(Fenster);
        personenMap.get(20).setPositionsVorliebe(vorne);
        personenMap.get(21).setReihenVorliebe(Fenster);
        personenMap.get(21).setPositionsVorliebe(vorne);
        personenMap.get(22).setReihenVorliebe(Fenster);
        personenMap.get(23).setReihenVorliebe(Wand);
        personenMap.get(24).setReihenVorliebe(Fenster);
        personenMap.get(24).setPositionsVorliebe(vorne);
        personenMap.get(25).setReihenVorliebe(Gang);
        personenMap.get(25).setPositionsVorliebe(mittig);
    }


    private static void initBevorzugteNachbarn(Map<Integer, Person> personenMap) {
        initBevorzugteNachbarn(1, Arrays.asList(4, 9, 21, 22, 10), personenMap);
        initBevorzugteNachbarn(2, Arrays.asList(4, 22, 14, 25, 12), personenMap);
        initBevorzugteNachbarn(3, Arrays.asList(17, 15, 5, 11, 7), personenMap);
        initBevorzugteNachbarn(4, Arrays.asList(22, 1, 25, 10, 3), personenMap);
        initBevorzugteNachbarn(5, Arrays.asList(17, 15, 3, 11, 7), personenMap);
        initBevorzugteNachbarn(6, Arrays.asList(16, 24, 2, 8, 12), personenMap);
        initBevorzugteNachbarn(7, Arrays.asList(13, 15, 5, 3, 11), personenMap);
        initBevorzugteNachbarn(8, Arrays.asList(19, 13, 23, 14, 22), personenMap);
        initBevorzugteNachbarn(9, Arrays.asList(20, 21, 22, 10, 1), personenMap);
        initBevorzugteNachbarn(10, Arrays.asList(13, 9, 21, 22, 1), personenMap);
        initBevorzugteNachbarn(12, Arrays.asList(14, 20, 6, 17, 22), personenMap);
        initBevorzugteNachbarn(13, Arrays.asList(23, 8, 19, 7, 1), personenMap);
        initBevorzugteNachbarn(14, Arrays.asList(4, 13, 22, 25, 12), personenMap);
        initBevorzugteNachbarn(15, Arrays.asList(20, 18, 5, 3, 7), personenMap);
        initBevorzugteNachbarn(16, Arrays.asList(24, 18, 11, 6, 13), personenMap);
        initBevorzugteNachbarn(17, Arrays.asList(20, 5, 3, 10, 11), personenMap);
        initBevorzugteNachbarn(18, Arrays.asList(20, 16, 11, 25, 2), personenMap);
        initBevorzugteNachbarn(19, Arrays.asList(13, 8, 22, 12, 1), personenMap);
        initBevorzugteNachbarn(20, Arrays.asList(17, 15, 9, 5, 10), personenMap);
        initBevorzugteNachbarn(21, Arrays.asList(9, 21, 10, 1, 17), personenMap);
        initBevorzugteNachbarn(22, Arrays.asList(4, 8, 14, 25, 12), personenMap);
        initBevorzugteNachbarn(23, Arrays.asList(13, 22, 14, 12), personenMap);
        initBevorzugteNachbarn(24, Arrays.asList(16, 15, 21, 13, 18), personenMap);
        initBevorzugteNachbarn(25, Arrays.asList(4, 14, 18, 16, 24), personenMap);
    }

    private static void initBevorzugteNachbarn(Integer personenNummer, List<Integer> nachbarn, Map<Integer, Person> personenMap) {
        List<Person> nachbarListe = personenMap.entrySet().stream().filter(e -> nachbarn.contains(e.getKey())).map(Map.Entry::getValue).collect(Collectors.toList());
        personenMap.get(personenNummer).setzeBevorzugteNachbarn(nachbarListe);
    }

    public static List<Sitz> erstellePlaetze() {

        //1. Reihe
        Sitz p1 = new Sitz(Gang, vorne);
        Sitz p2 = new Sitz(Gang, vorne);
        p2.setzeNachbarn(p1);

        Sitz p3 = new Sitz(Gang, vorne);
        Sitz p4 = new Sitz(Wand, vorne);
        Sitz p5 = new Sitz(Wand, vorne);
        p4.setzeNachbarn(p3, p5);

        //2. Reihe
        Sitz p6 = new Sitz(Fenster, vorne);
        Sitz p7 = new Sitz(Fenster, vorne);
        Sitz p8 = new Sitz(Gang, vorne);
        Sitz p9 = new Sitz(Gang, vorne);
        p7.setzeNachbarn(p6, p8);
        p8.setzeNachbarn(p9);

        Sitz p10 = new Sitz(Gang, vorne);
        Sitz p11 = new Sitz(Gang, vorne);
        Sitz p12 = new Sitz(Wand, vorne);
        p11.setzeNachbarn(p10, p12);

        //3. Reihe
        Sitz p13 = new Sitz(Fenster, mittig);
        Sitz p14 = new Sitz(Fenster, mittig);
        Sitz p15 = new Sitz(Gang, mittig);
        Sitz p16 = new Sitz(Gang, mittig);
        p14.setzeNachbarn(p13, p15);
        p15.setzeNachbarn(p16);

        Sitz p17 = new Sitz(Gang, mittig);
        Sitz p18 = new Sitz(Wand, mittig);
        p17.setzeNachbarn(p18);

        //4. Reihe
        Sitz p19 = new Sitz(Fenster, hinten);
        Sitz p20 = new Sitz(Fenster, hinten);
        Sitz p21 = new Sitz(Gang, hinten);
        Sitz p22 = new Sitz(Gang, hinten);
        p20.setzeNachbarn(p19, p21);
        p21.setzeNachbarn(p22);

        Sitz p23 = new Sitz(Gang, hinten);
        Sitz p24 = new Sitz(Gang, hinten);
        Sitz p25 = new Sitz(Wand, hinten);
        p24.setzeNachbarn(p23, p25);

        return new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25));
    }
}
