package com.example.FlatironCapstoneLoveWicks.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandleDTO {
    private String name;
    private String description;
    private byte[] photoId;
    private double price;
    private boolean inStock;
}
