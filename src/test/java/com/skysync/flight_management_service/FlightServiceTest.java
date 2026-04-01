package com.skysync.flight_management_service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class) // Mockito simülatörünü aktif et
public class FlightServiceTest {

    @Mock
    private FlightRepository flightRepository; // Gerçek veritabanı yerine sahtesini (mock) oluştur

    @InjectMocks
    private FlightService flightService; // Servisi oluştur ve yukarıdaki sahteyi içine "enjekte" et

    @Test
    void shouldRejectInvalidFlightTimes() {
        // Artık flightService hazır! İçindeki repository simüle edildi.
        boolean result = flightService.isValidFlight(1200, 1000, 500.0);
        assertFalse(result, "Kalkış varıştan sonra olamaz!");
    }

    @Test
    void shouldRejectNegativePrice() {
        boolean result = flightService.isValidFlight(1000, 1200, -50.0);
        assertFalse(result, "Fiyat negatif olamaz!");
    }

    @Test
    void shouldAcceptCorrectFlight() {
        // Doğru senaryo (Happy Path)
        boolean result = flightService.isValidFlight(1000, 1200, 750.0);

        assertTrue(result, "Doğru uçuş bilgileri sistem tarafından onaylanmalıydı!");
    }
}


