package org.zerock.springex2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.springex2.dto.MemberDTO;
import org.zerock.springex2.mapper.MemberMapper;
import org.zerock.springex2.vo.MemberVO;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
    @Override
    public void join(MemberDTO memberDTO) {
        MemberVO memberVO = MemberVO.builder()
                .id(memberDTO.getId())
                .pw(memberDTO.getPw())
                .email1(memberDTO.getEmail1())
                .email2(memberDTO.getEmail2())
                .build();
        memberMapper.insertMember(memberVO);
    }

    @Override
    public MemberDTO getMember(String id, String pw) {
        MemberVO memberVO = MemberVO.builder()
                .id(id)
                .pw(pw)
                .build();
        memberVO = memberMapper.selectLogin(memberVO);
        MemberDTO memberDTO = null;
        if (memberVO != null) {
            memberDTO = MemberDTO.builder()
                    .id(memberVO.getId())
                    .pw(memberVO.getPw())
                    .email1(memberVO.getEmail1())
                    .email2(memberVO.getEmail2())
                    .regidate(memberVO.getRegidate())
                    .build();
        }
        return memberDTO;
    }

    @Override
    public void removeMember(String id) {
        memberMapper.deleteMember(id);

    }

    @Override
    public MemberDTO getOneMember(String id) {
        MemberVO memberVO = memberMapper.selectMember(id);
         MemberDTO memberDTO= MemberDTO.builder()
                .id(memberVO.getId())
                 .pw(memberVO.getPw())
                 .email1(memberVO.getEmail1())
                 .email2(memberVO.getEmail2())
                 .regidate((memberVO.getRegidate()))
                .build();
        return memberDTO;
    }


}
