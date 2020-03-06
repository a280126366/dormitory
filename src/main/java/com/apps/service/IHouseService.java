package com.apps.service;

import java.util.List;

import com.apps.bean.House;
import com.apps.bean.extend.HouseExtend;
import com.apps.utils.CustomerException;

//楼房类接口
public interface IHouseService {
	public int deleteById(String houId);
	public void saveOrUpdate(House house) throws CustomerException;
	public List<House> findAll();
	public List<HouseExtend> findHouseExtendAll();
	public House findHouseById(String houId);
	public List<HouseExtend> findHouseExtendById(String id);
}
