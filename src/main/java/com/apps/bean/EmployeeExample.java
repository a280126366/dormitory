package com.apps.bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public EmployeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
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
     * This method corresponds to the database table employee
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
     * This method corresponds to the database table employee
     *
     * @mbg.generated Thu Mar 05 18:28:22 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
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
     * This class corresponds to the database table employee
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

        public Criteria andEmIdIsNull() {
            addCriterion("em_id is null");
            return (Criteria) this;
        }

        public Criteria andEmIdIsNotNull() {
            addCriterion("em_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmIdEqualTo(Integer value) {
            addCriterion("em_id =", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotEqualTo(Integer value) {
            addCriterion("em_id <>", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThan(Integer value) {
            addCriterion("em_id >", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("em_id >=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThan(Integer value) {
            addCriterion("em_id <", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThanOrEqualTo(Integer value) {
            addCriterion("em_id <=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdIn(List<Integer> values) {
            addCriterion("em_id in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotIn(List<Integer> values) {
            addCriterion("em_id not in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdBetween(Integer value1, Integer value2) {
            addCriterion("em_id between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("em_id not between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNull() {
            addCriterion("em_name is null");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNotNull() {
            addCriterion("em_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmNameEqualTo(String value) {
            addCriterion("em_name =", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotEqualTo(String value) {
            addCriterion("em_name <>", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThan(String value) {
            addCriterion("em_name >", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThanOrEqualTo(String value) {
            addCriterion("em_name >=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThan(String value) {
            addCriterion("em_name <", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThanOrEqualTo(String value) {
            addCriterion("em_name <=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLike(String value) {
            addCriterion("em_name like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotLike(String value) {
            addCriterion("em_name not like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameIn(List<String> values) {
            addCriterion("em_name in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotIn(List<String> values) {
            addCriterion("em_name not in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameBetween(String value1, String value2) {
            addCriterion("em_name between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotBetween(String value1, String value2) {
            addCriterion("em_name not between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmGenderIsNull() {
            addCriterion("em_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmGenderIsNotNull() {
            addCriterion("em_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmGenderEqualTo(String value) {
            addCriterion("em_gender =", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderNotEqualTo(String value) {
            addCriterion("em_gender <>", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderGreaterThan(String value) {
            addCriterion("em_gender >", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderGreaterThanOrEqualTo(String value) {
            addCriterion("em_gender >=", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderLessThan(String value) {
            addCriterion("em_gender <", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderLessThanOrEqualTo(String value) {
            addCriterion("em_gender <=", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderLike(String value) {
            addCriterion("em_gender like", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderNotLike(String value) {
            addCriterion("em_gender not like", value, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderIn(List<String> values) {
            addCriterion("em_gender in", values, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderNotIn(List<String> values) {
            addCriterion("em_gender not in", values, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderBetween(String value1, String value2) {
            addCriterion("em_gender between", value1, value2, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmGenderNotBetween(String value1, String value2) {
            addCriterion("em_gender not between", value1, value2, "emGender");
            return (Criteria) this;
        }

        public Criteria andEmHouidIsNull() {
            addCriterion("em_houid is null");
            return (Criteria) this;
        }

        public Criteria andEmHouidIsNotNull() {
            addCriterion("em_houid is not null");
            return (Criteria) this;
        }

        public Criteria andEmHouidEqualTo(String value) {
            addCriterion("em_houid =", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidNotEqualTo(String value) {
            addCriterion("em_houid <>", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidGreaterThan(String value) {
            addCriterion("em_houid >", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidGreaterThanOrEqualTo(String value) {
            addCriterion("em_houid >=", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidLessThan(String value) {
            addCriterion("em_houid <", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidLessThanOrEqualTo(String value) {
            addCriterion("em_houid <=", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidLike(String value) {
            addCriterion("em_houid like", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidNotLike(String value) {
            addCriterion("em_houid not like", value, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidIn(List<String> values) {
            addCriterion("em_houid in", values, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidNotIn(List<String> values) {
            addCriterion("em_houid not in", values, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidBetween(String value1, String value2) {
            addCriterion("em_houid between", value1, value2, "emHouid");
            return (Criteria) this;
        }

        public Criteria andEmHouidNotBetween(String value1, String value2) {
            addCriterion("em_houid not between", value1, value2, "emHouid");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table employee
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
     * This class corresponds to the database table employee
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