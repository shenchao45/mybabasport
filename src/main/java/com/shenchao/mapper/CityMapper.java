package com.shenchao.mapper;

import com.shenchao.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by shenchao on 2017/2/7.
 */
@Mapper
public interface CityMapper {

    @Select("SELECT * FROM city WHERE state = #{state}")
    City findByState(@Param("state") String state);

    void save(City city);

    void testDelete(@Param("id") int id);

    List<City> findAll();

}