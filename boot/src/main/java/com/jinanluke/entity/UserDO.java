package com.jinanluke.entity;

import com.jinanluke.annotation.FieldFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体
 *
 * @author jinyun liu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {
    @FieldFilter(name = "jinyunliu")
    private String userName;

    private Integer age;
}
