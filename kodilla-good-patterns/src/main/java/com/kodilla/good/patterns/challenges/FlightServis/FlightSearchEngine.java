package com.kodilla.good.patterns.challenges.FlightServis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {
        FligthsDatabase fligthsDatabase = new FligthsDatabase();

        public FlightSearchEngine(FligthsDatabase fligthsDatabase) {
            this.fligthsDatabase = fligthsDatabase;
        }

        public FlightSearchEngine() {

        }

        public Set<Flight> flightsFromChosenAirport(String departureAirport) {
            Set<Flight> flightsFound = fligthsDatabase.getFlights().stream().
                    filter(flight -> flight.getDepartureAirport().equals(departureAirport)).
                    collect(Collectors.toSet());

            System.out.println("From chosen departure airport " + departureAirport + " You can get directly to:");
            for (Flight f : flightsFound) {
                System.out.println(f.arrivalAirport.toString());
            }

            return flightsFound;
        }

        public Set<Flight> flightsToChosenAirport(String arrivalAirport) {
            Set<Flight> flightsFound = fligthsDatabase.getFlights().stream().
                    filter(flight -> flight.getArrivalAirport().equals(arrivalAirport)).
                    collect(Collectors.toSet());

            System.out.println("To chosen arrival airport " + arrivalAirport + " You can get directly from:");
            for (Flight f : flightsFound) {
                System.out.println(f.departureAirport.toString());
            }

            return flightsFound;
        }
        public Set<Flight> connectingFlights(String departureAirport, String arrivalAirport) {
            Set<Flight> flightsFound = new HashSet<>();
            fligthsDatabase.getFlights().stream().
                    filter(flight -> flight.getDepartureAirport().equals(departureAirport)).
                    forEach(flight -> {
                        List<Flight> availableConnections = fligthsDatabase.getFlights().stream().
                                filter(flight1 -> (flight.getArrivalAirport().equals(flight1.getDepartureAirport())
                                        && flight1.getArrivalAirport().equals(arrivalAirport))).
                                collect(Collectors.toList());

                        if (availableConnections.size() > 0) {
                            flightsFound.add(flight);
                            flightsFound.addAll(availableConnections);

                        }
                    });
            System.out.println("There are no direct flight between " + departureAirport + " and " + arrivalAirport);
            System.out.println("However we found that You can get to " + arrivalAirport + " from " + departureAirport +
                    " with those connecting flights:");
            for (Flight f : flightsFound) {
                System.out.println(f.toString());
            }

            return flightsFound;
        }

        public FligthsDatabase getFligthsDatabase() {
            return fligthsDatabase;
        }
}