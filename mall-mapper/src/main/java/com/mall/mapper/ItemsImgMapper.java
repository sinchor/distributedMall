package com.mall.mapper;

import com.mall.pojo.ItemsImg;
import com.mall.pojo.ItemsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    long countByExample(ItemsImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int deleteByExample(ItemsImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int insert(ItemsImg row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int insertSelective(ItemsImg row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    List<ItemsImg> selectByExample(ItemsImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    ItemsImg selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByExampleSelective(@Param("row") ItemsImg row, @Param("example") ItemsImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByExample(@Param("row") ItemsImg row, @Param("example") ItemsImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByPrimaryKeySelective(ItemsImg row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items_img
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    int updateByPrimaryKey(ItemsImg row);
}