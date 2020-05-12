package com.jinanluke.task;

import com.jinanluke.entity.UserDO;
import org.springframework.stereotype.Service;

/**
 * @description 任务
 *
 * @author jinyun liu
 * @date 2020/4/18
 */
@Service
public class Task {

    public String getOrderNumber() {
        return "123456";
    }

    public UserDO getUser() {
        return new UserDO("jinyunliu", 2);
    }
}
