package com.example.FlatironCapstoneLoveWicks.DTO;

import com.example.FlatironCapstoneLoveWicks.model.Candle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long customerId;
    private Boolean open;
    private List<Long> candles;
}
