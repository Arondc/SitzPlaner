package de.sitzplaner;

import java.util.HashSet;
import java.util.Set;

public class Sitz {

    private ReihenVorliebe reihenVorliebe;
    private PositionsVorliebe positionsVorliebe;

    private Set<Sitz> nachbarn = new HashSet<>();

    public Sitz(ReihenVorliebe reihenVorliebe, PositionsVorliebe positionsVorliebe){
        this.reihenVorliebe = reihenVorliebe;
        this.positionsVorliebe = positionsVorliebe;
    }

    public PositionsVorliebe getPositionsVorliebe() {
        return positionsVorliebe;
    }

    public ReihenVorliebe getReihenVorliebe() {
        return reihenVorliebe;
    }

    public void setzeNachbarn(Sitz... nachbarn){
        for (Sitz p : nachbarn) {
            this.nachbarn.add(p);
            p.setzeNachbarn(this);
        }
    }



}
