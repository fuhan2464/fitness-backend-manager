package com.fitness.backend.controller;

import com.fitness.backend.constant.ResultConstant;
import com.fitness.backend.entity.CommonResult;
import com.fitness.backend.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "*",allowCredentials = "true",allowedHeaders = "*")
@Api(tags = "login接口")
@RequestMapping("/login")
public class LoginRestService {

	
	
	@ApiOperation(value = "登录")
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public CommonResult doLogin(@RequestBody User user, HttpSession session) {

		if (("admin".equals(user.getUserName()) && "root".equals(user.getPassword()))) {

			session.setAttribute("user", user);
			return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);
		}
		return new CommonResult(ResultConstant.LOGIN_FAIL_CODE, ResultConstant.FAIL_MSG);

	}
	
	@ApiOperation(value = "退出登录")
	@RequestMapping(value = "/doLogOut", method = RequestMethod.POST)
	public CommonResult doLogOut(HttpSession session) {

		session.removeAttribute("user");
		return new CommonResult(ResultConstant.SUCCCSS_CODE, ResultConstant.SUCCESS_MSG);

	}

}
