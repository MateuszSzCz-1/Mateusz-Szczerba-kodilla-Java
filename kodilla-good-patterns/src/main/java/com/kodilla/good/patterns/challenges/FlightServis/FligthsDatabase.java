package com.kodilla.good.patterns.challenges.FlightServis;

import java.util.HashSet;
import java.util.Set;

public class FligthsDatabase {
    private Set<Flight> flights = new HashSet<>();

    public FligthsDatabase() {
        flights.add(new Flight("POZ", "WRO"));
        flights.add(new Flight("POZ", "RZE"));
        flights.add(new Flight("POZ", "WAW"));
        flights.add(new Flight("POZ", "KRK"));
        flights.add(new Flight("POZ", "GDN"));
        flights.add(new Flight("WRO", "POZ"));
        flights.add(new Flight("WOR", "RZE"));
        flights.add(new Flight("WRO", "KRK"));
        flights.add(new Flight("WRO", "GDN"));
        flights.add(new Flight("WAW", "POZ"));
        flights.add(new Flight("WAW", "RZE"));
        flights.add(new Flight("WAW", "KRK"));
        flights.add(new Flight("WAW", "GDN"));
        flights.add(new Flight("KRK", "POZ"));
        flights.add(new Flight("KRK", "RZE"));
        flights.add(new Flight("KRK", "WRO"));
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("GDN", "WRO"));
        flights.add(new Flight("GDN", "POZ"));
        flights.add(new Flight("GDN", "WAW"));
        flights.add(new Flight("GDK", "RZE"));
        flights.add(new Flight("GDK", "KRK"));
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}