package com.loha.flippedclassroom.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * POJO
 *
 * @author zhoujian
 * @date 2018/12/15
 */
@Getter
@Setter
public class RoundScore {
    private Integer roundId;
    private Integer teamId;
    private BigDecimal totalScore;
    private BigDecimal presentationScore;
    private BigDecimal questionScore;
    private BigDecimal reportScore;

    private Round round;
}
