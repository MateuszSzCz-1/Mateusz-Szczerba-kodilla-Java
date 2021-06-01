package com.kodilla.good.patterns.challenges.FlightServis;

public class Run  {
    public static void main(String[] args) {
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        flightSearchEngine.flightsFromChosenAirport("GDK");
        flightSearchEngine.flightsToChosenAirport("WRO");
        flightSearchEngine.connectingFlights("GDK","WRO");
    }
}
