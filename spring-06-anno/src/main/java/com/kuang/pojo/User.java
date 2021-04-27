package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author zhangdongwei
 */
//等价于    <bean id="user" class="com.kuang.pojo.User"/>
//@Component 组件

@Component
@Scope
public class User {

    //相当于<property name="name" value="张冬伟1"/>
    @Value("张冬伟1")
    public String name;
}
