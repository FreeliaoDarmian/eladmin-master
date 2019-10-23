package me.zhengjie.modules.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceProgressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceProgressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andProgressIdIsNull() {
            addCriterion("progress_id is null");
            return (Criteria) this;
        }

        public Criteria andProgressIdIsNotNull() {
            addCriterion("progress_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgressIdEqualTo(Long value) {
            addCriterion("progress_id =", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdNotEqualTo(Long value) {
            addCriterion("progress_id <>", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdGreaterThan(Long value) {
            addCriterion("progress_id >", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("progress_id >=", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdLessThan(Long value) {
            addCriterion("progress_id <", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdLessThanOrEqualTo(Long value) {
            addCriterion("progress_id <=", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdIn(List<Long> values) {
            addCriterion("progress_id in", values, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdNotIn(List<Long> values) {
            addCriterion("progress_id not in", values, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdBetween(Long value1, Long value2) {
            addCriterion("progress_id between", value1, value2, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdNotBetween(Long value1, Long value2) {
            addCriterion("progress_id not between", value1, value2, "progressId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andProgressStateIsNull() {
            addCriterion("progress_state is null");
            return (Criteria) this;
        }

        public Criteria andProgressStateIsNotNull() {
            addCriterion("progress_state is not null");
            return (Criteria) this;
        }

        public Criteria andProgressStateEqualTo(String value) {
            addCriterion("progress_state =", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateNotEqualTo(String value) {
            addCriterion("progress_state <>", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateGreaterThan(String value) {
            addCriterion("progress_state >", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateGreaterThanOrEqualTo(String value) {
            addCriterion("progress_state >=", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateLessThan(String value) {
            addCriterion("progress_state <", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateLessThanOrEqualTo(String value) {
            addCriterion("progress_state <=", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateLike(String value) {
            addCriterion("progress_state like", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateNotLike(String value) {
            addCriterion("progress_state not like", value, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateIn(List<String> values) {
            addCriterion("progress_state in", values, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateNotIn(List<String> values) {
            addCriterion("progress_state not in", values, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateBetween(String value1, String value2) {
            addCriterion("progress_state between", value1, value2, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressStateNotBetween(String value1, String value2) {
            addCriterion("progress_state not between", value1, value2, "progressState");
            return (Criteria) this;
        }

        public Criteria andProgressUserIsNull() {
            addCriterion("progress_user is null");
            return (Criteria) this;
        }

        public Criteria andProgressUserIsNotNull() {
            addCriterion("progress_user is not null");
            return (Criteria) this;
        }

        public Criteria andProgressUserEqualTo(Long value) {
            addCriterion("progress_user =", value, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserNotEqualTo(Long value) {
            addCriterion("progress_user <>", value, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserGreaterThan(Long value) {
            addCriterion("progress_user >", value, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserGreaterThanOrEqualTo(Long value) {
            addCriterion("progress_user >=", value, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserLessThan(Long value) {
            addCriterion("progress_user <", value, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserLessThanOrEqualTo(Long value) {
            addCriterion("progress_user <=", value, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserIn(List<Long> values) {
            addCriterion("progress_user in", values, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserNotIn(List<Long> values) {
            addCriterion("progress_user not in", values, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserBetween(Long value1, Long value2) {
            addCriterion("progress_user between", value1, value2, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressUserNotBetween(Long value1, Long value2) {
            addCriterion("progress_user not between", value1, value2, "progressUser");
            return (Criteria) this;
        }

        public Criteria andProgressTimeIsNull() {
            addCriterion("progress_time is null");
            return (Criteria) this;
        }

        public Criteria andProgressTimeIsNotNull() {
            addCriterion("progress_time is not null");
            return (Criteria) this;
        }

        public Criteria andProgressTimeEqualTo(Date value) {
            addCriterion("progress_time =", value, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeNotEqualTo(Date value) {
            addCriterion("progress_time <>", value, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeGreaterThan(Date value) {
            addCriterion("progress_time >", value, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("progress_time >=", value, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeLessThan(Date value) {
            addCriterion("progress_time <", value, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeLessThanOrEqualTo(Date value) {
            addCriterion("progress_time <=", value, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeIn(List<Date> values) {
            addCriterion("progress_time in", values, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeNotIn(List<Date> values) {
            addCriterion("progress_time not in", values, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeBetween(Date value1, Date value2) {
            addCriterion("progress_time between", value1, value2, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressTimeNotBetween(Date value1, Date value2) {
            addCriterion("progress_time not between", value1, value2, "progressTime");
            return (Criteria) this;
        }

        public Criteria andProgressMemoIsNull() {
            addCriterion("progress_memo is null");
            return (Criteria) this;
        }

        public Criteria andProgressMemoIsNotNull() {
            addCriterion("progress_memo is not null");
            return (Criteria) this;
        }

        public Criteria andProgressMemoEqualTo(String value) {
            addCriterion("progress_memo =", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoNotEqualTo(String value) {
            addCriterion("progress_memo <>", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoGreaterThan(String value) {
            addCriterion("progress_memo >", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoGreaterThanOrEqualTo(String value) {
            addCriterion("progress_memo >=", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoLessThan(String value) {
            addCriterion("progress_memo <", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoLessThanOrEqualTo(String value) {
            addCriterion("progress_memo <=", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoLike(String value) {
            addCriterion("progress_memo like", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoNotLike(String value) {
            addCriterion("progress_memo not like", value, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoIn(List<String> values) {
            addCriterion("progress_memo in", values, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoNotIn(List<String> values) {
            addCriterion("progress_memo not in", values, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoBetween(String value1, String value2) {
            addCriterion("progress_memo between", value1, value2, "progressMemo");
            return (Criteria) this;
        }

        public Criteria andProgressMemoNotBetween(String value1, String value2) {
            addCriterion("progress_memo not between", value1, value2, "progressMemo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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