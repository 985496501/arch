package com.jinanluke.file.excel.data;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description demo data
 *
 * @author jinyun liu
 * @date 2020/4/3
 */
@Data
public class DemoData {
    @ExcelProperty("姓名")
    private String string;

    @ExcelProperty("日期")
    private Date date;

    @ExcelProperty("分值")
    private Double doubleData;

    @ExcelIgnore
    private Double ignore;
}
