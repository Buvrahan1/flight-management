package com.skysync.flight_management_service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service // Bu sinifin bir "is mantigi" katmani oldugunu Spring'e bildirir
@RequiredArgsConstructor // Repository'yi otomatik olarak "inject" (dahil) eder
public class FlightService {

    private final FlightRepository flightRepository;

    // Veritabanindaki tüm ucusları getiren metod
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    // Bu metod insanların hata yapmasını engelleyen "Kule" görevini görür
    public boolean isValidFlight(int departure, int arrival, double price) {
        if (departure >= arrival) {
            return false; // Zaman makinesi henüz icat edilmedi!
        }
        if (price <= 0) {
            return false; // Bedava uçuş olmaz (şirket batar!)
        }
        return true; // Her şey yolunda, uçuş temiz.
    }
}