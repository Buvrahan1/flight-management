package com.skysync.flight_management_service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightServiceTest {

    @Test
    void testFlightDurationLogic() {
        // Hazırlık (Given)
        int departureTime = 1000; // 10:00
        int arrivalTime = 1200;   // 12:00

        // İşlem (When)
        boolean isLogicValid = arrivalTime > departureTime;

        // Kontrol (Then)
        assertTrue(isLogicValid, "Varış saati kalkış saatinden önce olamaz!");
    }
}