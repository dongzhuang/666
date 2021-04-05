package com.dong.baomidou.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author DONG
 * @since 2021-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 起始时间
     */
    private LocalDateTime startTime;

    /**
     * 终止时间
     */
    private LocalDateTime endTime;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 导出时间
     */
    private String exportTime;

    /**
     * 收入钱数
     */
    private BigDecimal incomeAmount;

    /**
     * 支出钱数
     */
    private BigDecimal expendAmount;

    /**
     * 中性交易
     */
    private BigDecimal neutralTrade;

    /**
     * 收入笔数
     */
    private Integer incomeCount;

    /**
     * 支出笔数
     */
    private Integer expendCount;

    /**
     * 中性交易笔数
     */
    private Integer neutralCount;


}
