package com.fitness.backend.service;

import com.fitness.backend.entity.CommonResult;
import com.fitness.backend.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@FeignClient(name= "fitness-backend-service")
public interface LoginFeignService {

	@RequestMapping(value = "service/login/doLogin", method = RequestMethod.POST)
	CommonResult doLogin(@RequestBody User user, HttpSession session) ;

	@RequestMapping(value = "service/login/doLogOut", method = RequestMethod.POST)
	CommonResult doLogOut(HttpSession session) ;

}
