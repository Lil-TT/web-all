package com.atguigu.schedule.dao;

/*
* Data access Object 数据访问对象
* 该类中用于定义针对表格的CURD方法
* DAO层一般需要定义接口和实现类
*
* */

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserDao {
    /**
     * 向数据库中增加一条用户记录的方法
     * @param sysUser 要增加的记录的username 和 user_pwd 字段以SysUser 实体类的=对象的形式接收
     * @return 增加成功返回1 失败返回0
     */
    int addSysUser(SysUser sysUser);


    SysUser findByUsername(String username);
}
