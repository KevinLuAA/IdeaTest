package com.miu.dao;

import com.miu.entity.EntityTest;

/**
 * Dao 测试方法 返回字符串
 *
 * 子模块  dao  （用于持久化数据跟数据库交互）
 *
 * dao依赖 entity
 */
public class DaoTest {
    public String showDao(){
        // 创建EntityTest对象
        EntityTest entityTest = new EntityTest();
        return entityTest.showEntity()+"：我是dao!";
    }
}
