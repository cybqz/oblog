package com.cyb.blog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FowardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public FowardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
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
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andForwardCountIsNull() {
            addCriterion("forward_count is null");
            return (Criteria) this;
        }

        public Criteria andForwardCountIsNotNull() {
            addCriterion("forward_count is not null");
            return (Criteria) this;
        }

        public Criteria andForwardCountEqualTo(Integer value) {
            addCriterion("forward_count =", value, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountNotEqualTo(Integer value) {
            addCriterion("forward_count <>", value, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountGreaterThan(Integer value) {
            addCriterion("forward_count >", value, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward_count >=", value, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountLessThan(Integer value) {
            addCriterion("forward_count <", value, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountLessThanOrEqualTo(Integer value) {
            addCriterion("forward_count <=", value, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountIn(List<Integer> values) {
            addCriterion("forward_count in", values, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountNotIn(List<Integer> values) {
            addCriterion("forward_count not in", values, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountBetween(Integer value1, Integer value2) {
            addCriterion("forward_count between", value1, value2, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andForwardCountNotBetween(Integer value1, Integer value2) {
            addCriterion("forward_count not between", value1, value2, "forwardCount");
            return (Criteria) this;
        }

        public Criteria andFowardContaintIsNull() {
            addCriterion("foward_containt is null");
            return (Criteria) this;
        }

        public Criteria andFowardContaintIsNotNull() {
            addCriterion("foward_containt is not null");
            return (Criteria) this;
        }

        public Criteria andFowardContaintEqualTo(String value) {
            addCriterion("foward_containt =", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintNotEqualTo(String value) {
            addCriterion("foward_containt <>", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintGreaterThan(String value) {
            addCriterion("foward_containt >", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintGreaterThanOrEqualTo(String value) {
            addCriterion("foward_containt >=", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintLessThan(String value) {
            addCriterion("foward_containt <", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintLessThanOrEqualTo(String value) {
            addCriterion("foward_containt <=", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintLike(String value) {
            addCriterion("foward_containt like", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintNotLike(String value) {
            addCriterion("foward_containt not like", value, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintIn(List<String> values) {
            addCriterion("foward_containt in", values, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintNotIn(List<String> values) {
            addCriterion("foward_containt not in", values, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintBetween(String value1, String value2) {
            addCriterion("foward_containt between", value1, value2, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardContaintNotBetween(String value1, String value2) {
            addCriterion("foward_containt not between", value1, value2, "fowardContaint");
            return (Criteria) this;
        }

        public Criteria andFowardDateIsNull() {
            addCriterion("foward_date is null");
            return (Criteria) this;
        }

        public Criteria andFowardDateIsNotNull() {
            addCriterion("foward_date is not null");
            return (Criteria) this;
        }

        public Criteria andFowardDateEqualTo(Date value) {
            addCriterion("foward_date =", value, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateNotEqualTo(Date value) {
            addCriterion("foward_date <>", value, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateGreaterThan(Date value) {
            addCriterion("foward_date >", value, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateGreaterThanOrEqualTo(Date value) {
            addCriterion("foward_date >=", value, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateLessThan(Date value) {
            addCriterion("foward_date <", value, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateLessThanOrEqualTo(Date value) {
            addCriterion("foward_date <=", value, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateIn(List<Date> values) {
            addCriterion("foward_date in", values, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateNotIn(List<Date> values) {
            addCriterion("foward_date not in", values, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateBetween(Date value1, Date value2) {
            addCriterion("foward_date between", value1, value2, "fowardDate");
            return (Criteria) this;
        }

        public Criteria andFowardDateNotBetween(Date value1, Date value2) {
            addCriterion("foward_date not between", value1, value2, "fowardDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foward
     *
     * @mbg.generated do_not_delete_during_merge Sun Jan 27 13:11:27 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foward
     *
     * @mbg.generated Sun Jan 27 13:11:27 CST 2019
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