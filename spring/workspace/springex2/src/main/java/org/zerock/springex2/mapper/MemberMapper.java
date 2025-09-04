package org.zerock.springex2.mapper;

import org.zerock.springex2.vo.MemberVO;

public interface MemberMapper {
    void insertMember(MemberVO memberVO);
    MemberVO selectLogin(MemberVO memberVO);
    void deleteMember(String id);
    MemberVO selectMember(String id);
}
