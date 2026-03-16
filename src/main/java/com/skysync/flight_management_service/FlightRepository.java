package com.skysync.flight_management_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    // Sadece bu kadar! JpaRepository sayesinde;
    // save(), findAll(), findById(), delete() gibi metodlar otomatik geldi.
}