package com.jinanluke.file.excel.service.impl;

import com.jinanluke.file.excel.data.DemoData;
import com.jinanluke.file.excel.service.ExcelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description excel的通用实现类
 *
 * @author jinyun liu
 * @date 2020/4/3
 */
@Service
public class ExcelServiceImpl implements ExcelService {
















    /**
     * prepare excel data
     *
     * @return data list.
     */
    private List<DemoData> data() {
        List<DemoData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }

        return list;
    }
}
