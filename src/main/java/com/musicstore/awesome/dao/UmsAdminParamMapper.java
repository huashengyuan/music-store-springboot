package com.musicstore.awesome.dao;

import com.musicstore.awesome.dto.UmsAdminParam;

public interface UmsAdminParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Mon Mar 18 22:29:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Mon Mar 18 22:29:12 CST 2019
     */
    int insert(UmsAdminParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Mon Mar 18 22:29:12 CST 2019
     */
    int insertSelective(UmsAdminParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Mon Mar 18 22:29:12 CST 2019
     */
    UmsAdminParam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Mon Mar 18 22:29:12 CST 2019
     */
    int updateByPrimaryKeySelective(UmsAdminParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Mon Mar 18 22:29:12 CST 2019
     */
    int updateByPrimaryKey(UmsAdminParam record);
}