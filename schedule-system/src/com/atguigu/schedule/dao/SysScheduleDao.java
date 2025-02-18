package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 *
 */
public interface SysScheduleDao {

    /**
     * 用于向数据中增加一条日程记录
     * @param schedule 日称数据以SysSchedule实体类对象形式入参
     * @return 返回影响数据库激励的行数，行数为0说明增加失败，行数大于0说明增加成功
     */
    int addSchedule(SysSchedule schedule);

    /**
     * 查询所有用户的所有日程
     * @return 讲所有日程放入一个List<SysSchedule>集合中返回
     */
    List<SysSchedule> findAll();
}
