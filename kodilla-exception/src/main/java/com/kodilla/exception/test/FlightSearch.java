package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Moscow", true);
        airports.put("Berlin", false);
        airports.put("Milan", false);
        airports.put("Warsaw", true);

        if (flight != null) {
            if (airports.containsKey(flight.getArrivalAirport()) || airports.containsKey(flight.getDepartureAirport())) {
                System.out.println(airports.get(flight.getArrivalAirport()) ?
                        "Airport " + flight.getArrivalAirport()  + " is available for arrival"
                        : "Airport " + flight.getArrivalAirport()  + " is available only for departure");
            } else {
                throw new RouteNotFoundException("No available airports found");
            }
        } else {
            throw new RouteNotFoundException("Provided flight object is not valid");
        }
    }
}
