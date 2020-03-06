package com.apps.dao.extend;

import java.util.List;

import com.apps.bean.extend.HouseExtend;

public interface HouseExtendMapper {
	List<HouseExtend> selectHouseExtendAll();
	List<HouseExtend> selectHouseExtendById(String id);
}
