package com.fitness.backend.service;

import com.fitness.backend.entity.CommonResult;
import com.fitness.backend.entity.EmployeesBasisEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name= "fitness-backend-service")
public interface EmployeesBasisFeignService {


	/**
	 * 查询
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/select", method = RequestMethod.POST)
	CommonResult select(@RequestBody EmployeesBasisEntity entity) ;

	/**
	 * 模糊查询
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/likeSelect", method = RequestMethod.POST)
	CommonResult likeSelect(@RequestBody EmployeesBasisEntity entity) ;

	/**
	 * 更新
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/update", method = RequestMethod.POST)
	CommonResult update(@RequestBody EmployeesBasisEntity entity) ;

	/**
	 * 添加
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/add", method = RequestMethod.POST)
	CommonResult add(@RequestBody EmployeesBasisEntity entity) ;

	/**
	 * 删除
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/delete", method = RequestMethod.POST)
	CommonResult delete(@RequestBody EmployeesBasisEntity entity) ;

	/**
	 * 批量增加
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/batchAdd", method = RequestMethod.POST)
	CommonResult batchAdd(@RequestBody List<EmployeesBasisEntity> list) ;

	/**
	 * 批量删除
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/batchDelete", method = RequestMethod.POST)
	CommonResult batchDelete(@RequestBody List<EmployeesBasisEntity> list) ;

	/**
	 * 批量更新
	 *
	 * @return
	 */
	@RequestMapping(value = "service/employeesBasis/batchUpdate", method = RequestMethod.POST)
	CommonResult batchUpdate(@RequestBody List<EmployeesBasisEntity> list) ;


}
