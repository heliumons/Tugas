package com.upscale.java06.dto;

import com.upscale.java06.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionRequest {
    private String note;
    private Double amount;
}
