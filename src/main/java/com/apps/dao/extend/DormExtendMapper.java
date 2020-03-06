package com.apps.dao.extend;

import java.util.List;

import com.apps.bean.Dorm;
import com.apps.bean.extend.DormExtend;

public interface DormExtendMapper {
	List<Dorm> selectDormByHouIdAll(String houId);
	DormExtend selectDormExtendById(String dorId);
}
