package com.fitness.backend.dao;

import com.fitness.backend.entity.EmployeesBasisEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IEmployeesBasisDao extends IBaseDao<EmployeesBasisEntity> {

}
