package com.apps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.bean.Dorm;
import com.apps.bean.extend.DormExtend;
import com.apps.dao.DormMapper;
import com.apps.dao.extend.DormExtendMapper;
import com.apps.service.IDormService;
import com.apps.utils.CustomerException;

@Service
public class DormServiceImpl implements IDormService{

	@Resource
	private DormMapper dormMapper;
	@Resource
	private DormExtendMapper dormExtendMapper;
	
	/**
	 * 根据寝室号删除寝室
	 * */
	@Override
	public int deleteById(String dorId) {
		if(dormMapper.selectByPrimaryKey(dorId)!=null) {
			dormMapper.deleteByPrimaryKey(dorId);
			return 1;
		}
		return 0;
	}
	
	/**
	 * 保存或更新寝室信息
	 * */
	@Override
	public void saveOrUpdate(Dorm dorm) throws CustomerException {
		if(dormMapper.selectByPrimaryKey(dorm.getDorId())!=null) {
			dormMapper.updateByPrimaryKey(dorm);
		}else {
			dormMapper.insert(dorm);
		}
	}

	/**
	 * 根据楼房号查询所有寝室
	 * */
	@Override
	public List<Dorm> findDormByHouIdAll(String houId) {
		return dormExtendMapper.selectDormByHouIdAll(houId);
	}

	
	/**
	 * 根据寝室号查询寝室
	 * */
	@Override
	public Dorm findDormById(String dorId) {
		return dormMapper.selectByPrimaryKey(dorId);
	}

	/**
	 * 根据寝室号级联查询寝室
	 * */
	@Override
	public DormExtend findDormExtendById(String dorId) {
		return dormExtendMapper.selectDormExtendById(dorId);
	}
	
}
