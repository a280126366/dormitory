package com.apps.web.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.bean.House;
import com.apps.service.IHouseService;
import com.apps.utils.Message;
import com.apps.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "楼房相关接口",tags = "house")
@RestController
@RequestMapping("/house")
public class HouseController {
	
	@Autowired
	private IHouseService houseService;
	
	@ApiOperation(value = "根据楼房号删除楼房信息")
	@DeleteMapping(value = "deleteById")
	public Message articleDelete(String id) {
		if(houseService.deleteById(id)==1) {
			return MessageUtil.success("success");
		}
		return MessageUtil.error("楼房号不存在");
	}
	
	@ApiOperation(value = "保存或更新楼房信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "houId", value = "楼房号",paramType = "form",required = true),
            @ApiImplicitParam(name = "floor", value = "楼层数",paramType = "form",required = true),
            @ApiImplicitParam(name = "room", value = "房间数",paramType = "form",required = false),
            @ApiImplicitParam(name = "houNum", value = "应住人数",paramType = "form",required = false),
            @ApiImplicitParam(name = "houInNum", value = "实住人数",paramType = "form",required = false),
    })
    @PostMapping(value = "saveOrUpdate", produces = "application/json;charset=UTF-8")
    public Message saveOrUpdate(
    		@NotNull String houId,
            @NotNull int floor,
            int room,
            int houNum,
            int houInNum){
        House house = new House();
        house.setHouId(houId);
        house.setFloor(floor);
        house.setRoom(room);
        house.setHouNum(houNum);
        house.setHouInNum(houInNum);
        houseService.saveOrUpdate(house);
        return MessageUtil.success("更新成功");
    }
	
	@ApiOperation(value = "查询所有楼房")
	@PostMapping(value = "findAll")
	public Message findAll() {
		return MessageUtil.success(houseService.findAll());
	}
	
	@ApiOperation(value = "根据ID查询楼房")
	@PostMapping(value = "findHouseById")
	public Message findHouseById(String id) {
		return MessageUtil.success(houseService.findHouseById(id));
	}
	
	@ApiOperation(value = "级联查询所有楼房")
	@PostMapping(value = "findHouseExtendAll")
	public Message findHouseExtendAll() {
		return MessageUtil.success(houseService.findHouseExtendAll());
	}
	
	@ApiOperation(value = "根据ID级联查询楼房")
	@PostMapping(value = "findHouseExtendById")
	public Message findHouseExtendById(String id) {
		return MessageUtil.success(houseService.findHouseExtendById(id));
	}
}
