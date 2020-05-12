package com.jinanluke.reflect.bean;

import java.math.BigDecimal;

/**
 * @author jinyun liu
 * @date 2020/5/1
 */
public class Phone {
    private String brand;

    private BigDecimal value;

    private Phone(){

    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", value=" + value +
                '}';
    }
}
