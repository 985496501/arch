package com.jinanluke.dto;

import com.jinanluke.entity.AssetDO;
import com.jinanluke.entity.TestDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description 优化查询
 *
 * @author jinyun liu
 * @date 2020/4/3
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptimizeSelect {
    private TestDO testDO;

    private List<AssetDO> assetDOs;
}
