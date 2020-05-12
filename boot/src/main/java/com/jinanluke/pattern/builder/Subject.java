package com.jinanluke.pattern.builder;

/**
 * @author jinyun liu
 * @description 主体
 * @date 2020/5/1
 */
public class Subject {
    private String userName;
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static class Builder {
        private String userName;
        private Integer age;

        private static Subject subject = new Subject();

        public static Subject userName(String userName) {
            subject.setUserName(userName);
            return subject;
        }

        public static Subject age(Integer age) {
            subject.setAge(age);
            return subject;
        }
    }


    public Subject build() {
        return this;
    }

}
