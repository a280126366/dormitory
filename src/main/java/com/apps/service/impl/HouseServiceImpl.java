package com.apps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.bean.House;
import com.apps.bean.HouseExample;
import com.apps.bean.extend.HouseExtend;
import com.apps.dao.HouseMapper;
import com.apps.dao.extend.HouseExtendMapper;
import com.apps.service.IHouseService;
import com.apps.utils.CustomerException;

@Service
public class HouseServiceImpl implements IHouseService{
	
	@Resource
	private HouseMapper houseMapper;
	@Resource
	private HouseExtendMapper houseExtendMapper;
	
	/**
	 * 根据楼房号进行删除楼房
	 * */
	@Override
	public int deleteById(String houId) {
		
		if(houseMapper.selectByPrimaryKey(houId)!=null) {
			houseMapper.deleteByPrimaryKey(houId);
			return 1;
		}
		return 0;
	}

	/**
	 * 保存或更新楼房信息
	 * */
	@Override
	public void saveOrUpdate(House house) throws CustomerException {
		if(houseMapper.selectByPrimaryKey(house.getHouId())!=null) {
			houseMapper.updateByPrimaryKey(house);
		}else {
			houseMapper.insert(house);
		}
	}

	/**
	 * 查询所有楼房
	 * */
	@Override
	public List<House> findAll() {
		HouseExample houseExample = new HouseExample();
		return houseMapper.selectByExample(houseExample);
	}

	/**
	 * 根据楼房号查询楼房
	 * */
	@Override
	public House findHouseById(String houId) {
		return houseMapper.selectByPrimaryKey(houId);
	}
	
	/**
	 * 级联查询所有楼房
	 * */
	@Override
	public List<HouseExtend> findHouseExtendAll() {
		return houseExtendMapper.selectHouseExtendAll();
	}

	/**
	 * 根据楼房号级联查询楼房 
	 * */
	@Override
	public List<HouseExtend> findHouseExtendById(String id) {
		return houseExtendMapper.selectHouseExtendById(id);
	}

}
