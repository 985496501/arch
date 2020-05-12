package com.jinanluke.controller;


import cn.hutool.log.StaticLog;
import com.jinanluke.service.AsyncService;
import com.jinanluke.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jinyun liu
 */
@RestController
@RequestMapping("gate")
public class GateController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("async")
    public String asyncTest() {
        StaticLog.info("已经进入异步请求处理器");
        asyncService.async();

        StaticLog.info("业务逻辑执行完毕，返回response.");
        return "异步调用返回结果...";
    }

    @Autowired
    private TransactionService transactionService;

    @GetMapping("transactional")
    public String transactionTest() {
        //transactionService.transaction();
        return "成功测试了事务...";
    }
}
