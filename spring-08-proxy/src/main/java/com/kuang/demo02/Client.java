package com.kuang.demo02;

/**
 * Author zhangdongwei
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.delete();
    }
}
