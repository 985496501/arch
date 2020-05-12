package com.jinanluke.controller;

import com.jinanluke.service.OriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 原生的
 *
 * @author jinyun liu
 */
@RestController
public class OriginController {
//    @Autowired
//    private OriginService originService;

    @GetMapping("origin")
    public String open() {
        //originService.saveOpen("");
        return "执行完了事务";
    }

}
