package com.mall.pojo;

import java.util.Date;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.receiver_name
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.receiver_mobile
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String receiverMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.receiver_address
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String receiverAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.total_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Integer totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.real_pay_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Integer realPayAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.post_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Integer postAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.pay_method
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Integer payMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.left_msg
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String leftMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.extend
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private String extend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.is_comment
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Integer isComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.is_delete
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Integer isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.created_time
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.updated_time
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    private Date updatedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.receiver_name
     *
     * @return the value of orders.receiver_name
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.receiver_name
     *
     * @param receiverName the value for orders.receiver_name
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.receiver_mobile
     *
     * @return the value of orders.receiver_mobile
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.receiver_mobile
     *
     * @param receiverMobile the value for orders.receiver_mobile
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.receiver_address
     *
     * @return the value of orders.receiver_address
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.receiver_address
     *
     * @param receiverAddress the value for orders.receiver_address
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.total_amount
     *
     * @return the value of orders.total_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.total_amount
     *
     * @param totalAmount the value for orders.total_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.real_pay_amount
     *
     * @return the value of orders.real_pay_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Integer getRealPayAmount() {
        return realPayAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.real_pay_amount
     *
     * @param realPayAmount the value for orders.real_pay_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setRealPayAmount(Integer realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.post_amount
     *
     * @return the value of orders.post_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Integer getPostAmount() {
        return postAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.post_amount
     *
     * @param postAmount the value for orders.post_amount
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setPostAmount(Integer postAmount) {
        this.postAmount = postAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.pay_method
     *
     * @return the value of orders.pay_method
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.pay_method
     *
     * @param payMethod the value for orders.pay_method
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.left_msg
     *
     * @return the value of orders.left_msg
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getLeftMsg() {
        return leftMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.left_msg
     *
     * @param leftMsg the value for orders.left_msg
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg == null ? null : leftMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.extend
     *
     * @return the value of orders.extend
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public String getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.extend
     *
     * @param extend the value for orders.extend
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.is_comment
     *
     * @return the value of orders.is_comment
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.is_comment
     *
     * @param isComment the value for orders.is_comment
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.is_delete
     *
     * @return the value of orders.is_delete
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.is_delete
     *
     * @param isDelete the value for orders.is_delete
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.created_time
     *
     * @return the value of orders.created_time
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.created_time
     *
     * @param createdTime the value for orders.created_time
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.updated_time
     *
     * @return the value of orders.updated_time
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.updated_time
     *
     * @param updatedTime the value for orders.updated_time
     *
     * @mbg.generated Thu Jul 06 23:41:41 CST 2023
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}