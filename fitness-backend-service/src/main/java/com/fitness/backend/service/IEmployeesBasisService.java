package com.fitness.backend.service;



import com.fitness.backend.entity.EmployeesBasisEntity;
import com.fitness.backend.entity.PageData;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IEmployeesBasisService {

	void add(EmployeesBasisEntity entity);
	
	void delete(EmployeesBasisEntity entity);
	
	void update(EmployeesBasisEntity entity);
	
	List<EmployeesBasisEntity> select(EmployeesBasisEntity entity);
	
	PageData<EmployeesBasisEntity> likeSelect(EmployeesBasisEntity entity);

	void batchAdd(List<EmployeesBasisEntity> list);
	
	void batchDelete(List<EmployeesBasisEntity> list);
	
	void batchUpdate(List<EmployeesBasisEntity> list);

    void exportExcel(EmployeesBasisEntity entity, HttpServletResponse response);

}
