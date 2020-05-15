package com.fitness.backend.service.impl;


import com.fitness.backend.dao.IEmployeesBasisDao;
import com.fitness.backend.entity.EmployeesBasisEntity;
import com.fitness.backend.entity.PageData;
import com.fitness.backend.service.IEmployeesBasisService;
import com.fitness.backend.utils.ExcelUtil;
import com.fitness.backend.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeesBasisServiceImpl implements IEmployeesBasisService {

	@Autowired
	private IEmployeesBasisDao dao;

	
	@Override
	public void add(EmployeesBasisEntity entity) {
		dao.add(entity);
	}
	
	@Override
	public void delete(EmployeesBasisEntity entity) {
		dao.delete(entity);
	}
	
	@Override
	public void update(EmployeesBasisEntity entity) {
		dao.update(entity);
	}
	
	@Override
	public List<EmployeesBasisEntity> select(EmployeesBasisEntity entity) {
		return dao.select(entity);
	}
	
	@Override
	public PageData<EmployeesBasisEntity> likeSelect(EmployeesBasisEntity entity) {
	
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void batchAdd(List<EmployeesBasisEntity> list) {
		dao.batchAdd(list);
	}

	@Override
	public void batchDelete(List<EmployeesBasisEntity> list) {
		dao.batchDelete(list);
	}

	@Override
	public void batchUpdate(List<EmployeesBasisEntity> list) {
		dao.batchUpdate(list);
	}
	
	
	@Override
	public void exportExcel(EmployeesBasisEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "id", "名称", "年龄", "角色", "电话", "身份证", "附件", "微信号", "工号", "入职之间", "在职状态", "离职时间", "创建时间", "创建人", "修改时间", "修改人"};
		
		String[] headEngList = new String[]{ "e_id", "e_name", "e_age", "e_role", "e_mobile", "e_code", "e_image", "e_wechat", "e_number", "e_induction_time", "e_induction_status", "e_out_time", "create_time", "create_u", "modify_time", "modify_u"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
		
		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
