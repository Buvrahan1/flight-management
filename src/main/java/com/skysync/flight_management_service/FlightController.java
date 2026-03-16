package com.skysync.flight_management_service;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // FlightService'i buraya baglar

public class FlightController {

    private final FlightService flightService;

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        return Map.of(
                "status", "UP",
                "message", "Sky-Sync Aktif: Hava Trafik Kontrol Sistemine Hoş Geldiniz! Kaptan Buğrahan konuşuyor...",
                "java_version", System.getProperty("java.version"),
                "developer", "Bugrahan AYDIN"
        );
    }

    // Eski status metodun dursun, altına bunu ekle
    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping("/flights")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

}