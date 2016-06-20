package com.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ProductExample() {
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

		public Criteria andProidIsNull() {
			addCriterion("proId is null");
			return (Criteria) this;
		}

		public Criteria andProidIsNotNull() {
			addCriterion("proId is not null");
			return (Criteria) this;
		}

		public Criteria andProidEqualTo(Integer value) {
			addCriterion("proId =", value, "proid");
			return (Criteria) this;
		}

		public Criteria andProidNotEqualTo(Integer value) {
			addCriterion("proId <>", value, "proid");
			return (Criteria) this;
		}

		public Criteria andProidGreaterThan(Integer value) {
			addCriterion("proId >", value, "proid");
			return (Criteria) this;
		}

		public Criteria andProidGreaterThanOrEqualTo(Integer value) {
			addCriterion("proId >=", value, "proid");
			return (Criteria) this;
		}

		public Criteria andProidLessThan(Integer value) {
			addCriterion("proId <", value, "proid");
			return (Criteria) this;
		}

		public Criteria andProidLessThanOrEqualTo(Integer value) {
			addCriterion("proId <=", value, "proid");
			return (Criteria) this;
		}

		public Criteria andProidIn(List<Integer> values) {
			addCriterion("proId in", values, "proid");
			return (Criteria) this;
		}

		public Criteria andProidNotIn(List<Integer> values) {
			addCriterion("proId not in", values, "proid");
			return (Criteria) this;
		}

		public Criteria andProidBetween(Integer value1, Integer value2) {
			addCriterion("proId between", value1, value2, "proid");
			return (Criteria) this;
		}

		public Criteria andProidNotBetween(Integer value1, Integer value2) {
			addCriterion("proId not between", value1, value2, "proid");
			return (Criteria) this;
		}

		public Criteria andPronameIsNull() {
			addCriterion("proName is null");
			return (Criteria) this;
		}

		public Criteria andPronameIsNotNull() {
			addCriterion("proName is not null");
			return (Criteria) this;
		}

		public Criteria andPronameEqualTo(String value) {
			addCriterion("proName =", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameNotEqualTo(String value) {
			addCriterion("proName <>", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameGreaterThan(String value) {
			addCriterion("proName >", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameGreaterThanOrEqualTo(String value) {
			addCriterion("proName >=", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameLessThan(String value) {
			addCriterion("proName <", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameLessThanOrEqualTo(String value) {
			addCriterion("proName <=", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameLike(String value) {
			addCriterion("proName like", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameNotLike(String value) {
			addCriterion("proName not like", value, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameIn(List<String> values) {
			addCriterion("proName in", values, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameNotIn(List<String> values) {
			addCriterion("proName not in", values, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameBetween(String value1, String value2) {
			addCriterion("proName between", value1, value2, "proname");
			return (Criteria) this;
		}

		public Criteria andPronameNotBetween(String value1, String value2) {
			addCriterion("proName not between", value1, value2, "proname");
			return (Criteria) this;
		}

		public Criteria andMarketpriceIsNull() {
			addCriterion("marketPrice is null");
			return (Criteria) this;
		}

		public Criteria andMarketpriceIsNotNull() {
			addCriterion("marketPrice is not null");
			return (Criteria) this;
		}

		public Criteria andMarketpriceEqualTo(Float value) {
			addCriterion("marketPrice =", value, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceNotEqualTo(Float value) {
			addCriterion("marketPrice <>", value, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceGreaterThan(Float value) {
			addCriterion("marketPrice >", value, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceGreaterThanOrEqualTo(Float value) {
			addCriterion("marketPrice >=", value, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceLessThan(Float value) {
			addCriterion("marketPrice <", value, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceLessThanOrEqualTo(Float value) {
			addCriterion("marketPrice <=", value, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceIn(List<Float> values) {
			addCriterion("marketPrice in", values, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceNotIn(List<Float> values) {
			addCriterion("marketPrice not in", values, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceBetween(Float value1, Float value2) {
			addCriterion("marketPrice between", value1, value2, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMarketpriceNotBetween(Float value1, Float value2) {
			addCriterion("marketPrice not between", value1, value2, "marketprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceIsNull() {
			addCriterion("memberPrice is null");
			return (Criteria) this;
		}

		public Criteria andMemberpriceIsNotNull() {
			addCriterion("memberPrice is not null");
			return (Criteria) this;
		}

		public Criteria andMemberpriceEqualTo(Float value) {
			addCriterion("memberPrice =", value, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceNotEqualTo(Float value) {
			addCriterion("memberPrice <>", value, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceGreaterThan(Float value) {
			addCriterion("memberPrice >", value, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceGreaterThanOrEqualTo(Float value) {
			addCriterion("memberPrice >=", value, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceLessThan(Float value) {
			addCriterion("memberPrice <", value, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceLessThanOrEqualTo(Float value) {
			addCriterion("memberPrice <=", value, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceIn(List<Float> values) {
			addCriterion("memberPrice in", values, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceNotIn(List<Float> values) {
			addCriterion("memberPrice not in", values, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceBetween(Float value1, Float value2) {
			addCriterion("memberPrice between", value1, value2, "memberprice");
			return (Criteria) this;
		}

		public Criteria andMemberpriceNotBetween(Float value1, Float value2) {
			addCriterion("memberPrice not between", value1, value2, "memberprice");
			return (Criteria) this;
		}

		public Criteria andCometimeIsNull() {
			addCriterion("comeTime is null");
			return (Criteria) this;
		}

		public Criteria andCometimeIsNotNull() {
			addCriterion("comeTime is not null");
			return (Criteria) this;
		}

		public Criteria andCometimeEqualTo(Date value) {
			addCriterion("comeTime =", value, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeNotEqualTo(Date value) {
			addCriterion("comeTime <>", value, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeGreaterThan(Date value) {
			addCriterion("comeTime >", value, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeGreaterThanOrEqualTo(Date value) {
			addCriterion("comeTime >=", value, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeLessThan(Date value) {
			addCriterion("comeTime <", value, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeLessThanOrEqualTo(Date value) {
			addCriterion("comeTime <=", value, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeIn(List<Date> values) {
			addCriterion("comeTime in", values, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeNotIn(List<Date> values) {
			addCriterion("comeTime not in", values, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeBetween(Date value1, Date value2) {
			addCriterion("comeTime between", value1, value2, "cometime");
			return (Criteria) this;
		}

		public Criteria andCometimeNotBetween(Date value1, Date value2) {
			addCriterion("comeTime not between", value1, value2, "cometime");
			return (Criteria) this;
		}

		public Criteria andPicIsNull() {
			addCriterion("pic is null");
			return (Criteria) this;
		}

		public Criteria andPicIsNotNull() {
			addCriterion("pic is not null");
			return (Criteria) this;
		}

		public Criteria andPicEqualTo(String value) {
			addCriterion("pic =", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotEqualTo(String value) {
			addCriterion("pic <>", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicGreaterThan(String value) {
			addCriterion("pic >", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicGreaterThanOrEqualTo(String value) {
			addCriterion("pic >=", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLessThan(String value) {
			addCriterion("pic <", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLessThanOrEqualTo(String value) {
			addCriterion("pic <=", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLike(String value) {
			addCriterion("pic like", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotLike(String value) {
			addCriterion("pic not like", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicIn(List<String> values) {
			addCriterion("pic in", values, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotIn(List<String> values) {
			addCriterion("pic not in", values, "pic");
			return (Criteria) this;
		}

		public Criteria andPicBetween(String value1, String value2) {
			addCriterion("pic between", value1, value2, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotBetween(String value1, String value2) {
			addCriterion("pic not between", value1, value2, "pic");
			return (Criteria) this;
		}

		public Criteria andProdetailIsNull() {
			addCriterion("proDetail is null");
			return (Criteria) this;
		}

		public Criteria andProdetailIsNotNull() {
			addCriterion("proDetail is not null");
			return (Criteria) this;
		}

		public Criteria andProdetailEqualTo(String value) {
			addCriterion("proDetail =", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailNotEqualTo(String value) {
			addCriterion("proDetail <>", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailGreaterThan(String value) {
			addCriterion("proDetail >", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailGreaterThanOrEqualTo(String value) {
			addCriterion("proDetail >=", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailLessThan(String value) {
			addCriterion("proDetail <", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailLessThanOrEqualTo(String value) {
			addCriterion("proDetail <=", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailLike(String value) {
			addCriterion("proDetail like", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailNotLike(String value) {
			addCriterion("proDetail not like", value, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailIn(List<String> values) {
			addCriterion("proDetail in", values, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailNotIn(List<String> values) {
			addCriterion("proDetail not in", values, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailBetween(String value1, String value2) {
			addCriterion("proDetail between", value1, value2, "prodetail");
			return (Criteria) this;
		}

		public Criteria andProdetailNotBetween(String value1, String value2) {
			addCriterion("proDetail not between", value1, value2, "prodetail");
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