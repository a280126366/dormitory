package com.apps.bean;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.em_id
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private Long emId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.em_name
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private String emName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.em_gender
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private String emGender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.em_houid
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private String emHouid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.post
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private String post;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.address
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.em_id
     *
     * @return the value of employee.em_id
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Long getEmId() {
        return emId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.em_id
     *
     * @param emId the value for employee.em_id
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setEmId(Long emId) {
        this.emId = emId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.em_name
     *
     * @return the value of employee.em_name
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getEmName() {
        return emName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.em_name
     *
     * @param emName the value for employee.em_name
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setEmName(String emName) {
        this.emName = emName == null ? null : emName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.em_gender
     *
     * @return the value of employee.em_gender
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getEmGender() {
        return emGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.em_gender
     *
     * @param emGender the value for employee.em_gender
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setEmGender(String emGender) {
        this.emGender = emGender == null ? null : emGender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.em_houid
     *
     * @return the value of employee.em_houid
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getEmHouid() {
        return emHouid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.em_houid
     *
     * @param emHouid the value for employee.em_houid
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setEmHouid(String emHouid) {
        this.emHouid = emHouid == null ? null : emHouid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.post
     *
     * @return the value of employee.post
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getPost() {
        return post;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.post
     *
     * @param post the value for employee.post
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.address
     *
     * @return the value of employee.address
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.address
     *
     * @param address the value for employee.address
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}