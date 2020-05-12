package com.jinanluke.controller;

import com.jinanluke.service.OriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 异步事务
 * @author jinyun liu
 * @date 2020/4/3
 */
@RestController
public class TxController {
    @Autowired
    private OriginService originService;

    @GetMapping("tx")
    public String asyncTx() {
        //originService.async();
        return "";
    }

    @GetMapping("asyncSelectSyncWait")
    public String asyncSelectSyncWait() {
        originService.asyncSelectSyncWait();
        return "异步查询同步等待";
    }
}
