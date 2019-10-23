package me.zhengjie.modules.wechat.entity;

import java.util.Date;

public class ServiceProgress {
    private Long progressId;

    private String serviceId;

    private String progressState;

    private Long progressUser;

    private Date progressTime;

    private String progressMemo;

    public Long getProgressId() {
        return progressId;
    }

    public void setProgressId(Long progressId) {
        this.progressId = progressId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getProgressState() {
        return progressState;
    }

    public void setProgressState(String progressState) {
        this.progressState = progressState == null ? null : progressState.trim();
    }

    public Long getProgressUser() {
        return progressUser;
    }

    public void setProgressUser(Long progressUser) {
        this.progressUser = progressUser;
    }

    public Date getProgressTime() {
        return progressTime;
    }

    public void setProgressTime(Date progressTime) {
        this.progressTime = progressTime;
    }

    public String getProgressMemo() {
        return progressMemo;
    }

    public void setProgressMemo(String progressMemo) {
        this.progressMemo = progressMemo == null ? null : progressMemo.trim();
    }
}