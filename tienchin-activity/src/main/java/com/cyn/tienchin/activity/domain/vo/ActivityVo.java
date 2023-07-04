package com.cyn.tienchin.activity.domain.vo;

import com.cyn.tienchin.common.core.domain.BaseEntity;

import java.time.LocalDateTime;

/**
 * @author Godc
 * @description:
 * @date 2023/7/04/0004 15:27
 */
public class ActivityVo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 渠道id
     */
    private Integer channelId;

    /**
     * 活动简介
     */
    private String info;

    /**
     * 活动类型
     */
    private Byte type;

    /**
     * 折扣券
     */
    private Double discount;

    /**
     * 代金券
     */
    private Double voucher;

    /**
     * 活动状态 1正常 0禁用
     */
    private Byte status;

    /**
     * 活动开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 活动结束时间
     */
    private LocalDateTime endTime;

    /**
     * 逻辑删除字段 0未删除 2已删除
     */
    private String delFlag;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getVoucher() {
        return voucher;
    }

    public void setVoucher(Double voucher) {
        this.voucher = voucher;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

}