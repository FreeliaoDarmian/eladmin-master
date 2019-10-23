package me.zhengjie.modules.wechat.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceInfoExample() {
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

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNull() {
            addCriterion("product_brand is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNotNull() {
            addCriterion("product_brand is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandEqualTo(String value) {
            addCriterion("product_brand =", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotEqualTo(String value) {
            addCriterion("product_brand <>", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThan(String value) {
            addCriterion("product_brand >", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThanOrEqualTo(String value) {
            addCriterion("product_brand >=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThan(String value) {
            addCriterion("product_brand <", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThanOrEqualTo(String value) {
            addCriterion("product_brand <=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLike(String value) {
            addCriterion("product_brand like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotLike(String value) {
            addCriterion("product_brand not like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandIn(List<String> values) {
            addCriterion("product_brand in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotIn(List<String> values) {
            addCriterion("product_brand not in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandBetween(String value1, String value2) {
            addCriterion("product_brand between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotBetween(String value1, String value2) {
            addCriterion("product_brand not between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNull() {
            addCriterion("product_model is null");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNotNull() {
            addCriterion("product_model is not null");
            return (Criteria) this;
        }

        public Criteria andProductModelEqualTo(String value) {
            addCriterion("product_model =", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotEqualTo(String value) {
            addCriterion("product_model <>", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThan(String value) {
            addCriterion("product_model >", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThanOrEqualTo(String value) {
            addCriterion("product_model >=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThan(String value) {
            addCriterion("product_model <", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThanOrEqualTo(String value) {
            addCriterion("product_model <=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLike(String value) {
            addCriterion("product_model like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotLike(String value) {
            addCriterion("product_model not like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelIn(List<String> values) {
            addCriterion("product_model in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotIn(List<String> values) {
            addCriterion("product_model not in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelBetween(String value1, String value2) {
            addCriterion("product_model between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotBetween(String value1, String value2) {
            addCriterion("product_model not between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Short value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Short value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Short value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Short value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Short value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Short value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Short> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Short> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Short value1, Short value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Short value1, Short value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionIsNull() {
            addCriterion("fault_description is null");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionIsNotNull() {
            addCriterion("fault_description is not null");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionEqualTo(String value) {
            addCriterion("fault_description =", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotEqualTo(String value) {
            addCriterion("fault_description <>", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionGreaterThan(String value) {
            addCriterion("fault_description >", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("fault_description >=", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionLessThan(String value) {
            addCriterion("fault_description <", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionLessThanOrEqualTo(String value) {
            addCriterion("fault_description <=", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionLike(String value) {
            addCriterion("fault_description like", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotLike(String value) {
            addCriterion("fault_description not like", value, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionIn(List<String> values) {
            addCriterion("fault_description in", values, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotIn(List<String> values) {
            addCriterion("fault_description not in", values, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionBetween(String value1, String value2) {
            addCriterion("fault_description between", value1, value2, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andFaultDescriptionNotBetween(String value1, String value2) {
            addCriterion("fault_description not between", value1, value2, "faultDescription");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeEqualTo(Date value) {
            addCriterion("sale_time =", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotEqualTo(Date value) {
            addCriterion("sale_time <>", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThan(Date value) {
            addCriterion("sale_time >", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_time >=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThan(Date value) {
            addCriterion("sale_time <", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_time <=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIn(List<Date> values) {
            addCriterion("sale_time in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotIn(List<Date> values) {
            addCriterion("sale_time not in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeBetween(Date value1, Date value2) {
            addCriterion("sale_time between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_time not between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeIsNull() {
            addCriterion("bookin_time is null");
            return (Criteria) this;
        }

        public Criteria andBookinTimeIsNotNull() {
            addCriterion("bookin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookinTimeEqualTo(Date value) {
            addCriterion("bookin_time =", value, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeNotEqualTo(Date value) {
            addCriterion("bookin_time <>", value, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeGreaterThan(Date value) {
            addCriterion("bookin_time >", value, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bookin_time >=", value, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeLessThan(Date value) {
            addCriterion("bookin_time <", value, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeLessThanOrEqualTo(Date value) {
            addCriterion("bookin_time <=", value, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeIn(List<Date> values) {
            addCriterion("bookin_time in", values, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeNotIn(List<Date> values) {
            addCriterion("bookin_time not in", values, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeBetween(Date value1, Date value2) {
            addCriterion("bookin_time between", value1, value2, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andBookinTimeNotBetween(Date value1, Date value2) {
            addCriterion("bookin_time not between", value1, value2, "bookinTime");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNull() {
            addCriterion("wx_openid is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNotNull() {
            addCriterion("wx_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualTo(String value) {
            addCriterion("wx_openid =", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualTo(String value) {
            addCriterion("wx_openid <>", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThan(String value) {
            addCriterion("wx_openid >", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_openid >=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThan(String value) {
            addCriterion("wx_openid <", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("wx_openid <=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLike(String value) {
            addCriterion("wx_openid like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotLike(String value) {
            addCriterion("wx_openid not like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIn(List<String> values) {
            addCriterion("wx_openid in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotIn(List<String> values) {
            addCriterion("wx_openid not in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidBetween(String value1, String value2) {
            addCriterion("wx_openid between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotBetween(String value1, String value2) {
            addCriterion("wx_openid not between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIsNull() {
            addCriterion("require_time is null");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIsNotNull() {
            addCriterion("require_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequireTimeEqualTo(String value) {
            addCriterion("require_time =", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotEqualTo(String value) {
            addCriterion("require_time <>", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeGreaterThan(String value) {
            addCriterion("require_time >", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeGreaterThanOrEqualTo(String value) {
            addCriterion("require_time >=", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLessThan(String value) {
            addCriterion("require_time <", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLessThanOrEqualTo(String value) {
            addCriterion("require_time <=", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLike(String value) {
            addCriterion("require_time like", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotLike(String value) {
            addCriterion("require_time not like", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIn(List<String> values) {
            addCriterion("require_time in", values, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotIn(List<String> values) {
            addCriterion("require_time not in", values, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeBetween(String value1, String value2) {
            addCriterion("require_time between", value1, value2, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotBetween(String value1, String value2) {
            addCriterion("require_time not between", value1, value2, "requireTime");
            return (Criteria) this;
        }

        public Criteria andIsDispatchIsNull() {
            addCriterion("is_dispatch is null");
            return (Criteria) this;
        }

        public Criteria andIsDispatchIsNotNull() {
            addCriterion("is_dispatch is not null");
            return (Criteria) this;
        }

        public Criteria andIsDispatchEqualTo(Boolean value) {
            addCriterion("is_dispatch =", value, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchNotEqualTo(Boolean value) {
            addCriterion("is_dispatch <>", value, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchGreaterThan(Boolean value) {
            addCriterion("is_dispatch >", value, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_dispatch >=", value, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchLessThan(Boolean value) {
            addCriterion("is_dispatch <", value, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchLessThanOrEqualTo(Boolean value) {
            addCriterion("is_dispatch <=", value, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchIn(List<Boolean> values) {
            addCriterion("is_dispatch in", values, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchNotIn(List<Boolean> values) {
            addCriterion("is_dispatch not in", values, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dispatch between", value1, value2, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andIsDispatchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dispatch not between", value1, value2, "isDispatch");
            return (Criteria) this;
        }

        public Criteria andDispatcherIsNull() {
            addCriterion("dispatcher is null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIsNotNull() {
            addCriterion("dispatcher is not null");
            return (Criteria) this;
        }

        public Criteria andDispatcherEqualTo(Long value) {
            addCriterion("dispatcher =", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotEqualTo(Long value) {
            addCriterion("dispatcher <>", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherGreaterThan(Long value) {
            addCriterion("dispatcher >", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherGreaterThanOrEqualTo(Long value) {
            addCriterion("dispatcher >=", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLessThan(Long value) {
            addCriterion("dispatcher <", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherLessThanOrEqualTo(Long value) {
            addCriterion("dispatcher <=", value, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherIn(List<Long> values) {
            addCriterion("dispatcher in", values, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotIn(List<Long> values) {
            addCriterion("dispatcher not in", values, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherBetween(Long value1, Long value2) {
            addCriterion("dispatcher between", value1, value2, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatcherNotBetween(Long value1, Long value2) {
            addCriterion("dispatcher not between", value1, value2, "dispatcher");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNull() {
            addCriterion("dispatch_time is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNotNull() {
            addCriterion("dispatch_time is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeEqualTo(Date value) {
            addCriterion("dispatch_time =", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotEqualTo(Date value) {
            addCriterion("dispatch_time <>", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThan(Date value) {
            addCriterion("dispatch_time >", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dispatch_time >=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThan(Date value) {
            addCriterion("dispatch_time <", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("dispatch_time <=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIn(List<Date> values) {
            addCriterion("dispatch_time in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotIn(List<Date> values) {
            addCriterion("dispatch_time not in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeBetween(Date value1, Date value2) {
            addCriterion("dispatch_time between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("dispatch_time not between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andProcessorIsNull() {
            addCriterion("processor is null");
            return (Criteria) this;
        }

        public Criteria andProcessorIsNotNull() {
            addCriterion("processor is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorEqualTo(Long value) {
            addCriterion("processor =", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotEqualTo(Long value) {
            addCriterion("processor <>", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorGreaterThan(Long value) {
            addCriterion("processor >", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorGreaterThanOrEqualTo(Long value) {
            addCriterion("processor >=", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLessThan(Long value) {
            addCriterion("processor <", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLessThanOrEqualTo(Long value) {
            addCriterion("processor <=", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorIn(List<Long> values) {
            addCriterion("processor in", values, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotIn(List<Long> values) {
            addCriterion("processor not in", values, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorBetween(Long value1, Long value2) {
            addCriterion("processor between", value1, value2, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotBetween(Long value1, Long value2) {
            addCriterion("processor not between", value1, value2, "processor");
            return (Criteria) this;
        }

        public Criteria andFeesIsNull() {
            addCriterion("fees is null");
            return (Criteria) this;
        }

        public Criteria andFeesIsNotNull() {
            addCriterion("fees is not null");
            return (Criteria) this;
        }

        public Criteria andFeesEqualTo(BigDecimal value) {
            addCriterion("fees =", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesNotEqualTo(BigDecimal value) {
            addCriterion("fees <>", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesGreaterThan(BigDecimal value) {
            addCriterion("fees >", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fees >=", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesLessThan(BigDecimal value) {
            addCriterion("fees <", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fees <=", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesIn(List<BigDecimal> values) {
            addCriterion("fees in", values, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesNotIn(List<BigDecimal> values) {
            addCriterion("fees not in", values, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fees between", value1, value2, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fees not between", value1, value2, "fees");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoIsNull() {
            addCriterion("callback_info is null");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoIsNotNull() {
            addCriterion("callback_info is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoEqualTo(String value) {
            addCriterion("callback_info =", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoNotEqualTo(String value) {
            addCriterion("callback_info <>", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoGreaterThan(String value) {
            addCriterion("callback_info >", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoGreaterThanOrEqualTo(String value) {
            addCriterion("callback_info >=", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoLessThan(String value) {
            addCriterion("callback_info <", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoLessThanOrEqualTo(String value) {
            addCriterion("callback_info <=", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoLike(String value) {
            addCriterion("callback_info like", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoNotLike(String value) {
            addCriterion("callback_info not like", value, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoIn(List<String> values) {
            addCriterion("callback_info in", values, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoNotIn(List<String> values) {
            addCriterion("callback_info not in", values, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoBetween(String value1, String value2) {
            addCriterion("callback_info between", value1, value2, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andCallbackInfoNotBetween(String value1, String value2) {
            addCriterion("callback_info not between", value1, value2, "callbackInfo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoIsNull() {
            addCriterion("service_memo is null");
            return (Criteria) this;
        }

        public Criteria andServiceMemoIsNotNull() {
            addCriterion("service_memo is not null");
            return (Criteria) this;
        }

        public Criteria andServiceMemoEqualTo(String value) {
            addCriterion("service_memo =", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoNotEqualTo(String value) {
            addCriterion("service_memo <>", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoGreaterThan(String value) {
            addCriterion("service_memo >", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoGreaterThanOrEqualTo(String value) {
            addCriterion("service_memo >=", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoLessThan(String value) {
            addCriterion("service_memo <", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoLessThanOrEqualTo(String value) {
            addCriterion("service_memo <=", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoLike(String value) {
            addCriterion("service_memo like", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoNotLike(String value) {
            addCriterion("service_memo not like", value, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoIn(List<String> values) {
            addCriterion("service_memo in", values, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoNotIn(List<String> values) {
            addCriterion("service_memo not in", values, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoBetween(String value1, String value2) {
            addCriterion("service_memo between", value1, value2, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andServiceMemoNotBetween(String value1, String value2) {
            addCriterion("service_memo not between", value1, value2, "serviceMemo");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Long value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Long value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Long value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Long value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Long value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Long> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Long> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Long value1, Long value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Long value1, Long value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
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