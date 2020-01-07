package com.lvtaipeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lvtaipeng.pojo.User;

public interface BaseDao<T> {

	/**
	 * 按条件查询
	 */
	List<User> select(User user);
	
	/*
	 * 
	 * 根据id查询
	 * 
	 */
	User selectById(Integer id);
	
	/**
	 * 新增
	 */
	int insert(User user);
	
	/**
	 * 修改
	 */
	int update(User user);
	
	/***
	 * 删除
	 */
	int delete(@Param("ids")String ids);
}
