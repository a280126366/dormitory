package com.apps.bean;

public class House {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.hou_id
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private String houId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.floor
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private Integer floor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.room
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private Integer room;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.hou_num
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private Integer houNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.hou_in_num
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    private Integer houInNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.hou_id
     *
     * @return the value of house.hou_id
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getHouId() {
        return houId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.hou_id
     *
     * @param houId the value for house.hou_id
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setHouId(String houId) {
        this.houId = houId == null ? null : houId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.floor
     *
     * @return the value of house.floor
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.floor
     *
     * @param floor the value for house.floor
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.room
     *
     * @return the value of house.room
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Integer getRoom() {
        return room;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.room
     *
     * @param room the value for house.room
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setRoom(Integer room) {
        this.room = room;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.hou_num
     *
     * @return the value of house.hou_num
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Integer getHouNum() {
        return houNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.hou_num
     *
     * @param houNum the value for house.hou_num
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setHouNum(Integer houNum) {
        this.houNum = houNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.hou_in_num
     *
     * @return the value of house.hou_in_num
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Integer getHouInNum() {
        return houInNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.hou_in_num
     *
     * @param houInNum the value for house.hou_in_num
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setHouInNum(Integer houInNum) {
        this.houInNum = houInNum;
    }
}