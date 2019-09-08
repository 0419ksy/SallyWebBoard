package com.board.domain;

public class Member {

    int memNo;
    String memID; //varchar(15)인 부분을 어떻게 byte한정지을지
    String memName;
    String memPassword;

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public String getMemID() {
        return memID;
    }

    public void setMemID(String memID) {
        this.memID = memID;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPassword() {
        return memPassword;
    }

    public void setMemPassword(String memPassword) {
        this.memPassword = memPassword;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", memID='" + memID + '\'' +
                ", memName='" + memName + '\'' +
                ", memPassword='" + memPassword + '\'' +
                '}';
    }
}
