package com.zstu.tbmg.mapper;

import com.zstu.tbmg.pojo.Role;
import com.zstu.tbmg.pojo.RoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-10-16 15:16:52
     */
    int updateByPrimaryKey(Role record);
}