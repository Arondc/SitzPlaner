package de.sitzplaner;

import java.time.Period;
import java.util.*;

public class Person {
    private Integer nummer;
    private Set<Person> bevorzugteNachbarn = new HashSet<>();

    private ReihenVorliebe reihenVorliebe;
    private PositionsVorliebe positionsVorliebe;

    public Person(int nummer){
        this(nummer,null,null);
    }

    public Person(int nummer, ReihenVorliebe reihenVorliebe){
        this(nummer,reihenVorliebe,null);
    }

    public Person(int nummer, PositionsVorliebe positionsVorliebe){
        this(nummer,null,positionsVorliebe);
    }

    public Person(int nummer, ReihenVorliebe reihenVorliebe, PositionsVorliebe positionsVorliebe){
        this.nummer = nummer;
        this.reihenVorliebe = reihenVorliebe;
        this.positionsVorliebe = positionsVorliebe;
    }

    public void setzeBevorzugteNachbarn(List<Person> nachbarn){
        bevorzugteNachbarn.addAll(nachbarn);
    }

    public void setPositionsVorliebe(PositionsVorliebe positionsVorliebe) {
        this.positionsVorliebe = positionsVorliebe;
    }

    public void setReihenVorliebe(ReihenVorliebe reihenVorliebe) {
        this.reihenVorliebe = reihenVorliebe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return nummer.equals(person.nummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummer);
    }
}
