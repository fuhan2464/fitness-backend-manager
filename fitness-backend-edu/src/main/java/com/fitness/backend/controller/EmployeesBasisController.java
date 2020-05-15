package com.fitness.backend.controller;

import com.fitness.backend.constant.ResultConstant;
import com.fitness.backend.entity.CommonResult;

import com.fitness.backend.entity.EmployeesBasisEntity;

import com.fitness.backend.service.EmployeesBasisFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Api(tags = "employeesBasis接口")
@RequestMapping("employeesBasis")
@CrossOrigin(origins = "*",allowCredentials = "true",allowedHeaders = "*")
public class EmployeesBasisController {

	@Autowired
	EmployeesBasisFeignService employeesBasisFeignService;

	/**
	 * 查询
	 *
	 * @return
	 */
	@ApiOperation(value = "查询")
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public CommonResult select(@RequestBody EmployeesBasisEntity entity) {
		CommonResult commonResult=employeesBasisFeignService.select(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG, commonResult.getResult());
	}

	/**
	 * 模糊查询
	 *
	 * @return
	 */
	@ApiOperation(value = "模糊查询")
	@RequestMapping(value = "/likeSelect", method = RequestMethod.POST)
	public CommonResult likeSelect(@RequestBody EmployeesBasisEntity entity) {
		CommonResult commonResult=employeesBasisFeignService.likeSelect(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG, commonResult.getResult());
	}

	/**
	 * 更新
	 *
	 * @return
	 */
	@ApiOperation(value = "更新")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public CommonResult update(@RequestBody EmployeesBasisEntity entity) {
		employeesBasisFeignService.update(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 添加
	 *
	 * @return
	 */
	@ApiOperation(value = "添加")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CommonResult add(@RequestBody EmployeesBasisEntity entity) {
		employeesBasisFeignService.add(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 删除
	 *
	 * @return
	 */
	@ApiOperation(value = "删除")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public CommonResult delete(@RequestBody EmployeesBasisEntity entity) {
		employeesBasisFeignService.delete(entity);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 批量增加
	 *
	 * @return
	 */
    @ApiIgnore
	@RequestMapping(value = "/batchAdd", method = RequestMethod.POST)
	public CommonResult batchAdd(@RequestBody List<EmployeesBasisEntity> list) {
		employeesBasisFeignService.batchAdd(list);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 批量删除
	 *
	 * @return
	 */
	@ApiIgnore
	@RequestMapping(value = "/batchDelete", method = RequestMethod.POST)
	public CommonResult batchDelete(@RequestBody List<EmployeesBasisEntity> list) {
		employeesBasisFeignService.batchDelete(list);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}

	/**
	 * 批量更新
	 *
	 * @return
	 */
	@ApiIgnore
	@RequestMapping(value = "/batchUpdate", method = RequestMethod.POST)
	public CommonResult batchUpdate(@RequestBody List<EmployeesBasisEntity> list) {
		employeesBasisFeignService.batchUpdate(list);
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
	}


}
