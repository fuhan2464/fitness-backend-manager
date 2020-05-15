package com.fitness.backend.controller;

import com.fitness.backend.constant.ResultConstant;
import com.fitness.backend.entity.CommonResult;
import com.fitness.backend.entity.EmployeesBasisEntity;
import com.fitness.backend.service.IEmployeesBasisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Api(tags = "employeesBasis接口")
@RequestMapping
public class EmployeesBasisRestService {


	@Autowired
	private IEmployeesBasisService service;

	
	/**
	 * 查询
	 *
	 * @return
	 */
	@ApiOperation(value = "查询")
	@RequestMapping(value = "service/employeesBasis/select", method = RequestMethod.POST)
	public CommonResult select(@RequestBody EmployeesBasisEntity entity) {
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG, service.select(entity));
	}

	/**
	 * 模糊查询
	 *
	 * @return
	 */
	@ApiOperation(value = "模糊查询")
	@RequestMapping(value = "service/employeesBasis/likeSelect", method = RequestMethod.POST)
	public CommonResult likeSelect(@RequestBody EmployeesBasisEntity entity) {
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG, service.likeSelect(entity));
	}

	/**
	 * 更新
	 *
	 * @return
	 */
	@ApiOperation(value = "更新")
	@RequestMapping(value = "service/employeesBasis/update", method = RequestMethod.POST)
	public CommonResult update(@RequestBody EmployeesBasisEntity entity) {
		service.update(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 添加
	 *
	 * @return
	 */
	@ApiOperation(value = "添加")
	@RequestMapping(value = "service/employeesBasis/add", method = RequestMethod.POST)
	public CommonResult add(@RequestBody EmployeesBasisEntity entity) {
		service.add(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 删除
	 *
	 * @return
	 */
	@ApiOperation(value = "删除")
	@RequestMapping(value = "service/employeesBasis/delete", method = RequestMethod.POST)
	public CommonResult delete(@RequestBody EmployeesBasisEntity entity) {
		service.delete(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 批量增加
	 *
	 * @return
	 */
    @ApiIgnore
	@RequestMapping(value = "service/employeesBasis/batchAdd", method = RequestMethod.POST)
	public CommonResult batchAdd(@RequestBody List<EmployeesBasisEntity> list) {
		service.batchAdd(list);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 批量删除
	 *
	 * @return
	 */
	@ApiIgnore
	@RequestMapping(value = "service/employeesBasis/batchDelete", method = RequestMethod.POST)
	public CommonResult batchDelete(@RequestBody List<EmployeesBasisEntity> list) {
		service.batchDelete(list);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 批量更新
	 *
	 * @return
	 */
	@ApiIgnore
	@RequestMapping(value = "service/employeesBasis/batchUpdate", method = RequestMethod.POST)
	public CommonResult batchUpdate(@RequestBody List<EmployeesBasisEntity> list) {
		service.batchUpdate(list);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}
	
	/**
	 * 导出excel
	 *
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("service/employeesBasis/exportExcel")
	public void exportExcel(EmployeesBasisEntity entity, HttpServletResponse response) {
		service.exportExcel(entity, response);
	}

}
