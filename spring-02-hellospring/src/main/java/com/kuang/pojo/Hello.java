package com.kuang.pojo;

/**
 * Author zhangdongwei
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public Hello setStr(String str) {
        this.str = str;
        return this;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
