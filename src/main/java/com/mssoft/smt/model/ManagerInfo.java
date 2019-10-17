package com.mssoft.smt.model;

public class ManagerInfo {
    private Integer mId;

    private String mNumber;

    private String mPassword;

    private String mInvitationCode;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber == null ? null : mNumber.trim();
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword == null ? null : mPassword.trim();
    }

    public String getmInvitationCode() {
        return mInvitationCode;
    }

    public void setmInvitationCode(String mInvitationCode) {
        this.mInvitationCode = mInvitationCode == null ? null : mInvitationCode.trim();
    }
}