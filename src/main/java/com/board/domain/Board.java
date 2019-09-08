package com.board.domain;

import java.util.Date;

public class Board {

    int boardNo;
    String boardTitle;
    String boardContent;
    Date createDate;
    int memNo;
    int hits;

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardContent='" + boardContent + '\'' +
                ", createDate=" + createDate +
                ", memNo=" + memNo +
                ", hits=" + hits +
                '}';
    }
}
