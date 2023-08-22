package com.mall.mapper;

import com.mall.pojo.ItemsParam;
import com.mall.pojo.ItemsParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    long countByExample(ItemsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int deleteByExample(ItemsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int insert(ItemsParam row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int insertSelective(ItemsParam row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    List<ItemsParam> selectByExample(ItemsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    ItemsParam selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByExampleSelective(@Param("row") ItemsParam row, @Param("example") ItemsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByExample(@Param("row") ItemsParam row, @Param("example") ItemsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByPrimaryKeySelective(ItemsParam row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_param
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByPrimaryKey(ItemsParam row);
}