package com.skysync.flight_management_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor // Repository'yi buraya otomatik baglar
public class DataInitializer implements CommandLineRunner {

    private final FlightRepository flightRepository;

    @Override
    public void run(String... args) throws Exception {
        // Eğer veritabanı boşsa örnek veriler ekleyelim
        if (flightRepository.count() == 0) {
            flightRepository.save(new Flight(null, "TK1923", "IST", "JFK", "ON_TIME"));
            flightRepository.save(new Flight(null, "PC2024", "SAW", "ESB", "DELAYED"));
            System.out.println(">> Test ucus verileri veritabanina kaydedildi!");
        }
    }
}