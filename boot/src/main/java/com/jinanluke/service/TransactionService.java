package com.jinanluke.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jinanluke.dao.Test2Mapper;
import com.jinanluke.entity.TestDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * spring-transaction
 *
 * @author jinyun liu
 */
@Service
public class TransactionService extends ServiceImpl<Test2Mapper, TestDO> {
    @Resource
    private Test2Mapper test2Mapper;

}
