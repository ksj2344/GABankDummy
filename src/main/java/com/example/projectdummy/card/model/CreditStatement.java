package com.example.projectdummy.card.model;

import lombok.Builder;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Setter
public class CreditStatement {
    private Long creditId;
    private Long creditCardId;
    private String place;
    private int flag;
    private int state;
    private String exploiter;
    private Integer accumPoint;
    private BigDecimal discount;
    private int fee;
    private int ogAmount;
    private int installment;
    private int interestFree;
    private String uYear;
    private String uMonth;
    private String uDay;
    private LocalDateTime createdAt;
}
