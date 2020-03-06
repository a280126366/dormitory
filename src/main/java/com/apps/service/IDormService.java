package com.apps.service;

import java.util.List;

import com.apps.bean.Dorm;
import com.apps.bean.extend.DormExtend;
import com.apps.utils.CustomerException;
//寝室类接口
public interface IDormService {
	public int deleteById(String dorId);
	public void saveOrUpdate(Dorm dorm) throws CustomerException;
	//根据楼房号查询所有寝室
	public List<Dorm> findDormByHouIdAll(String houId);
	//public List<DormExtend> findDormExtendAll();
	public Dorm findDormById(String dorId);
	public DormExtend findDormExtendById(String id);
}
