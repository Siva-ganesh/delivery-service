package com.example.booking.delivery.controller;

import com.example.booking.delivery.dto.InvoiceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    private final Random random = new Random();

    @PostMapping("/invoice")
    public ResponseEntity<String> processInvoice(@RequestBody InvoiceDto invoiceDto) {

        int randomValue = random.nextInt(5);
        return switch (randomValue) {
            case 0, 2, 3 -> ResponseEntity.ok("Success");
//            case 0 -> ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Fail");
            case 1 -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
//            case 2 -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
//            case 3 -> ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Service Not Available");
            case 4 -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized access");
            default -> ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request");
        };
    }
}
