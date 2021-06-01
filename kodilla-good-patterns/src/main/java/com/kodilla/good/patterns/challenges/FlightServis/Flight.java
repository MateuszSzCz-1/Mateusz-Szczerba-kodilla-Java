package com.kodilla.good.patterns.challenges.FlightServis;

import java.util.Objects;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        if (!getDepartureAirport().equals(flight.getDepartureAirport())) return false;
        return getArrivalAirport().equals(flight.getArrivalAirport());
    }


    public String toString() {
        return departureAirport + " -> " + arrivalAirport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }
}
