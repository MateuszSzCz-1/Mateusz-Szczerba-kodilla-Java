package com.kodilla.exception.test;

public class FlightSearchRunner {
        public static void main(String[] args) {
            Flight flight1 = new Flight("Milano", "Warsaw");
            Flight flight2 = new Flight("Moscow", "Berlin");
            Flight flight3 = new Flight("Roma", "Tokyo");
            Flight flight4 = null;
            FlightSearch flightSearch = new FlightSearch();

            try {
                flightSearch.findFlight(flight1);
                flightSearch.findFlight(flight2);
                flightSearch.findFlight(flight4);
                flightSearch.findFlight(flight3);
            } catch (RouteNotFoundException e) {
                System.out.println("Exception "  + e + " Executed  program still running");
            }
        }
}
