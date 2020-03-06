package com.apps.bean;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public HouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHouIdIsNull() {
            addCriterion("hou_id is null");
            return (Criteria) this;
        }

        public Criteria andHouIdIsNotNull() {
            addCriterion("hou_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouIdEqualTo(String value) {
            addCriterion("hou_id =", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdNotEqualTo(String value) {
            addCriterion("hou_id <>", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdGreaterThan(String value) {
            addCriterion("hou_id >", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdGreaterThanOrEqualTo(String value) {
            addCriterion("hou_id >=", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdLessThan(String value) {
            addCriterion("hou_id <", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdLessThanOrEqualTo(String value) {
            addCriterion("hou_id <=", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdLike(String value) {
            addCriterion("hou_id like", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdNotLike(String value) {
            addCriterion("hou_id not like", value, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdIn(List<String> values) {
            addCriterion("hou_id in", values, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdNotIn(List<String> values) {
            addCriterion("hou_id not in", values, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdBetween(String value1, String value2) {
            addCriterion("hou_id between", value1, value2, "houId");
            return (Criteria) this;
        }

        public Criteria andHouIdNotBetween(String value1, String value2) {
            addCriterion("hou_id not between", value1, value2, "houId");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(Integer value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(Integer value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(Integer value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(Integer value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(Integer value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<Integer> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<Integer> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(Integer value1, Integer value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andHouNumIsNull() {
            addCriterion("hou_num is null");
            return (Criteria) this;
        }

        public Criteria andHouNumIsNotNull() {
            addCriterion("hou_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouNumEqualTo(Integer value) {
            addCriterion("hou_num =", value, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumNotEqualTo(Integer value) {
            addCriterion("hou_num <>", value, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumGreaterThan(Integer value) {
            addCriterion("hou_num >", value, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hou_num >=", value, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumLessThan(Integer value) {
            addCriterion("hou_num <", value, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumLessThanOrEqualTo(Integer value) {
            addCriterion("hou_num <=", value, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumIn(List<Integer> values) {
            addCriterion("hou_num in", values, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumNotIn(List<Integer> values) {
            addCriterion("hou_num not in", values, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumBetween(Integer value1, Integer value2) {
            addCriterion("hou_num between", value1, value2, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouNumNotBetween(Integer value1, Integer value2) {
            addCriterion("hou_num not between", value1, value2, "houNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumIsNull() {
            addCriterion("hou_in_num is null");
            return (Criteria) this;
        }

        public Criteria andHouInNumIsNotNull() {
            addCriterion("hou_in_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouInNumEqualTo(Integer value) {
            addCriterion("hou_in_num =", value, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumNotEqualTo(Integer value) {
            addCriterion("hou_in_num <>", value, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumGreaterThan(Integer value) {
            addCriterion("hou_in_num >", value, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hou_in_num >=", value, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumLessThan(Integer value) {
            addCriterion("hou_in_num <", value, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumLessThanOrEqualTo(Integer value) {
            addCriterion("hou_in_num <=", value, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumIn(List<Integer> values) {
            addCriterion("hou_in_num in", values, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumNotIn(List<Integer> values) {
            addCriterion("hou_in_num not in", values, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumBetween(Integer value1, Integer value2) {
            addCriterion("hou_in_num between", value1, value2, "houInNum");
            return (Criteria) this;
        }

        public Criteria andHouInNumNotBetween(Integer value1, Integer value2) {
            addCriterion("hou_in_num not between", value1, value2, "houInNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table house
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 05 18:28:22 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table house
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}