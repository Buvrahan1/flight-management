package com.skysync.flight_management_service;

import jakarta.persistence.*;
import lombok.*;

@Entity // Bu bir veritabani tablosudur demek
@Table(name = "flights") // Tablonun adi 'flights' olsun
@Getter // Getter metodlarini otomatik olustur (Lombok sayesinde)
@Setter // Setter metodlarini otomatik olustur
@NoArgsConstructor // Parametresiz constructor olustur
@AllArgsConstructor // Tum alanlari iceren constructor olustur.
public class Flight {

    @Id // Her tablonun bir anahtari (ID) olmali.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID'yi 1, 2, 3 diye otomatik artir.
    private Long id;

    private String flightNumber; // Ucuş kodu
    private String origin;       // Kalkis yeri
    private String destination;  // Varis yeri
    private String status;       // Ucusun durumu (ON_TIME, DELAYED vs.)
}