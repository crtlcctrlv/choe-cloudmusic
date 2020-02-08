package cn.matsu.choe.cloudmusic.web.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtistExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArtistIdIsNull() {
            addCriterion("artist_id is null");
            return (Criteria) this;
        }

        public Criteria andArtistIdIsNotNull() {
            addCriterion("artist_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtistIdEqualTo(Integer value) {
            addCriterion("artist_id =", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdNotEqualTo(Integer value) {
            addCriterion("artist_id <>", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdGreaterThan(Integer value) {
            addCriterion("artist_id >", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("artist_id >=", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdLessThan(Integer value) {
            addCriterion("artist_id <", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdLessThanOrEqualTo(Integer value) {
            addCriterion("artist_id <=", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdIn(List<Integer> values) {
            addCriterion("artist_id in", values, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdNotIn(List<Integer> values) {
            addCriterion("artist_id not in", values, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdBetween(Integer value1, Integer value2) {
            addCriterion("artist_id between", value1, value2, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("artist_id not between", value1, value2, "artistId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andInitialIsNull() {
            addCriterion("initial is null");
            return (Criteria) this;
        }

        public Criteria andInitialIsNotNull() {
            addCriterion("initial is not null");
            return (Criteria) this;
        }

        public Criteria andInitialEqualTo(String value) {
            addCriterion("initial =", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialNotEqualTo(String value) {
            addCriterion("initial <>", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialGreaterThan(String value) {
            addCriterion("initial >", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialGreaterThanOrEqualTo(String value) {
            addCriterion("initial >=", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialLessThan(String value) {
            addCriterion("initial <", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialLessThanOrEqualTo(String value) {
            addCriterion("initial <=", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialLike(String value) {
            addCriterion("initial like", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialNotLike(String value) {
            addCriterion("initial not like", value, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialIn(List<String> values) {
            addCriterion("initial in", values, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialNotIn(List<String> values) {
            addCriterion("initial not in", values, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialBetween(String value1, String value2) {
            addCriterion("initial between", value1, value2, "initial");
            return (Criteria) this;
        }

        public Criteria andInitialNotBetween(String value1, String value2) {
            addCriterion("initial not between", value1, value2, "initial");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andBriefDescIsNull() {
            addCriterion("brief_desc is null");
            return (Criteria) this;
        }

        public Criteria andBriefDescIsNotNull() {
            addCriterion("brief_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBriefDescEqualTo(String value) {
            addCriterion("brief_desc =", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescNotEqualTo(String value) {
            addCriterion("brief_desc <>", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescGreaterThan(String value) {
            addCriterion("brief_desc >", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescGreaterThanOrEqualTo(String value) {
            addCriterion("brief_desc >=", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescLessThan(String value) {
            addCriterion("brief_desc <", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescLessThanOrEqualTo(String value) {
            addCriterion("brief_desc <=", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescLike(String value) {
            addCriterion("brief_desc like", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescNotLike(String value) {
            addCriterion("brief_desc not like", value, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescIn(List<String> values) {
            addCriterion("brief_desc in", values, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescNotIn(List<String> values) {
            addCriterion("brief_desc not in", values, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescBetween(String value1, String value2) {
            addCriterion("brief_desc between", value1, value2, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andBriefDescNotBetween(String value1, String value2) {
            addCriterion("brief_desc not between", value1, value2, "briefDesc");
            return (Criteria) this;
        }

        public Criteria andMusicSizeIsNull() {
            addCriterion("music_size is null");
            return (Criteria) this;
        }

        public Criteria andMusicSizeIsNotNull() {
            addCriterion("music_size is not null");
            return (Criteria) this;
        }

        public Criteria andMusicSizeEqualTo(Short value) {
            addCriterion("music_size =", value, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeNotEqualTo(Short value) {
            addCriterion("music_size <>", value, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeGreaterThan(Short value) {
            addCriterion("music_size >", value, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeGreaterThanOrEqualTo(Short value) {
            addCriterion("music_size >=", value, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeLessThan(Short value) {
            addCriterion("music_size <", value, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeLessThanOrEqualTo(Short value) {
            addCriterion("music_size <=", value, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeIn(List<Short> values) {
            addCriterion("music_size in", values, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeNotIn(List<Short> values) {
            addCriterion("music_size not in", values, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeBetween(Short value1, Short value2) {
            addCriterion("music_size between", value1, value2, "musicSize");
            return (Criteria) this;
        }

        public Criteria andMusicSizeNotBetween(Short value1, Short value2) {
            addCriterion("music_size not between", value1, value2, "musicSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeIsNull() {
            addCriterion("album_size is null");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeIsNotNull() {
            addCriterion("album_size is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeEqualTo(Short value) {
            addCriterion("album_size =", value, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeNotEqualTo(Short value) {
            addCriterion("album_size <>", value, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeGreaterThan(Short value) {
            addCriterion("album_size >", value, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeGreaterThanOrEqualTo(Short value) {
            addCriterion("album_size >=", value, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeLessThan(Short value) {
            addCriterion("album_size <", value, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeLessThanOrEqualTo(Short value) {
            addCriterion("album_size <=", value, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeIn(List<Short> values) {
            addCriterion("album_size in", values, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeNotIn(List<Short> values) {
            addCriterion("album_size not in", values, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeBetween(Short value1, Short value2) {
            addCriterion("album_size between", value1, value2, "albumSize");
            return (Criteria) this;
        }

        public Criteria andAlbumSizeNotBetween(Short value1, Short value2) {
            addCriterion("album_size not between", value1, value2, "albumSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeIsNull() {
            addCriterion("mv_size is null");
            return (Criteria) this;
        }

        public Criteria andMvSizeIsNotNull() {
            addCriterion("mv_size is not null");
            return (Criteria) this;
        }

        public Criteria andMvSizeEqualTo(Short value) {
            addCriterion("mv_size =", value, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeNotEqualTo(Short value) {
            addCriterion("mv_size <>", value, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeGreaterThan(Short value) {
            addCriterion("mv_size >", value, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeGreaterThanOrEqualTo(Short value) {
            addCriterion("mv_size >=", value, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeLessThan(Short value) {
            addCriterion("mv_size <", value, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeLessThanOrEqualTo(Short value) {
            addCriterion("mv_size <=", value, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeIn(List<Short> values) {
            addCriterion("mv_size in", values, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeNotIn(List<Short> values) {
            addCriterion("mv_size not in", values, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeBetween(Short value1, Short value2) {
            addCriterion("mv_size between", value1, value2, "mvSize");
            return (Criteria) this;
        }

        public Criteria andMvSizeNotBetween(Short value1, Short value2) {
            addCriterion("mv_size not between", value1, value2, "mvSize");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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