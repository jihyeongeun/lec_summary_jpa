package com.ohgiraffers.section05.compositekey.subsection02.idclass;

import java.io.Serializable;
import java.util.Objects;

/* 설명. IdClass 타입으로 쓰인 클래스도 1차 캐시에서 식별자로 쓰이는 객체이므로 e+h를 오버라이딩한다. */
public class MemberPK implements Serializable {
    private int memberNo;
    private String memberId;

    public MemberPK() {
    }

    public MemberPK(int memberNo, String memberId) {
        this.memberNo = memberNo;
        this.memberId = memberId;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "MemberPK{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                '}';
    }
}