package com.apps.web.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.bean.Dorm;
import com.apps.service.IDormService;
import com.apps.utils.Message;
import com.apps.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "寝室相关接口",tags = "dorm")
@RestController
@RequestMapping("/dorm")
public class DormController {
	
	@Autowired
	private IDormService dormService;
	
	@ApiOperation(value = "根据寝室号删除寝室信息")
	@DeleteMapping(value = "deleteById")
	public Message dormDelete(String id) {
		if(dormService.deleteById(id)==1) {
			return MessageUtil.success("success");
		}
		return MessageUtil.error("寝室号不存在");
	}
	
	@ApiOperation(value = "保存或更新寝室信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dorId", value = "寝室号",paramType = "form",required = true),
            @ApiImplicitParam(name = "dorQua", value = "居住性别",paramType = "form",required = true),
            @ApiImplicitParam(name = "dorCost", value = "住宿费",paramType = "form",required = false),
            @ApiImplicitParam(name = "dorNum", value = "应住人数",paramType = "form",required = false),
            @ApiImplicitParam(name = "dorInNum", value = "实住人数",paramType = "form",required = false),
            @ApiImplicitParam(name = "dorHouid", value = "楼房号",paramType = "form",required = false),
    })
    @PostMapping(value = "saveOrUpdate", produces = "application/json;charset=UTF-8")
    public Message saveOrUpdate(
    		@NotNull String dorId,
            @NotNull String dorQua,
            Double dorCost,
            int dorNum,
            int dorInNum,
            String dorHouid){
        Dorm dorm = new Dorm();
        dorm.setDorId(dorId);
        dorm.setDorQua(dorQua);
        dorm.setDorCost(dorCost);
        dorm.setDorNum(dorNum);
        dorm.setDorInNum(dorInNum);
        dorm.setDorHouid(dorHouid);
        dormService.saveOrUpdate(dorm);
        return MessageUtil.success("更新成功");
    }
	
	@ApiOperation(value = "根据楼房号查询所有寝室")
	@PostMapping(value = "findDormByHouIdAll")
	public Message findDormByHouIdAll(String houId) {
		return MessageUtil.success(dormService.findDormByHouIdAll(houId));
	}
	
	@ApiOperation(value = "根据ID查询宿舍")
	@PostMapping(value = "findDormById")
	public Message findDormById(String dorId) {
		return MessageUtil.success(dormService.findDormById(dorId));
	}
	
	@ApiOperation(value = "根据ID级联查询宿舍")
	@PostMapping(value = "findHouseExtendById")
	public Message findHouseExtendById(String dorId) {
		return MessageUtil.success(dormService.findDormExtendById(dorId));
	}
}
