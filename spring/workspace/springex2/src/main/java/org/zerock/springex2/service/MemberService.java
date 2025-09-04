package org.zerock.springex2.service;

import org.zerock.springex2.dto.MemberDTO;

public interface MemberService {
    void join(MemberDTO memberDTO);
    MemberDTO getMember(String id, String pw);
    void removeMember(String id);
    MemberDTO getOneMember(String id);
}
