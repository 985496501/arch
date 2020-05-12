package com.jinanluke.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author jinyun liu
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("asset")
public class AssetDO {
    @TableId
    private Long id;

    private BigDecimal asset;

    @TableLogic
    private Integer deleted;
}
