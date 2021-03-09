package com.miu.service;

import com.miu.dao.DaoTest;

/**
 * service 测试方法 返回字符串
 *
 * 子模块  service （处理业务逻辑）
 *
 * service依赖 dao、entity
 */
public class ServiceTest {
    public String showService(){
        // 创建DaoTest对象
        DaoTest daoTest = new DaoTest();
        return daoTest.showDao();
    }
}
