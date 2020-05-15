package com.fitness.backend.controller;

import com.fitness.backend.constant.ResultConstant;
import com.fitness.backend.entity.CommonResult;
import com.fitness.backend.entity.User;
import com.fitness.backend.service.LoginFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@Api(tags = "login接口")
@RequestMapping("login")
@CrossOrigin(origins = "*",allowCredentials = "true",allowedHeaders = "*")
public class LoginController {

	
	@ApiOperation(value = "登录")
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public CommonResult doLogin(@RequestBody User user, HttpSession session) {

		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);

	}

	@ApiOperation(value = "退出登录")
	@RequestMapping(value = "/doLogOut", method = RequestMethod.POST)
	public CommonResult doLogOut(HttpSession session) {

		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);

	}

}
