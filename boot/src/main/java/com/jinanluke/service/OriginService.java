package com.jinanluke.service;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jinanluke.dao.AssetMapper;
import com.jinanluke.dao.Test2Mapper;
import com.jinanluke.dto.OptimizeSelect;
import com.jinanluke.entity.AssetDO;
import com.jinanluke.entity.TestDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原生
 *
 * @author jinyun liu
 */
@Service
public class OriginService extends ServiceImpl<Test2Mapper, TestDO> {
    @Autowired
    private Test2Mapper test2Mapper;
    @Autowired
    private AssetMapper assetMapper;

    @Transactional(rollbackFor = Exception.class)
    public String saveOpen(String name) {
        TestDO testDO = new TestDO(1L, "jinyunliu", 1, 0);
        AtomicInteger integer = new AtomicInteger();
        Page<TestDO> page = new Page<>();
        return null;
    }


    public void asyncSelectSyncWait() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始查询时间： " + startTime);

        synchronizedSelect();

        long endTime = System.currentTimeMillis();
        System.out.println("结束查询时间: " + endTime);
        System.out.println("总共执行时间: " + (endTime - startTime));
    }

    private void synchronizedSelect() {
        TestDO testDO = selectDomain();
        List<AssetDO> list = selectAssetDO();

        OptimizeSelect build = OptimizeSelect.builder().testDO(testDO).assetDOs(list).build();
        System.out.println(JSONUtil.parse(build).toString());
        // 4320
    }

    public void asynchronizedSelect() {
        // Future
        //Threa

    }

    private TestDO selectDomain() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return test2Mapper.selectById(1L);
    }

    private List<AssetDO> selectAssetDO() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return assetMapper.selectList(new QueryWrapper<AssetDO>().eq("user_id", 1L));
    }
}
