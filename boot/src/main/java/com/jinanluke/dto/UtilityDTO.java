package com.jinanluke.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  create bean simulating lombok, using
 *  Builder Pattern.
 *
 * @author jinyun liu
 * @date 2020/4/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilityDTO {
    private String result;

    UtilityDTO(Builder builder) {
        this.result = builder.getResult();
    }

    /**
     * 使用了静态内部类
     */
    public static class Builder {
        private String result;

        public Builder result(String res) {
            result = res;
            return this;
        }

        public String getResult() {
            return this.result;
        }

        public UtilityDTO build() {
            return new UtilityDTO(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

}
