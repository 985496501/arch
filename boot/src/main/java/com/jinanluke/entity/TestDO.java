package com.jinanluke.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jinyun liu
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("test")
public class TestDO {
    @TableId
    private Long id;

    private String userName;

    private Integer age;

    @TableLogic
    private Integer deleted;
}
